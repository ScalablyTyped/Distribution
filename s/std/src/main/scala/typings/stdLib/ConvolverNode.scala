package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvolverNode extends AudioNode {
  var buffer: AudioBuffer | scala.Null = js.native
  var normalize: scala.Boolean = js.native
}

@JSGlobal("ConvolverNode")
@js.native
class ConvolverNodeCls protected () extends ConvolverNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: ConvolverOptions) = this()
}

@JSGlobal("ConvolverNode")
@js.native
object ConvolverNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, ConvolverNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ ConvolverOptions, ConvolverNode]

