package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone. */
@js.native
trait OscillatorNode
  extends StObject
     with AudioScheduledSourceNode {
  
  val detune: AudioParam = js.native
  
  val frequency: AudioParam = js.native
  
  def setPeriodicWave(periodicWave: PeriodicWave): Unit = js.native
  
  var `type`: OscillatorType = js.native
}
