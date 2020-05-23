package typings.reactCalendarTimeline.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineHeadersProps extends js.Object {
  var calendarHeaderClassName: js.UndefOr[String] = js.undefined
  var calendarHeaderStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var headerRef: js.UndefOr[Ref[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TimelineHeadersProps {
  @scala.inline
  def apply(
    calendarHeaderClassName: String = null,
    calendarHeaderStyle: CSSProperties = null,
    className: String = null,
    headerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    style: CSSProperties = null
  ): TimelineHeadersProps = {
    val __obj = js.Dynamic.literal()
    if (calendarHeaderClassName != null) __obj.updateDynamic("calendarHeaderClassName")(calendarHeaderClassName.asInstanceOf[js.Any])
    if (calendarHeaderStyle != null) __obj.updateDynamic("calendarHeaderStyle")(calendarHeaderStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(headerRef)) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineHeadersProps]
  }
}

