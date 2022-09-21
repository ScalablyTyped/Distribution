package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers. */
@js.native
trait BiquadFilterNode
  extends StObject
     with AudioNode {
  
  /* standard dom */
  val Q: AudioParam = js.native
  
  /* standard dom */
  val detune: AudioParam = js.native
  
  /* standard dom */
  val frequency: AudioParam = js.native
  
  /* standard dom */
  val gain: AudioParam = js.native
  
  /* standard dom */
  def getFrequencyResponse(
    frequencyHz: js.typedarray.Float32Array,
    magResponse: js.typedarray.Float32Array,
    phaseResponse: js.typedarray.Float32Array
  ): Unit = js.native
  
  /* standard dom */
  var `type`: BiquadFilterType = js.native
}
