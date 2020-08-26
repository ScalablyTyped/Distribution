package typings.reactBigCalendar.mod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.Props
import typings.react.mod.SyntheticEvent
import typings.reactBigCalendar.anon.Accessors
import typings.reactBigCalendar.anon.Action
import typings.reactBigCalendar.anon.Start
import typings.reactBigCalendar.anon.X
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends Props[Calendar[TEvent, TResource]] {
  var allDayAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
  var className: js.UndefOr[String] = js.native
  var components: js.UndefOr[Components_[TEvent]] = js.native
  var culture: js.UndefOr[String] = js.native
  var date: js.UndefOr[stringOrDate] = js.native
  var dayLayoutAlgorithm: js.UndefOr[DayLayoutAlgorithm | DayLayoutFunction[TEvent]] = js.native
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.native
  var defaultDate: js.UndefOr[Date] = js.native
  var defaultView: js.UndefOr[View] = js.native
  var drilldownView: js.UndefOr[View | Null] = js.native
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.native
  var endAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])] = js.native
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.native
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  var formats: js.UndefOr[Formats] = js.native
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.native
  var getNow: js.UndefOr[js.Function0[Date]] = js.native
  var length: js.UndefOr[Double] = js.native
  var localizer: DateLocalizer = js.native
  var longPressThreshold: js.UndefOr[Double] = js.native
  var max: js.UndefOr[stringOrDate] = js.native
  var messages: js.UndefOr[Messages] = js.native
  var min: js.UndefOr[stringOrDate] = js.native
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.native
  var onDrillDown: js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]] = js.native
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ Date, /* view */ View, /* action */ NavigateAction, Unit]
  ] = js.native
  var onRangeChange: js.UndefOr[
    js.Function2[/* range */ js.Array[Date] | Start, /* view */ js.UndefOr[View], Unit]
  ] = js.native
  var onSelectEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.native
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]] = js.native
  var onSelecting: js.UndefOr[js.Function1[/* range */ Start, js.UndefOr[Boolean | Null]]] = js.native
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ Date, Unit]] = js.native
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.native
  var popup: js.UndefOr[Boolean] = js.native
  var popupOffset: js.UndefOr[Double | X] = js.native
  var resourceAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])] = js.native
  var resourceIdAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])] = js.native
  var resourceTitleAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])] = js.native
  var resources: js.UndefOr[js.Array[TResource]] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var scrollToTime: js.UndefOr[Date] = js.native
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.native
  var selected: js.UndefOr[js.Any] = js.native
  var showMultiDayTimes: js.UndefOr[Boolean] = js.native
  var slotGroupPropGetter: js.UndefOr[SlotGroupPropGetter] = js.native
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.native
  var startAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])] = js.native
  var step: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var timeslots: js.UndefOr[Double] = js.native
  var titleAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.native
  var toolbar: js.UndefOr[Boolean] = js.native
  var tooltipAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.native
  var view: js.UndefOr[View] = js.native
  var views: js.UndefOr[ViewsProps] = js.native
}

object CalendarProps {
  @scala.inline
  def apply[/* <: js.Object */ TEvent, /* <: js.Object */ TResource](localizer: DateLocalizer): CalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[TEvent, TResource]]
  }
  @scala.inline
  implicit class CalendarPropsOps[Self <: CalendarProps[_, _], /* <: js.Object */ TEvent, /* <: js.Object */ TResource] (val x: Self with (CalendarProps[TEvent, TResource])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocalizer(value: DateLocalizer): Self = this.set("localizer", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self = this.set("allDayAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = this.set("allDayAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDayAccessor: Self = this.set("allDayAccessor", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponents(value: Components_[TEvent]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    @scala.inline
    def setDate(value: stringOrDate): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDayLayoutAlgorithmFunction1(value: /* _ */ Accessors[TEvent] => js.Array[typings.reactBigCalendar.anon.Event[TEvent]]): Self = this.set("dayLayoutAlgorithm", js.Any.fromFunction1(value))
    @scala.inline
    def setDayLayoutAlgorithm(value: DayLayoutAlgorithm | DayLayoutFunction[TEvent]): Self = this.set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayLayoutAlgorithm: Self = this.set("dayLayoutAlgorithm", js.undefined)
    @scala.inline
    def setDayPropGetter(
      value: (/* date */ Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("dayPropGetter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDayPropGetter: Self = this.set("dayPropGetter", js.undefined)
    @scala.inline
    def setDefaultDate(value: Date): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    @scala.inline
    def setDefaultView(value: View): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultView: Self = this.set("defaultView", js.undefined)
    @scala.inline
    def setDrilldownView(value: View): Self = this.set("drilldownView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilldownView: Self = this.set("drilldownView", js.undefined)
    @scala.inline
    def setDrilldownViewNull: Self = this.set("drilldownView", null)
    @scala.inline
    def setElementProps(value: HTMLAttributes[HTMLElement]): Self = this.set("elementProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementProps: Self = this.set("elementProps", js.undefined)
    @scala.inline
    def setEndAccessorFunction1(value: /* event */ TEvent => Date): Self = this.set("endAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setEndAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])): Self = this.set("endAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAccessor: Self = this.set("endAccessor", js.undefined)
    @scala.inline
    def setEventPropGetter(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("eventPropGetter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteEventPropGetter: Self = this.set("eventPropGetter", js.undefined)
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setFormats(value: Formats): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    @scala.inline
    def setGetDrilldownView(
      value: (/* targetDate */ Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): Self = this.set("getDrilldownView", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetDrilldownView: Self = this.set("getDrilldownView", js.undefined)
    @scala.inline
    def setGetDrilldownViewNull: Self = this.set("getDrilldownView", null)
    @scala.inline
    def setGetNow(value: () => Date): Self = this.set("getNow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNow: Self = this.set("getNow", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLongPressThreshold(value: Double): Self = this.set("longPressThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongPressThreshold: Self = this.set("longPressThreshold", js.undefined)
    @scala.inline
    def setMax(value: stringOrDate): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMin(value: stringOrDate): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnDoubleClickEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = this.set("onDoubleClickEvent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDoubleClickEvent: Self = this.set("onDoubleClickEvent", js.undefined)
    @scala.inline
    def setOnDrillDown(value: (/* date */ Date, /* view */ View) => Unit): Self = this.set("onDrillDown", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDrillDown: Self = this.set("onDrillDown", js.undefined)
    @scala.inline
    def setOnNavigate(value: (/* newDate */ Date, /* view */ View, /* action */ NavigateAction) => Unit): Self = this.set("onNavigate", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNavigate: Self = this.set("onNavigate", js.undefined)
    @scala.inline
    def setOnRangeChange(value: (/* range */ js.Array[Date] | Start, /* view */ js.UndefOr[View]) => Unit): Self = this.set("onRangeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRangeChange: Self = this.set("onRangeChange", js.undefined)
    @scala.inline
    def setOnSelectEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = this.set("onSelectEvent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelectEvent: Self = this.set("onSelectEvent", js.undefined)
    @scala.inline
    def setOnSelectSlot(value: /* slotInfo */ Action => Unit): Self = this.set("onSelectSlot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectSlot: Self = this.set("onSelectSlot", js.undefined)
    @scala.inline
    def setOnSelecting(value: /* range */ Start => js.UndefOr[Boolean | Null]): Self = this.set("onSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelecting: Self = this.set("onSelecting", js.undefined)
    @scala.inline
    def setOnShowMore(value: (/* events */ js.Array[TEvent], /* date */ Date) => Unit): Self = this.set("onShowMore", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShowMore: Self = this.set("onShowMore", js.undefined)
    @scala.inline
    def setOnView(value: /* view */ View => Unit): Self = this.set("onView", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnView: Self = this.set("onView", js.undefined)
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setPopupOffset(value: Double | X): Self = this.set("popupOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupOffset: Self = this.set("popupOffset", js.undefined)
    @scala.inline
    def setResourceAccessorFunction1(value: /* event */ TEvent => _): Self = this.set("resourceAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setResourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])): Self = this.set("resourceAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAccessor: Self = this.set("resourceAccessor", js.undefined)
    @scala.inline
    def setResourceIdAccessorFunction1(value: /* resource */ TResource => _): Self = this.set("resourceIdAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setResourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self = this.set("resourceIdAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdAccessor: Self = this.set("resourceIdAccessor", js.undefined)
    @scala.inline
    def setResourceTitleAccessorFunction1(value: /* resource */ TResource => _): Self = this.set("resourceTitleAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setResourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self = this.set("resourceTitleAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTitleAccessor: Self = this.set("resourceTitleAccessor", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: TResource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[TResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setScrollToTime(value: Date): Self = this.set("scrollToTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToTime: Self = this.set("scrollToTime", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean | ignoreEvents): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: js.Any): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShowMultiDayTimes(value: Boolean): Self = this.set("showMultiDayTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMultiDayTimes: Self = this.set("showMultiDayTimes", js.undefined)
    @scala.inline
    def setSlotGroupPropGetter(value: () => HTMLAttributes[HTMLDivElement]): Self = this.set("slotGroupPropGetter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSlotGroupPropGetter: Self = this.set("slotGroupPropGetter", js.undefined)
    @scala.inline
    def setSlotPropGetter(
      value: (/* date */ Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("slotPropGetter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSlotPropGetter: Self = this.set("slotPropGetter", js.undefined)
    @scala.inline
    def setStartAccessorFunction1(value: /* event */ TEvent => Date): Self = this.set("startAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setStartAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])): Self = this.set("startAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAccessor: Self = this.set("startAccessor", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTimeslots(value: Double): Self = this.set("timeslots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeslots: Self = this.set("timeslots", js.undefined)
    @scala.inline
    def setTitleAccessorFunction1(value: /* event */ TEvent => String): Self = this.set("titleAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setTitleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = this.set("titleAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAccessor: Self = this.set("titleAccessor", js.undefined)
    @scala.inline
    def setToolbar(value: Boolean): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setTooltipAccessorFunction1(value: /* event */ TEvent => String): Self = this.set("tooltipAccessor", js.Any.fromFunction1(value))
    @scala.inline
    def setTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = this.set("tooltipAccessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipAccessor: Self = this.set("tooltipAccessor", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewsVarargs(value: View*): Self = this.set("views", js.Array(value :_*))
    @scala.inline
    def setViews(value: ViewsProps): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

