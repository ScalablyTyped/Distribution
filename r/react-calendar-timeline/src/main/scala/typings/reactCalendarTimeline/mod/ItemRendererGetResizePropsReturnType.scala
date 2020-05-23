package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRendererGetResizePropsReturnType extends js.Object {
  var left: js.UndefOr[ClassName] = js.undefined
  var right: js.UndefOr[ClassName] = js.undefined
}

object ItemRendererGetResizePropsReturnType {
  @scala.inline
  def apply(left: ClassName = null, right: ClassName = null): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
}

