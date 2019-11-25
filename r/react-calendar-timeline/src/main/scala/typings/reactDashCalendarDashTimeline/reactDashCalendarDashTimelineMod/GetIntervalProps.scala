package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntervalProps extends js.Object {
  var interval: js.UndefOr[Interval] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GetIntervalProps {
  @scala.inline
  def apply(
    interval: Interval = null,
    onClick: MouseEvent[Element, NativeMouseEvent] => scala.Unit = null,
    style: CSSProperties = null
  ): GetIntervalProps = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntervalProps]
  }
}

