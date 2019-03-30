package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The DelayNode interface represents a delay-line; an AudioNode audio-processing module that causes a delay between the arrival of an input data and its propagation to the output. */
@js.native
trait DelayNode extends AudioNode {
  val delayTime: AudioParam = js.native
}

@JSGlobal("DelayNode")
@js.native
class DelayNodeCls protected () extends DelayNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: DelayOptions) = this()
}

@JSGlobal("DelayNode")
@js.native
object DelayNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, DelayNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ DelayOptions, DelayNode]

