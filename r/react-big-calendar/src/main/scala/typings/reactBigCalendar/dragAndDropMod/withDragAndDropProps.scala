package typings.reactBigCalendar.dragAndDropMod

import typings.react.mod.DragEvent
import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.anon.AllDay
import typings.reactBigCalendar.anon.AllDayEnd
import typings.reactBigCalendar.anon.Direction
import typings.reactBigCalendar.mod.Components_
import typings.reactBigCalendar.reactBigCalendarBooleans.`false`
import typings.reactBigCalendar.reactBigCalendarBooleans.`true`
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait withDragAndDropProps[TEvent /* <: js.Object */] extends js.Object {
  var components: js.UndefOr[Components_[TEvent]] = js.undefined
  var dragFromOutsideItem: js.UndefOr[
    js.Function0[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])]
  ] = js.undefined
  var draggableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var onDragOver: js.UndefOr[js.Function1[/* event */ DragEvent[Element], Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* args */ Direction[TEvent], Unit]] = js.undefined
  var onDropFromOutside: js.UndefOr[js.Function1[/* args */ AllDayEnd, Unit]] = js.undefined
  var onEventDrop: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.undefined
  var onEventResize: js.UndefOr[js.Function1[/* args */ AllDay[TEvent], Unit]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resizableAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var selectable: js.UndefOr[`true` | `false` | ignoreEvents] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object withDragAndDropProps {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](
    components: Components_[TEvent] = null,
    dragFromOutsideItem: () => (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date]) = null,
    draggableAccessor: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean]) = null,
    elementProps: HTMLAttributes[HTMLElement] = null,
    onDragOver: /* event */ DragEvent[Element] => Unit = null,
    onDragStart: /* args */ Direction[TEvent] => Unit = null,
    onDropFromOutside: /* args */ AllDayEnd => Unit = null,
    onEventDrop: /* args */ AllDay[TEvent] => Unit = null,
    onEventResize: /* args */ AllDay[TEvent] => Unit = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resizableAccessor: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean]) = null,
    selectable: `true` | `false` | ignoreEvents = null,
    step: js.UndefOr[Double] = js.undefined
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
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.get.asInstanceOf[js.Any])
    if (resizableAccessor != null) __obj.updateDynamic("resizableAccessor")(resizableAccessor.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[withDragAndDropProps[TEvent]]
  }
}

