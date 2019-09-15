package typings.reactDashBigDashCalendar.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.Event
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.SyntheticEvent
import typings.reactDashBigDashCalendar.Anon_Action
import typings.reactDashBigDashCalendar.Anon_ClassName
import typings.reactDashBigDashCalendar.Anon_EndStart
import typings.reactDashBigDashCalendar.Anon_X
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.CalendarProps
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Components
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.DateLocalizer
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Formats
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Messages
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.NavigateAction
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.View
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.ViewsProps
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className */
object Calendar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Calendar[js.Any, js.Any]
    ] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Calendar[js.Any, js.Any]].asInstanceOf[String | js.Object]
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](
    localizer: DateLocalizer,
    allDayAccessor: String | (js.Function1[/* event */ TEvent, Boolean]) = null,
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
    length: Int | Double = null,
    longPressThreshold: Int | Double = null,
    max: stringOrDate = null,
    messages: Messages = null,
    min: stringOrDate = null,
    onDoubleClickEvent: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, Event]) => Unit = null,
    onDrillDown: (/* date */ Date, /* view */ View) => Unit = null,
    onNavigate: (/* newDate */ Date, /* view */ View, /* action */ NavigateAction) => Unit = null,
    onRangeChange: /* range */ js.Array[Date] | Anon_EndStart => Unit = null,
    onSelectEvent: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, Event]) => Unit = null,
    onSelectSlot: /* slotInfo */ Anon_Action => Unit = null,
    onSelecting: /* range */ Anon_EndStart => js.UndefOr[Boolean | Null] = null,
    onShowMore: (/* events */ js.Array[TEvent], /* date */ Date) => Unit = null,
    onView: /* view */ View => Unit = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    popupOffset: Double | Anon_X = null,
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
  ): BuildingComponent[
    tag.type, 
    typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Calendar[js.Any, js.Any]
  ] = {
    val __obj = js.Dynamic.literal(localizer = localizer)
    if (allDayAccessor != null) __obj.updateDynamic("allDayAccessor")(allDayAccessor.asInstanceOf[js.Any])
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
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.Calendar[js.Any, js.Any]]]
  }
  type Props = CalendarProps[js.Any, js.Any]
}

