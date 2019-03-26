package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveShaperNode extends AudioNode {
  var curve: Float32Array | scala.Null = js.native
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
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, WaveShaperNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ WaveShaperOptions, WaveShaperNode]

