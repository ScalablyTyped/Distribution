package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.reactDashBigDashCalendar.Anon_DayProp
import typings.reactDashBigDashCalendar.Anon_End
import typings.reactDashBigDashCalendar.Anon_XOffset
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWrapperProps[TEvent /* <: js.Object */] extends js.Object {
  var accessors: Anon_End[TEvent]
  var className: String
  var continuesEarlier: Boolean
  var continuesLater: Boolean
  var event: TEvent
  var getters: Anon_DayProp[TEvent]
  var isRtl: Boolean
  var label: String
  var selected: Boolean
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[CSSProperties with Anon_XOffset] = js.undefined
  def onClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
  def onDoubleClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object EventWrapperProps {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    accessors: Anon_End[TEvent],
    className: String,
    continuesEarlier: Boolean,
    continuesLater: Boolean,
    event: TEvent,
    getters: Anon_DayProp[TEvent],
    isRtl: Boolean,
    label: String,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    onDoubleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    selected: Boolean,
    style: CSSProperties with Anon_XOffset = null
  ): EventWrapperProps[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], continuesEarlier = continuesEarlier.asInstanceOf[js.Any], continuesLater = continuesLater.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), selected = selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWrapperProps[TEvent]]
  }
}

