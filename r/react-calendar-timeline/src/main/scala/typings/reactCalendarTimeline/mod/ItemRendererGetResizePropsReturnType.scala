package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRendererGetResizePropsReturnType extends js.Object {
  var left: js.UndefOr[AnonClassName] = js.undefined
  var right: js.UndefOr[AnonClassName] = js.undefined
}

object ItemRendererGetResizePropsReturnType {
  @scala.inline
  def apply(left: AnonClassName = null, right: AnonClassName = null): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
}

