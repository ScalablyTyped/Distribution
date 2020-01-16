package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.both
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItemBase[DateType] extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  var canMove: js.UndefOr[Boolean] = js.undefined
  var canResize: js.UndefOr[Boolean | left | right | both] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var end_time: DateType
  var group: Id
  var id: Id
  var itemProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  var start_time: DateType
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object TimelineItemBase {
  @scala.inline
  def apply[DateType](
    end_time: DateType,
    group: Id,
    id: Id,
    start_time: DateType,
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: Boolean | left | right | both = null,
    className: String = null,
    itemProps: HTMLAttributes[HTMLDivElement] = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): TimelineItemBase[DateType] = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove.asInstanceOf[js.Any])
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItemBase[DateType]]
  }
}

