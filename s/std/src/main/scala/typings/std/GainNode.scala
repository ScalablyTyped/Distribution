package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A change in volume. It is an AudioNode audio-processing module that causes a given gain to be applied to the input data before its propagation to the output. A GainNode always has exactly one input and one output, both with the same number of channels. */
@js.native
trait GainNode extends AudioNode {
  val gain: AudioParam = js.native
}

@JSGlobal("GainNode")
@js.native
class GainNodeCls protected () extends GainNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: GainOptions) = this()
}

@JSGlobal("GainNode")
@js.native
object GainNode
  extends Instantiable1[/* context */ BaseAudioContext, GainNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ GainOptions, GainNode]

