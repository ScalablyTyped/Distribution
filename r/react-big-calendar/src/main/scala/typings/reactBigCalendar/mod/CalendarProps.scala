package typings.reactBigCalendar.mod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.Props
import typings.react.mod.SyntheticEvent
import typings.reactBigCalendar.anon.Accessors
import typings.reactBigCalendar.anon.Action
import typings.reactBigCalendar.anon.End
import typings.reactBigCalendar.anon.X
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */]
  extends StObject
     with Props[Calendar[TEvent, TResource]] {
  
  var allDayAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var components: js.UndefOr[Components_[TEvent, TResource]] = js.undefined
  
  var culture: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[stringOrDate] = js.undefined
  
  var dayLayoutAlgorithm: js.UndefOr[DayLayoutAlgorithm | DayLayoutFunction[TEvent]] = js.undefined
  
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.undefined
  
  var defaultDate: js.UndefOr[Date] = js.undefined
  
  var defaultView: js.UndefOr[View] = js.undefined
  
  var drilldownView: js.UndefOr[View | Null] = js.undefined
  
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  
  var endAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])] = js.undefined
  
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
  
  var handleDragStart: js.UndefOr[js.Function1[/* event */ TEvent, Unit]] = js.undefined
  
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
  
  var onRangeChange: js.UndefOr[
    js.Function2[/* range */ js.Array[Date] | End, /* view */ js.UndefOr[View], Unit]
  ] = js.undefined
  
  var onSelectEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]] = js.undefined
  
  var onSelecting: js.UndefOr[js.Function1[/* range */ End, js.UndefOr[Boolean | Null]]] = js.undefined
  
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ Date, Unit]] = js.undefined
  
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  
  var popup: js.UndefOr[Boolean] = js.undefined
  
  var popupOffset: js.UndefOr[Double | X] = js.undefined
  
  var resourceAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Any])] = js.undefined
  
  var resourceIdAccessor: js.UndefOr[
    (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, js.Any])
  ] = js.undefined
  
  var resourceTitleAccessor: js.UndefOr[
    (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, js.Any])
  ] = js.undefined
  
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var scrollToTime: js.UndefOr[Date] = js.undefined
  
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.undefined
  
  var selected: js.UndefOr[js.Any] = js.undefined
  
  var showMultiDayTimes: js.UndefOr[Boolean] = js.undefined
  
  var slotGroupPropGetter: js.UndefOr[SlotGroupPropGetter] = js.undefined
  
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.undefined
  
  var startAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var timeslots: js.UndefOr[Double] = js.undefined
  
  var titleAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.undefined
  
  var toolbar: js.UndefOr[Boolean] = js.undefined
  
  var tooltipAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.undefined
  
  var view: js.UndefOr[View] = js.undefined
  
  var views: js.UndefOr[ViewsProps[TEvent, TResource]] = js.undefined
}
object CalendarProps {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](localizer: DateLocalizer): CalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class CalendarPropsMutableBuilder[Self <: CalendarProps[?, ?], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self & (CalendarProps[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def setAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "allDayAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "allDayAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllDayAccessorUndefined: Self = StObject.set(x, "allDayAccessor", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setComponents(value: Components_[TEvent, TResource]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    @scala.inline
    def setDate(value: stringOrDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDayLayoutAlgorithm(value: DayLayoutAlgorithm | DayLayoutFunction[TEvent]): Self = StObject.set(x, "dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayLayoutAlgorithmFunction1(value: /* _ */ Accessors[TEvent] => js.Array[typings.reactBigCalendar.anon.Event[TEvent]]): Self = StObject.set(x, "dayLayoutAlgorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDayLayoutAlgorithmUndefined: Self = StObject.set(x, "dayLayoutAlgorithm", js.undefined)
    
    @scala.inline
    def setDayPropGetter(
      value: (/* date */ Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "dayPropGetter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDayPropGetterUndefined: Self = StObject.set(x, "dayPropGetter", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    @scala.inline
    def setDefaultView(value: View): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
    
    @scala.inline
    def setDrilldownView(value: View): Self = StObject.set(x, "drilldownView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrilldownViewNull: Self = StObject.set(x, "drilldownView", null)
    
    @scala.inline
    def setDrilldownViewUndefined: Self = StObject.set(x, "drilldownView", js.undefined)
    
    @scala.inline
    def setElementProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPropsUndefined: Self = StObject.set(x, "elementProps", js.undefined)
    
    @scala.inline
    def setEndAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])): Self = StObject.set(x, "endAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAccessorFunction1(value: /* event */ TEvent => Date): Self = StObject.set(x, "endAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndAccessorUndefined: Self = StObject.set(x, "endAccessor", js.undefined)
    
    @scala.inline
    def setEventPropGetter(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "eventPropGetter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEventPropGetterUndefined: Self = StObject.set(x, "eventPropGetter", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setFormats(value: Formats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setGetDrilldownView(
      value: (/* targetDate */ Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): Self = StObject.set(x, "getDrilldownView", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetDrilldownViewNull: Self = StObject.set(x, "getDrilldownView", null)
    
    @scala.inline
    def setGetDrilldownViewUndefined: Self = StObject.set(x, "getDrilldownView", js.undefined)
    
    @scala.inline
    def setGetNow(value: () => Date): Self = StObject.set(x, "getNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNowUndefined: Self = StObject.set(x, "getNow", js.undefined)
    
    @scala.inline
    def setHandleDragStart(value: /* event */ TEvent => Unit): Self = StObject.set(x, "handleDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleDragStartUndefined: Self = StObject.set(x, "handleDragStart", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLocalizer(value: DateLocalizer): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPressThreshold(value: Double): Self = StObject.set(x, "longPressThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPressThresholdUndefined: Self = StObject.set(x, "longPressThreshold", js.undefined)
    
    @scala.inline
    def setMax(value: stringOrDate): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMin(value: stringOrDate): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOnDoubleClickEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onDoubleClickEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDoubleClickEventUndefined: Self = StObject.set(x, "onDoubleClickEvent", js.undefined)
    
    @scala.inline
    def setOnDrillDown(value: (/* date */ Date, /* view */ View) => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
    
    @scala.inline
    def setOnNavigate(value: (/* newDate */ Date, /* view */ View, /* action */ NavigateAction) => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
    
    @scala.inline
    def setOnRangeChange(value: (/* range */ js.Array[Date] | End, /* view */ js.UndefOr[View]) => Unit): Self = StObject.set(x, "onRangeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRangeChangeUndefined: Self = StObject.set(x, "onRangeChange", js.undefined)
    
    @scala.inline
    def setOnSelectEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onSelectEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectEventUndefined: Self = StObject.set(x, "onSelectEvent", js.undefined)
    
    @scala.inline
    def setOnSelectSlot(value: /* slotInfo */ Action => Unit): Self = StObject.set(x, "onSelectSlot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectSlotUndefined: Self = StObject.set(x, "onSelectSlot", js.undefined)
    
    @scala.inline
    def setOnSelecting(value: /* range */ End => js.UndefOr[Boolean | Null]): Self = StObject.set(x, "onSelecting", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectingUndefined: Self = StObject.set(x, "onSelecting", js.undefined)
    
    @scala.inline
    def setOnShowMore(value: (/* events */ js.Array[TEvent], /* date */ Date) => Unit): Self = StObject.set(x, "onShowMore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnShowMoreUndefined: Self = StObject.set(x, "onShowMore", js.undefined)
    
    @scala.inline
    def setOnView(value: /* view */ View => Unit): Self = StObject.set(x, "onView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewUndefined: Self = StObject.set(x, "onView", js.undefined)
    
    @scala.inline
    def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOffset(value: Double | X): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    @scala.inline
    def setResourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Any])): Self = StObject.set(x, "resourceAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAccessorFunction1(value: /* event */ TEvent => js.Any): Self = StObject.set(x, "resourceAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceAccessorUndefined: Self = StObject.set(x, "resourceAccessor", js.undefined)
    
    @scala.inline
    def setResourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, js.Any])): Self = StObject.set(x, "resourceIdAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdAccessorFunction1(value: /* resource */ TResource => js.Any): Self = StObject.set(x, "resourceIdAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceIdAccessorUndefined: Self = StObject.set(x, "resourceIdAccessor", js.undefined)
    
    @scala.inline
    def setResourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, js.Any])): Self = StObject.set(x, "resourceTitleAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTitleAccessorFunction1(value: /* resource */ TResource => js.Any): Self = StObject.set(x, "resourceTitleAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceTitleAccessorUndefined: Self = StObject.set(x, "resourceTitleAccessor", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[TResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: TResource*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setScrollToTime(value: Date): Self = StObject.set(x, "scrollToTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollToTimeUndefined: Self = StObject.set(x, "scrollToTime", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean | ignoreEvents): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShowMultiDayTimes(value: Boolean): Self = StObject.set(x, "showMultiDayTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMultiDayTimesUndefined: Self = StObject.set(x, "showMultiDayTimes", js.undefined)
    
    @scala.inline
    def setSlotGroupPropGetter(value: () => HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "slotGroupPropGetter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlotGroupPropGetterUndefined: Self = StObject.set(x, "slotGroupPropGetter", js.undefined)
    
    @scala.inline
    def setSlotPropGetter(
      value: (/* date */ Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "slotPropGetter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlotPropGetterUndefined: Self = StObject.set(x, "slotPropGetter", js.undefined)
    
    @scala.inline
    def setStartAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])): Self = StObject.set(x, "startAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAccessorFunction1(value: /* event */ TEvent => Date): Self = StObject.set(x, "startAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartAccessorUndefined: Self = StObject.set(x, "startAccessor", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTimeslots(value: Double): Self = StObject.set(x, "timeslots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeslotsUndefined: Self = StObject.set(x, "timeslots", js.undefined)
    
    @scala.inline
    def setTitleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = StObject.set(x, "titleAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleAccessorFunction1(value: /* event */ TEvent => String): Self = StObject.set(x, "titleAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleAccessorUndefined: Self = StObject.set(x, "titleAccessor", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = StObject.set(x, "tooltipAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipAccessorFunction1(value: /* event */ TEvent => String): Self = StObject.set(x, "tooltipAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipAccessorUndefined: Self = StObject.set(x, "tooltipAccessor", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setViews(value: ViewsProps[TEvent, TResource]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: View*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
