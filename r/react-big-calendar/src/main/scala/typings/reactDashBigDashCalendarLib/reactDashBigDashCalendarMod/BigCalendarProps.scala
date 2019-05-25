package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigCalendarProps[TEvent /* <: Event */, TResource /* <: js.Object */]
  extends reactLib.reactMod.Props[BigCalendar[TEvent, TResource]] {
  var allDayAccessor: js.UndefOr[java.lang.String | (js.Function1[/* event */ TEvent, scala.Boolean])] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var components: js.UndefOr[Components[TEvent]] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stringOrDate] = js.undefined
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.undefined
  var defaultDate: js.UndefOr[stdLib.Date] = js.undefined
  var defaultView: js.UndefOr[View] = js.undefined
  var drilldownView: js.UndefOr[View | scala.Null] = js.undefined
  var elementProps: js.UndefOr[reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement]] = js.undefined
  var endAccessor: js.UndefOr[java.lang.String | (js.Function1[/* event */ TEvent, stdLib.Date])] = js.undefined
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  var formats: js.UndefOr[Formats] = js.undefined
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ stdLib.Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var getNow: js.UndefOr[js.Function0[stdLib.Date]] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var localizer: DateLocalizer
  var longPressThreshold: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[stringOrDate] = js.undefined
  var messages: js.UndefOr[Messages] = js.undefined
  var min: js.UndefOr[stringOrDate] = js.undefined
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onDrillDown: js.UndefOr[js.Function2[/* date */ stdLib.Date, /* view */ View, scala.Unit]] = js.undefined
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ stdLib.Date, /* view */ View, /* action */ Navigate, scala.Unit]
  ] = js.undefined
  var onRangeChange: js.UndefOr[
    js.Function1[
      /* range */ js.Array[stdLib.Date | reactDashBigDashCalendarLib.Anon_EndStart], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelectEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ reactDashBigDashCalendarLib.Anon_Action, scala.Unit]] = js.undefined
  var onSelecting: js.UndefOr[
    js.Function1[
      /* range */ reactDashBigDashCalendarLib.Anon_EndStart, 
      js.UndefOr[scala.Boolean | scala.Null]
    ]
  ] = js.undefined
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ stdLib.Date, scala.Unit]] = js.undefined
  var onView: js.UndefOr[js.Function1[/* view */ View, scala.Unit]] = js.undefined
  var popup: js.UndefOr[scala.Boolean] = js.undefined
  var popupOffset: js.UndefOr[scala.Double | reactDashBigDashCalendarLib.Anon_X] = js.undefined
  var resourceAccessor: js.UndefOr[java.lang.String | (js.Function1[/* event */ TEvent, _])] = js.undefined
  var resourceIdAccessor: js.UndefOr[java.lang.String | (js.Function1[/* resource */ TResource, _])] = js.undefined
  var resourceTitleAccessor: js.UndefOr[java.lang.String | (js.Function1[/* resource */ TResource, java.lang.String])] = js.undefined
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var scrollToTime: js.UndefOr[stdLib.Date] = js.undefined
  var selectable: js.UndefOr[
    scala.Boolean | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.ignoreEvents
  ] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
  var showMultiDayTimes: js.UndefOr[scala.Boolean] = js.undefined
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.undefined
  var startAccessor: js.UndefOr[java.lang.String | (js.Function1[/* event */ TEvent, stdLib.Date])] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var timeslots: js.UndefOr[scala.Double] = js.undefined
  var titleAccessor: js.UndefOr[java.lang.String | (js.Function1[/* event */ TEvent, java.lang.String])] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var tooltipAccessor: js.UndefOr[java.lang.String | (js.Function1[/* event */ TEvent, java.lang.String])] = js.undefined
  var view: js.UndefOr[View] = js.undefined
  var views: js.UndefOr[Views] = js.undefined
}

object BigCalendarProps {
  @scala.inline
  def apply[TEvent /* <: Event */, TResource /* <: js.Object */](
    localizer: DateLocalizer,
    allDayAccessor: java.lang.String | (js.Function1[/* event */ TEvent, scala.Boolean]) = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    components: Components[TEvent] = null,
    culture: java.lang.String = null,
    date: stringOrDate = null,
    dayPropGetter: DayPropGetter = null,
    defaultDate: stdLib.Date = null,
    defaultView: View = null,
    drilldownView: View = null,
    elementProps: reactLib.reactMod.HTMLAttributes[stdLib.HTMLElement] = null,
    endAccessor: java.lang.String | (js.Function1[/* event */ TEvent, stdLib.Date]) = null,
    eventPropGetter: EventPropGetter[TEvent] = null,
    events: js.Array[TEvent] = null,
    formats: Formats = null,
    getDrilldownView: (/* targetDate */ stdLib.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => scala.Unit = null,
    getNow: () => stdLib.Date = null,
    key: reactLib.reactMod.Key = null,
    length: scala.Int | scala.Double = null,
    longPressThreshold: scala.Int | scala.Double = null,
    max: stringOrDate = null,
    messages: Messages = null,
    min: stringOrDate = null,
    onDoubleClickEvent: (/* event */ TEvent, /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]) => scala.Unit = null,
    onDrillDown: (/* date */ stdLib.Date, /* view */ View) => scala.Unit = null,
    onNavigate: (/* newDate */ stdLib.Date, /* view */ View, /* action */ Navigate) => scala.Unit = null,
    onRangeChange: /* range */ js.Array[stdLib.Date | reactDashBigDashCalendarLib.Anon_EndStart] => scala.Unit = null,
    onSelectEvent: (/* event */ TEvent, /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLElement, reactLib.Event]) => scala.Unit = null,
    onSelectSlot: /* slotInfo */ reactDashBigDashCalendarLib.Anon_Action => scala.Unit = null,
    onSelecting: /* range */ reactDashBigDashCalendarLib.Anon_EndStart => js.UndefOr[scala.Boolean | scala.Null] = null,
    onShowMore: (/* events */ js.Array[TEvent], /* date */ stdLib.Date) => scala.Unit = null,
    onView: /* view */ View => scala.Unit = null,
    popup: js.UndefOr[scala.Boolean] = js.undefined,
    popupOffset: scala.Double | reactDashBigDashCalendarLib.Anon_X = null,
    ref: reactLib.reactMod.LegacyRef[BigCalendar[TEvent, TResource]] = null,
    resourceAccessor: java.lang.String | (js.Function1[/* event */ TEvent, _]) = null,
    resourceIdAccessor: java.lang.String | (js.Function1[/* resource */ TResource, _]) = null,
    resourceTitleAccessor: java.lang.String | (js.Function1[/* resource */ TResource, java.lang.String]) = null,
    resources: js.Array[TResource] = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    scrollToTime: stdLib.Date = null,
    selectable: scala.Boolean | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.ignoreEvents = null,
    selected: js.Any = null,
    showMultiDayTimes: js.UndefOr[scala.Boolean] = js.undefined,
    slotPropGetter: SlotPropGetter = null,
    startAccessor: java.lang.String | (js.Function1[/* event */ TEvent, stdLib.Date]) = null,
    step: scala.Int | scala.Double = null,
    timeslots: scala.Int | scala.Double = null,
    titleAccessor: java.lang.String | (js.Function1[/* event */ TEvent, java.lang.String]) = null,
    toolbar: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipAccessor: java.lang.String | (js.Function1[/* event */ TEvent, java.lang.String]) = null,
    view: View = null,
    views: Views = null
  ): BigCalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer)
    if (allDayAccessor != null) __obj.updateDynamic("allDayAccessor")(allDayAccessor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (components != null) __obj.updateDynamic("components")(components)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayPropGetter != null) __obj.updateDynamic("dayPropGetter")(dayPropGetter)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView)
    if (drilldownView != null) __obj.updateDynamic("drilldownView")(drilldownView)
    if (elementProps != null) __obj.updateDynamic("elementProps")(elementProps)
    if (endAccessor != null) __obj.updateDynamic("endAccessor")(endAccessor.asInstanceOf[js.Any])
    if (eventPropGetter != null) __obj.updateDynamic("eventPropGetter")(eventPropGetter)
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
    if (slotPropGetter != null) __obj.updateDynamic("slotPropGetter")(slotPropGetter)
    if (startAccessor != null) __obj.updateDynamic("startAccessor")(startAccessor.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (timeslots != null) __obj.updateDynamic("timeslots")(timeslots.asInstanceOf[js.Any])
    if (titleAccessor != null) __obj.updateDynamic("titleAccessor")(titleAccessor.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar)
    if (tooltipAccessor != null) __obj.updateDynamic("tooltipAccessor")(tooltipAccessor.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigCalendarProps[TEvent, TResource]]
  }
}

