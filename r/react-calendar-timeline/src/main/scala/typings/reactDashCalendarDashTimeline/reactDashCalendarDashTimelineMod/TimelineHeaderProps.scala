package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineHeaderProps extends js.Object {
  var calendarHeaderClassName: js.UndefOr[String] = js.undefined
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var headerRef: js.UndefOr[Ref[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimelineHeaderProps {
  @scala.inline
  def apply(
    calendarHeaderClassName: String = null,
    calendarHeaderStyle: CSSProperties = null,
    className: String = null,
    headerRef: Ref[_] = null,
    style: CSSProperties = null
  ): TimelineHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (calendarHeaderClassName != null) __obj.updateDynamic("calendarHeaderClassName")(calendarHeaderClassName)
    if (calendarHeaderStyle != null) __obj.updateDynamic("calendarHeaderStyle")(calendarHeaderStyle)
    if (className != null) __obj.updateDynamic("className")(className)
    if (headerRef != null) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TimelineHeaderProps]
  }
}

