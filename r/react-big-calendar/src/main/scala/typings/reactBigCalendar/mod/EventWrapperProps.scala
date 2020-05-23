package typings.reactBigCalendar.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactBigCalendar.anon.CSSPropertiesxOffsetnumbe
import typings.reactBigCalendar.anon.DayProp
import typings.reactBigCalendar.anon.End
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventWrapperProps[TEvent /* <: js.Object */] extends js.Object {
  var accessors: End[TEvent]
  var className: String
  var continuesEarlier: Boolean
  var continuesLater: Boolean
  var event: TEvent
  var getters: DayProp[TEvent]
  var isRtl: Boolean
  var label: String
  var selected: Boolean
  // https://github.com/intljusticemission/react-big-calendar/blob/27a2656b40ac8729634d24376dff8ea781a66d50/src/TimeGridEvent.js#L28
  var style: js.UndefOr[CSSPropertiesxOffsetnumbe] = js.undefined
  def onClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
  def onDoubleClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object EventWrapperProps {
  @scala.inline
  def apply[TEvent](
    accessors: End[TEvent],
    className: String,
    continuesEarlier: Boolean,
    continuesLater: Boolean,
    event: TEvent,
    getters: DayProp[TEvent],
    isRtl: Boolean,
    label: String,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    onDoubleClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit,
    selected: Boolean,
    style: CSSPropertiesxOffsetnumbe = null
  ): EventWrapperProps[TEvent] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], continuesEarlier = continuesEarlier.asInstanceOf[js.Any], continuesLater = continuesLater.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onDoubleClick = js.Any.fromFunction1(onDoubleClick), selected = selected.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventWrapperProps[TEvent]]
  }
}

