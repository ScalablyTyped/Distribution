package typings.reactDashBigDashCalendar.libAddonsDragAndDropMod

import typings.react.reactMod.DragEvent
import typings.react.reactMod.HTMLAttributes
import typings.reactDashBigDashCalendar.Anon_ActionDOWN
import typings.reactDashBigDashCalendar.Anon_AllDay
import typings.reactDashBigDashCalendar.Anon_AllDayEnd
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Components
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarNumbers.`false`
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarNumbers.`true`
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withDragAndDropProps[TEvent /* <: js.Object */] extends js.Object {
  var components: js.UndefOr[Components[TEvent]] = js.undefined
  var dragFromOutsideItem: js.UndefOr[js.Function0[String | (js.Function1[/* event */ TEvent, Date])]] = js.undefined
  var draggableAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* args */ Anon_ActionDOWN[TEvent], Unit]] = js.undefined
  var onDropFromOutside: js.UndefOr[js.Function1[/* args */ Anon_AllDayEnd, Unit]] = js.undefined
  var onEventDrop: js.UndefOr[js.Function1[/* args */ Anon_AllDay[TEvent], Unit]] = js.undefined
  var onEventResize: js.UndefOr[js.Function1[/* args */ Anon_AllDay[TEvent], Unit]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resizableAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object withDragAndDropProps {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    components: Components[TEvent] = null,
    dragFromOutsideItem: () => String | (js.Function1[/* event */ TEvent, Date]) = null,
    draggableAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
    elementProps: HTMLAttributes[HTMLElement] = null,
    onDragOver: /* event */ DragEvent[Element] => Unit = null,
    onDragStart: /* args */ Anon_ActionDOWN[TEvent] => Unit = null,
    onDropFromOutside: /* args */ Anon_AllDayEnd => Unit = null,
    onEventDrop: /* args */ Anon_AllDay[TEvent] => Unit = null,
    onEventResize: /* args */ Anon_AllDay[TEvent] => Unit = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizableAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
    selectable: `true` | `false` | ignoreEvents = null,
    step: Int | Double = null
  ): withDragAndDropProps[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dragFromOutsideItem != null) __obj.updateDynamic("dragFromOutsideItem")(js.Any.fromFunction0(dragFromOutsideItem))
    if (draggableAccessor != null) __obj.updateDynamic("draggableAccessor")(draggableAccessor.asInstanceOf[js.Any])
    if (elementProps != null) __obj.updateDynamic("elementProps")(elementProps.asInstanceOf[js.Any])
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDropFromOutside != null) __obj.updateDynamic("onDropFromOutside")(js.Any.fromFunction1(onDropFromOutside))
    if (onEventDrop != null) __obj.updateDynamic("onEventDrop")(js.Any.fromFunction1(onEventDrop))
    if (onEventResize != null) __obj.updateDynamic("onEventResize")(js.Any.fromFunction1(onEventResize))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (resizableAccessor != null) __obj.updateDynamic("resizableAccessor")(resizableAccessor.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[withDragAndDropProps[TEvent]]
  }
}

