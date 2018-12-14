package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object BiquadFilterNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, BiquadFilterNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ BiquadFilterOptions, BiquadFilterNode]

