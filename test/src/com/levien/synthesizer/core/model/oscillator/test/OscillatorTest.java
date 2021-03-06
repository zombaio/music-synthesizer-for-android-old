/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.levien.synthesizer.core.model.oscillator.test;

import com.levien.synthesizer.core.model.SynthesisTime;
import com.levien.synthesizer.core.model.SynthesizerInput;
import com.levien.synthesizer.core.model.oscillator.Oscillator;

import junit.framework.TestCase;

public class OscillatorTest extends TestCase {
  public void testBasic() {
    SynthesisTime time = new SynthesisTime();
    time.setSampleRate(44100.0);
    final SynthesizerInput frequency = new SynthesizerInput(440.0, 0.0, 1.0);
    Oscillator osc = new Oscillator(frequency) {
      public double computeValue(SynthesisTime time) {
        assertEquals(frequency, frequency_);
        return 0.0;
      }
    };

    osc.getValue(time);
  }
}
