package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone. */
@js.native
trait OscillatorNode extends AudioScheduledSourceNode {
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  var `type`: OscillatorType = js.native
  def setPeriodicWave(periodicWave: PeriodicWave): Unit = js.native
}

@JSGlobal("OscillatorNode")
@js.native
object OscillatorNode
  extends Instantiable1[/* context */ BaseAudioContext, OscillatorNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ OscillatorOptions, OscillatorNode]

