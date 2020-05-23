package typings.reactPlotlyJs.anon

import typings.plotlyJs.anon.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.FrameAnimationEvent> */
trait ReadonlyFrameAnimationEve extends js.Object {
  val animation: Frame
  val frame: typings.plotlyJs.mod.Frame
  val name: String
}

object ReadonlyFrameAnimationEve {
  @scala.inline
  def apply(animation: Frame, frame: typings.plotlyJs.mod.Frame, name: String): ReadonlyFrameAnimationEve = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFrameAnimationEve]
  }
}

