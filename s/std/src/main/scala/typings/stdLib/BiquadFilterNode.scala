package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A simple low-order filter, and is created using the AudioContext.createBiquadFilter() method. It is an AudioNode that can represent different kinds of filters, tone control devices, and graphic equalizers. */
@js.native
trait BiquadFilterNode extends AudioNode {
  val Q: AudioParam = js.native
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  val gain: AudioParam = js.native
  var `type`: BiquadFilterType = js.native
  def getFrequencyResponse(frequencyHz: Float32Array, magResponse: Float32Array, phaseResponse: Float32Array): scala.Unit = js.native
}

@JSGlobal("BiquadFilterNode")
@js.native
class BiquadFilterNodeCls protected () extends BiquadFilterNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: BiquadFilterOptions) = this()
}

@JSGlobal("BiquadFilterNode")
@js.native
object BiquadFilterNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, BiquadFilterNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ BiquadFilterOptions, BiquadFilterNode]

