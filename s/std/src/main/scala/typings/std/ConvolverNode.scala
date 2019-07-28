package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An AudioNode that performs a Linear Convolution on a given AudioBuffer, often used to achieve a reverb effect. A ConvolverNode always has exactly one input and one output. */
@js.native
trait ConvolverNode extends AudioNode {
  var buffer: AudioBuffer | Null = js.native
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
  extends Instantiable1[/* context */ BaseAudioContext, ConvolverNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ ConvolverOptions, ConvolverNode]

