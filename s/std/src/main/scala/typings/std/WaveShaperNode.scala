package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A WaveShaperNode always has exactly one input and one output. */
@js.native
trait WaveShaperNode extends AudioNode {
  var curve: Float32Array | Null = js.native
  var oversample: OverSampleType = js.native
}

@JSGlobal("WaveShaperNode")
@js.native
class WaveShaperNodeCls protected () extends WaveShaperNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: WaveShaperOptions) = this()
}

@JSGlobal("WaveShaperNode")
@js.native
object WaveShaperNode
  extends Instantiable1[/* context */ BaseAudioContext, WaveShaperNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ WaveShaperOptions, WaveShaperNode]

