package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.reactDashBigDashCalendar.Anon_Action
import typings.reactDashBigDashCalendar.Anon_ClassName
import typings.reactDashBigDashCalendar.Anon_EndStart
import typings.reactDashBigDashCalendar.Anon_X
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends Props[Calendar[TEvent, TResource]] {
  var allDayAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var components: js.UndefOr[Components[TEvent]] = js.undefined
  var culture: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[stringOrDate] = js.undefined
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.undefined
  var defaultDate: js.UndefOr[Date] = js.undefined
  var defaultView: js.UndefOr[View] = js.undefined
  var drilldownView: js.UndefOr[View | Null] = js.undefined
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  var endAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Date])] = js.undefined
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  var formats: js.UndefOr[Formats] = js.undefined
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.undefined
  var getNow: js.UndefOr[js.Function0[Date]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var localizer: DateLocalizer
  var longPressThreshold: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[stringOrDate] = js.undefined
  var messages: js.UndefOr[Messages] = js.undefined
  var min: js.UndefOr[stringOrDate] = js.undefined
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  var onDrillDown: js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]] = js.undefined
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ Date, /* view */ View, /* action */ NavigateAction, Unit]
  ] = js.undefined
  var onRangeChange: js.UndefOr[js.Function1[/* range */ js.Array[Date] | Anon_EndStart, Unit]] = js.undefined
  var onSelectEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ Anon_Action, Unit]] = js.undefined
  var onSelecting: js.UndefOr[js.Function1[/* range */ Anon_EndStart, js.UndefOr[Boolean | Null]]] = js.undefined
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ Date, Unit]] = js.undefined
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  var popup: js.UndefOr[Boolean] = js.undefined
  var popupOffset: js.UndefOr[Double | Anon_X] = js.undefined
  var resourceAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, _])] = js.undefined
  var resourceIdAccessor: js.UndefOr[String | (js.Function1[/* resource */ TResource, _])] = js.undefined
  var resourceTitleAccessor: js.UndefOr[String | (js.Function1[/* resource */ TResource, _])] = js.undefined
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var scrollToTime: js.UndefOr[Date] = js.undefined
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
  var showMultiDayTimes: js.UndefOr[Boolean] = js.undefined
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.undefined
  var startAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, Date])] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var timeslots: js.UndefOr[Double] = js.undefined
  var titleAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, String])] = js.undefined
  var toolbar: js.UndefOr[Boolean] = js.undefined
  var tooltipAccessor: js.UndefOr[String | (js.Function1[/* event */ TEvent, String])] = js.undefined
  var view: js.UndefOr[View] = js.undefined
  var views: js.UndefOr[ViewsProps] = js.undefined
}

object CalendarProps {
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](
    localizer: DateLocalizer,
    allDayAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
    children: ReactNode = null,
    className: String = null,
    components: Components[TEvent] = null,
    culture: String = null,
    date: stringOrDate = null,
    dayPropGetter: /* date */ Date => Anon_ClassName = null,
    defaultDate: Date = null,
    defaultView: View = null,
    drilldownView: View = null,
    elementProps: HTMLAttributes[HTMLElement] = null,
    endAccessor: String | (js.Function1[/* event */ TEvent, Date]) = null,
    eventPropGetter: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => Anon_ClassName = null,
    events: js.Array[TEvent] = null,
    formats: Formats = null,
    getDrilldownView: (/* targetDate */ Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit = null,
    getNow: () => Date = null,
    key: Key = null,
    length: Int | Double = null,
    longPressThreshold: Int | Double = null,
    max: stringOrDate = null,
    messages: Messages = null,
    min: stringOrDate = null,
    onDoubleClickEvent: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit = null,
    onDrillDown: (/* date */ Date, /* view */ View) => Unit = null,
    onNavigate: (/* newDate */ Date, /* view */ View, /* action */ NavigateAction) => Unit = null,
    onRangeChange: /* range */ js.Array[Date] | Anon_EndStart => Unit = null,
    onSelectEvent: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit = null,
    onSelectSlot: /* slotInfo */ Anon_Action => Unit = null,
    onSelecting: /* range */ Anon_EndStart => js.UndefOr[Boolean | Null] = null,
    onShowMore: (/* events */ js.Array[TEvent], /* date */ Date) => Unit = null,
    onView: /* view */ View => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    popupOffset: Double | Anon_X = null,
    ref: LegacyRef[Calendar[TEvent, TResource]] = null,
    resourceAccessor: String | (js.Function1[/* event */ TEvent, _]) = null,
    resourceIdAccessor: String | (js.Function1[/* resource */ TResource, _]) = null,
    resourceTitleAccessor: String | (js.Function1[/* resource */ TResource, _]) = null,
    resources: js.Array[TResource] = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    scrollToTime: Date = null,
    selectable: Boolean | ignoreEvents = null,
    selected: js.Any = null,
    showMultiDayTimes: js.UndefOr[Boolean] = js.undefined,
    slotPropGetter: /* date */ Date => Anon_ClassName = null,
    startAccessor: String | (js.Function1[/* event */ TEvent, Date]) = null,
    step: Int | Double = null,
    timeslots: Int | Double = null,
    titleAccessor: String | (js.Function1[/* event */ TEvent, String]) = null,
    toolbar: js.UndefOr[Boolean] = js.undefined,
    tooltipAccessor: String | (js.Function1[/* event */ TEvent, String]) = null,
    view: View = null,
    views: ViewsProps = null
  ): CalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer)
    if (allDayAccessor != null) __obj.updateDynamic("allDayAccessor")(allDayAccessor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (components != null) __obj.updateDynamic("components")(components)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayPropGetter != null) __obj.updateDynamic("dayPropGetter")(js.Any.fromFunction1(dayPropGetter))
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView)
    if (drilldownView != null) __obj.updateDynamic("drilldownView")(drilldownView)
    if (elementProps != null) __obj.updateDynamic("elementProps")(elementProps)
    if (endAccessor != null) __obj.updateDynamic("endAccessor")(endAccessor.asInstanceOf[js.Any])
    if (eventPropGetter != null) __obj.updateDynamic("eventPropGetter")(js.Any.fromFunction4(eventPropGetter))
    if (events != null) __obj.updateDynamic("events")(events)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (getDrilldownView != null) __obj.updateDynamic("getDrilldownView")(js.Any.fromFunction3(getDrilldownView))
    if (getNow != null) __obj.updateDynamic("getNow")(js.Any.fromFunction0(getNow))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (longPressThreshold != null) __obj.updateDynamic("longPressThreshold")(longPressThreshold.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onDoubleClickEvent != null) __obj.updateDynamic("onDoubleClickEvent")(js.Any.fromFunction2(onDoubleClickEvent))
    if (onDrillDown != null) __obj.updateDynamic("onDrillDown")(js.Any.fromFunction2(onDrillDown))
    if (onNavigate != null) __obj.updateDynamic("onNavigate")(js.Any.fromFunction3(onNavigate))
    if (onRangeChange != null) __obj.updateDynamic("onRangeChange")(js.Any.fromFunction1(onRangeChange))
    if (onSelectEvent != null) __obj.updateDynamic("onSelectEvent")(js.Any.fromFunction2(onSelectEvent))
    if (onSelectSlot != null) __obj.updateDynamic("onSelectSlot")(js.Any.fromFunction1(onSelectSlot))
    if (onSelecting != null) __obj.updateDynamic("onSelecting")(js.Any.fromFunction1(onSelecting))
    if (onShowMore != null) __obj.updateDynamic("onShowMore")(js.Any.fromFunction2(onShowMore))
    if (onView != null) __obj.updateDynamic("onView")(js.Any.fromFunction1(onView))
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (resourceAccessor != null) __obj.updateDynamic("resourceAccessor")(resourceAccessor.asInstanceOf[js.Any])
    if (resourceIdAccessor != null) __obj.updateDynamic("resourceIdAccessor")(resourceIdAccessor.asInstanceOf[js.Any])
    if (resourceTitleAccessor != null) __obj.updateDynamic("resourceTitleAccessor")(resourceTitleAccessor.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (scrollToTime != null) __obj.updateDynamic("scrollToTime")(scrollToTime)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(showMultiDayTimes)) __obj.updateDynamic("showMultiDayTimes")(showMultiDayTimes)
    if (slotPropGetter != null) __obj.updateDynamic("slotPropGetter")(js.Any.fromFunction1(slotPropGetter))
    if (startAccessor != null) __obj.updateDynamic("startAccessor")(startAccessor.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (timeslots != null) __obj.updateDynamic("timeslots")(timeslots.asInstanceOf[js.Any])
    if (titleAccessor != null) __obj.updateDynamic("titleAccessor")(titleAccessor.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (tooltipAccessor != null) __obj.updateDynamic("tooltipAccessor")(tooltipAccessor.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[TEvent, TResource]]
  }
}

