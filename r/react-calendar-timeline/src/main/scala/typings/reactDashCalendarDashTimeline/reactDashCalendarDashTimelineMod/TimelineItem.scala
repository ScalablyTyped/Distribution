package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.ReactNode
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.both
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  var canMove: js.UndefOr[Boolean] = js.undefined
  var canResize: js.UndefOr[Boolean | left | right | both] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var end_time: js.Any
  var group: Double
  var id: Double
  var itemProps: js.UndefOr[js.Object] = js.undefined
  var start_time: js.Any
  var title: js.UndefOr[ReactNode] = js.undefined
}

object TimelineItem {
  @scala.inline
  def apply(
    end_time: js.Any,
    group: Double,
    id: Double,
    start_time: js.Any,
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: Boolean | left | right | both = null,
    className: String = null,
    itemProps: js.Object = null,
    title: ReactNode = null
  ): TimelineItem = {
    val __obj = js.Dynamic.literal(end_time = end_time, group = group, id = id, start_time = start_time)
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup)
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove)
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItem]
  }
}

