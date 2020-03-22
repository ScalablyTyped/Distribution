package typings.reactPlotlyJs

import typings.plotlyJs.AnonFrame
import typings.plotlyJs.mod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.FrameAnimationEvent> */
trait ReadonlyFrameAnimationEve extends js.Object {
  val animation: AnonFrame
  val frame: Frame
  val name: String
}

object ReadonlyFrameAnimationEve {
  @scala.inline
  def apply(animation: AnonFrame, frame: Frame, name: String): ReadonlyFrameAnimationEve = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyFrameAnimationEve]
  }
}

