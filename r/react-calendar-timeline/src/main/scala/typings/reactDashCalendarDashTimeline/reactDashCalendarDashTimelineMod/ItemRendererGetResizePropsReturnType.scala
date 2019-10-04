package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.Anon_ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemRendererGetResizePropsReturnType extends js.Object {
  var left: js.UndefOr[Anon_ClassName] = js.undefined
  var right: js.UndefOr[Anon_ClassName] = js.undefined
}

object ItemRendererGetResizePropsReturnType {
  @scala.inline
  def apply(left: Anon_ClassName = null, right: Anon_ClassName = null): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
}

