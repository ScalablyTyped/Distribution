package typings
package reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  var canChangeGroup: js.UndefOr[scala.Boolean] = js.undefined
  var canMove: js.UndefOr[scala.Boolean] = js.undefined
  var canResize: js.UndefOr[
    scala.Boolean | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.both
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var end_time: js.Any
  var group: scala.Double
  var id: scala.Double
  var itemProps: js.UndefOr[js.Object] = js.undefined
  var start_time: js.Any
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object TimelineItem {
  @scala.inline
  def apply(
    end_time: js.Any,
    group: scala.Double,
    id: scala.Double,
    start_time: js.Any,
    canChangeGroup: js.UndefOr[scala.Boolean] = js.undefined,
    canMove: js.UndefOr[scala.Boolean] = js.undefined,
    canResize: scala.Boolean | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.left | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.right | reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineLibStrings.both = null,
    className: java.lang.String = null,
    itemProps: js.Object = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null
  ): TimelineItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end_time")(end_time)
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("start_time")(start_time)
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup)
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove)
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItem]
  }
}

