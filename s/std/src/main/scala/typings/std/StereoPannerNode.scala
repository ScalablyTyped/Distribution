package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The pan property takes a unitless value between -1 (full left pan) and 1 (full right pan). This interface was introduced as a much simpler way to apply a simple panning effect than having to use a full PannerNode. */
@js.native
trait StereoPannerNode extends AudioNode {
  val pan: AudioParam = js.native
}

@JSGlobal("StereoPannerNode")
@js.native
class StereoPannerNodeCls protected () extends StereoPannerNode {
  def this(context: BaseAudioContext) = this()
  def this(context: BaseAudioContext, options: StereoPannerOptions) = this()
}

@JSGlobal("StereoPannerNode")
@js.native
object StereoPannerNode
  extends Instantiable1[/* context */ BaseAudioContext, StereoPannerNode]
     with Instantiable2[/* context */ BaseAudioContext, /* options */ StereoPannerOptions, StereoPannerNode]

