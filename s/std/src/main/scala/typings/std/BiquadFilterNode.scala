package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode)
  */
@js.native
trait BiquadFilterNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/Q) */
  /* standard dom */
  val Q: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/detune) */
  /* standard dom */
  val detune: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/frequency) */
  /* standard dom */
  val frequency: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/gain) */
  /* standard dom */
  val gain: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/getFrequencyResponse) */
  /* standard dom */
  def getFrequencyResponse(
    frequencyHz: js.typedarray.Float32Array,
    magResponse: js.typedarray.Float32Array,
    phaseResponse: js.typedarray.Float32Array
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BiquadFilterNode/type) */
  /* standard dom */
  var `type`: BiquadFilterType = js.native
}
