package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The OscillatorNode interface represents a periodic waveform, such as a sine wave. It is an AudioScheduledSourceNode audio-processing module that causes a specified frequency of a given wave to be created—in effect, a constant tone.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode)
  */
@js.native
trait OscillatorNode
  extends StObject
     with AudioScheduledSourceNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/detune) */
  /* standard dom */
  val detune: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/frequency) */
  /* standard dom */
  val frequency: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/setPeriodicWave) */
  /* standard dom */
  def setPeriodicWave(periodicWave: PeriodicWave): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OscillatorNode/type) */
  /* standard dom */
  var `type`: OscillatorType = js.native
}
