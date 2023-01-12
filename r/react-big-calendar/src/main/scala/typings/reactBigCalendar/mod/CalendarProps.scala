package typings.reactBigCalendar.mod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.reactBigCalendar.anon.Accessors
import typings.reactBigCalendar.anon.ClassName
import typings.reactBigCalendar.anon.End
import typings.reactBigCalendar.anon.X
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
  var allDayAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.undefined
  
  var backgroundEvents: js.UndefOr[js.Array[TEvent]] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var components: js.UndefOr[Components_[TEvent, TResource]] = js.undefined
  
  var culture: js.UndefOr[Culture] = js.undefined
  
  var date: js.UndefOr[stringOrDate] = js.undefined
  
  var dayLayoutAlgorithm: js.UndefOr[DayLayoutAlgorithm | DayLayoutFunction[TEvent]] = js.undefined
  
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.undefined
  
  var defaultDate: js.UndefOr[stringOrDate] = js.undefined
  
  var defaultView: js.UndefOr[View] = js.undefined
  
  var doShowMoreDrillDown: js.UndefOr[Boolean] = js.undefined
  
  var drilldownView: js.UndefOr[View | Null] = js.undefined
  
  var elementProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  
  var enableAutoScroll: js.UndefOr[Boolean] = js.undefined
  
  var endAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])] = js.undefined
  
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  
  var formats: js.UndefOr[Formats] = js.undefined
  
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ js.Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.undefined
  
  var getNow: js.UndefOr[js.Function0[js.UndefOr[stringOrDate]]] = js.undefined
  
  var handleDragStart: js.UndefOr[js.Function1[/* event */ TEvent, Unit]] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var localizer: DateLocalizer
  
  var longPressThreshold: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var messages: js.UndefOr[Messages] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onDrillDown: js.UndefOr[js.Function2[/* date */ js.Date, /* view */ View, Unit]] = js.undefined
  
  var onKeyPressEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction, Unit]
  ] = js.undefined
  
  var onRangeChange: js.UndefOr[
    js.Function2[/* range */ js.Array[js.Date] | End, /* view */ js.UndefOr[View], js.UndefOr[Unit]]
  ] = js.undefined
  
  var onSelectEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ SlotInfo, Unit]] = js.undefined
  
  var onSelecting: js.UndefOr[js.Function1[/* range */ End, js.UndefOr[Boolean]]] = js.undefined
  
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ js.Date, Unit]] = js.undefined
  
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  
  var popup: js.UndefOr[Boolean] = js.undefined
  
  var popupOffset: js.UndefOr[Double | X] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[Calendar[TEvent, TResource]]] = js.undefined
  
  var resourceAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Any])] = js.undefined
  
  var resourceIdAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, Any])] = js.undefined
  
  var resourceTitleAccessor: js.UndefOr[(/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, Any])] = js.undefined
  
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var scrollToTime: js.UndefOr[js.Date] = js.undefined
  
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.undefined
  
  var selected: js.UndefOr[Any] = js.undefined
  
  var showAllEvents: js.UndefOr[Boolean] = js.undefined
  
  var showMultiDayTimes: js.UndefOr[Boolean] = js.undefined
  
  var slotGroupPropGetter: js.UndefOr[SlotGroupPropGetter] = js.undefined
  
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.undefined
  
  var startAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])] = js.undefined
  
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
  
  inline def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](localizer: DateLocalizer): CalendarProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProps[TEvent, TResource]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarProps[?, ?], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self & (CalendarProps[TEvent, TResource])) extends AnyVal {
    
    inline def setAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "allDayAccessor", value.asInstanceOf[js.Any])
    
    inline def setAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "allDayAccessor", js.Any.fromFunction1(value))
    
    inline def setAllDayAccessorUndefined: Self = StObject.set(x, "allDayAccessor", js.undefined)
    
    inline def setBackgroundEvents(value: js.Array[TEvent]): Self = StObject.set(x, "backgroundEvents", value.asInstanceOf[js.Any])
    
    inline def setBackgroundEventsUndefined: Self = StObject.set(x, "backgroundEvents", js.undefined)
    
    inline def setBackgroundEventsVarargs(value: TEvent*): Self = StObject.set(x, "backgroundEvents", js.Array(value*))
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setComponents(value: Components_[TEvent, TResource]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setCulture(value: Culture): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
    
    inline def setDate(value: stringOrDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDayLayoutAlgorithm(value: DayLayoutAlgorithm | DayLayoutFunction[TEvent]): Self = StObject.set(x, "dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDayLayoutAlgorithmFunction1(value: /* _ */ Accessors[TEvent] => js.Array[typings.reactBigCalendar.anon.Event[TEvent]]): Self = StObject.set(x, "dayLayoutAlgorithm", js.Any.fromFunction1(value))
    
    inline def setDayLayoutAlgorithmUndefined: Self = StObject.set(x, "dayLayoutAlgorithm", js.undefined)
    
    inline def setDayPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "dayPropGetter", js.Any.fromFunction2(value))
    
    inline def setDayPropGetterUndefined: Self = StObject.set(x, "dayPropGetter", js.undefined)
    
    inline def setDefaultDate(value: stringOrDate): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    inline def setDefaultView(value: View): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
    
    inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
    
    inline def setDoShowMoreDrillDown(value: Boolean): Self = StObject.set(x, "doShowMoreDrillDown", value.asInstanceOf[js.Any])
    
    inline def setDoShowMoreDrillDownUndefined: Self = StObject.set(x, "doShowMoreDrillDown", js.undefined)
    
    inline def setDrilldownView(value: View): Self = StObject.set(x, "drilldownView", value.asInstanceOf[js.Any])
    
    inline def setDrilldownViewNull: Self = StObject.set(x, "drilldownView", null)
    
    inline def setDrilldownViewUndefined: Self = StObject.set(x, "drilldownView", js.undefined)
    
    inline def setElementProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
    
    inline def setElementPropsUndefined: Self = StObject.set(x, "elementProps", js.undefined)
    
    inline def setEnableAutoScroll(value: Boolean): Self = StObject.set(x, "enableAutoScroll", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoScrollUndefined: Self = StObject.set(x, "enableAutoScroll", js.undefined)
    
    inline def setEndAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self = StObject.set(x, "endAccessor", value.asInstanceOf[js.Any])
    
    inline def setEndAccessorFunction1(value: /* event */ TEvent => js.Date): Self = StObject.set(x, "endAccessor", js.Any.fromFunction1(value))
    
    inline def setEndAccessorUndefined: Self = StObject.set(x, "endAccessor", js.undefined)
    
    inline def setEventPropGetter(value: (TEvent, /* start */ js.Date, /* end */ js.Date, /* isSelected */ Boolean) => ClassName): Self = StObject.set(x, "eventPropGetter", js.Any.fromFunction4(value))
    
    inline def setEventPropGetterUndefined: Self = StObject.set(x, "eventPropGetter", js.undefined)
    
    inline def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFormats(value: Formats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setGetDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): Self = StObject.set(x, "getDrilldownView", js.Any.fromFunction3(value))
    
    inline def setGetDrilldownViewNull: Self = StObject.set(x, "getDrilldownView", null)
    
    inline def setGetDrilldownViewUndefined: Self = StObject.set(x, "getDrilldownView", js.undefined)
    
    inline def setGetNow(value: () => js.UndefOr[stringOrDate]): Self = StObject.set(x, "getNow", js.Any.fromFunction0(value))
    
    inline def setGetNowUndefined: Self = StObject.set(x, "getNow", js.undefined)
    
    inline def setHandleDragStart(value: /* event */ TEvent => Unit): Self = StObject.set(x, "handleDragStart", js.Any.fromFunction1(value))
    
    inline def setHandleDragStartUndefined: Self = StObject.set(x, "handleDragStart", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setLocalizer(value: DateLocalizer): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    inline def setLongPressThreshold(value: Double): Self = StObject.set(x, "longPressThreshold", value.asInstanceOf[js.Any])
    
    inline def setLongPressThresholdUndefined: Self = StObject.set(x, "longPressThreshold", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOnDoubleClickEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onDoubleClickEvent", js.Any.fromFunction2(value))
    
    inline def setOnDoubleClickEventUndefined: Self = StObject.set(x, "onDoubleClickEvent", js.undefined)
    
    inline def setOnDrillDown(value: (/* date */ js.Date, /* view */ View) => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction2(value))
    
    inline def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
    
    inline def setOnKeyPressEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onKeyPressEvent", js.Any.fromFunction2(value))
    
    inline def setOnKeyPressEventUndefined: Self = StObject.set(x, "onKeyPressEvent", js.undefined)
    
    inline def setOnNavigate(value: (/* newDate */ js.Date, /* view */ View, /* action */ NavigateAction) => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction3(value))
    
    inline def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
    
    inline def setOnRangeChange(value: (/* range */ js.Array[js.Date] | End, /* view */ js.UndefOr[View]) => js.UndefOr[Unit]): Self = StObject.set(x, "onRangeChange", js.Any.fromFunction2(value))
    
    inline def setOnRangeChangeUndefined: Self = StObject.set(x, "onRangeChange", js.undefined)
    
    inline def setOnSelectEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onSelectEvent", js.Any.fromFunction2(value))
    
    inline def setOnSelectEventUndefined: Self = StObject.set(x, "onSelectEvent", js.undefined)
    
    inline def setOnSelectSlot(value: /* slotInfo */ SlotInfo => Unit): Self = StObject.set(x, "onSelectSlot", js.Any.fromFunction1(value))
    
    inline def setOnSelectSlotUndefined: Self = StObject.set(x, "onSelectSlot", js.undefined)
    
    inline def setOnSelecting(value: /* range */ End => js.UndefOr[Boolean]): Self = StObject.set(x, "onSelecting", js.Any.fromFunction1(value))
    
    inline def setOnSelectingUndefined: Self = StObject.set(x, "onSelecting", js.undefined)
    
    inline def setOnShowMore(value: (/* events */ js.Array[TEvent], /* date */ js.Date) => Unit): Self = StObject.set(x, "onShowMore", js.Any.fromFunction2(value))
    
    inline def setOnShowMoreUndefined: Self = StObject.set(x, "onShowMore", js.undefined)
    
    inline def setOnView(value: /* view */ View => Unit): Self = StObject.set(x, "onView", js.Any.fromFunction1(value))
    
    inline def setOnViewUndefined: Self = StObject.set(x, "onView", js.undefined)
    
    inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupOffset(value: Double | X): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
    
    inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setRef(value: LegacyRef[Calendar[TEvent, TResource]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (Calendar[TEvent, TResource]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setResourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Any])): Self = StObject.set(x, "resourceAccessor", value.asInstanceOf[js.Any])
    
    inline def setResourceAccessorFunction1(value: /* event */ TEvent => Any): Self = StObject.set(x, "resourceAccessor", js.Any.fromFunction1(value))
    
    inline def setResourceAccessorUndefined: Self = StObject.set(x, "resourceAccessor", js.undefined)
    
    inline def setResourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, Any])): Self = StObject.set(x, "resourceIdAccessor", value.asInstanceOf[js.Any])
    
    inline def setResourceIdAccessorFunction1(value: /* resource */ TResource => Any): Self = StObject.set(x, "resourceIdAccessor", js.Any.fromFunction1(value))
    
    inline def setResourceIdAccessorUndefined: Self = StObject.set(x, "resourceIdAccessor", js.undefined)
    
    inline def setResourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, Any])): Self = StObject.set(x, "resourceTitleAccessor", value.asInstanceOf[js.Any])
    
    inline def setResourceTitleAccessorFunction1(value: /* resource */ TResource => Any): Self = StObject.set(x, "resourceTitleAccessor", js.Any.fromFunction1(value))
    
    inline def setResourceTitleAccessorUndefined: Self = StObject.set(x, "resourceTitleAccessor", js.undefined)
    
    inline def setResources(value: js.Array[TResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: TResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setScrollToTime(value: js.Date): Self = StObject.set(x, "scrollToTime", value.asInstanceOf[js.Any])
    
    inline def setScrollToTimeUndefined: Self = StObject.set(x, "scrollToTime", js.undefined)
    
    inline def setSelectable(value: Boolean | ignoreEvents): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowAllEvents(value: Boolean): Self = StObject.set(x, "showAllEvents", value.asInstanceOf[js.Any])
    
    inline def setShowAllEventsUndefined: Self = StObject.set(x, "showAllEvents", js.undefined)
    
    inline def setShowMultiDayTimes(value: Boolean): Self = StObject.set(x, "showMultiDayTimes", value.asInstanceOf[js.Any])
    
    inline def setShowMultiDayTimesUndefined: Self = StObject.set(x, "showMultiDayTimes", js.undefined)
    
    inline def setSlotGroupPropGetter(value: () => HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "slotGroupPropGetter", js.Any.fromFunction0(value))
    
    inline def setSlotGroupPropGetterUndefined: Self = StObject.set(x, "slotGroupPropGetter", js.undefined)
    
    inline def setSlotPropGetter(
      value: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "slotPropGetter", js.Any.fromFunction2(value))
    
    inline def setSlotPropGetterUndefined: Self = StObject.set(x, "slotPropGetter", js.undefined)
    
    inline def setStartAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, js.Date])): Self = StObject.set(x, "startAccessor", value.asInstanceOf[js.Any])
    
    inline def setStartAccessorFunction1(value: /* event */ TEvent => js.Date): Self = StObject.set(x, "startAccessor", js.Any.fromFunction1(value))
    
    inline def setStartAccessorUndefined: Self = StObject.set(x, "startAccessor", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTimeslots(value: Double): Self = StObject.set(x, "timeslots", value.asInstanceOf[js.Any])
    
    inline def setTimeslotsUndefined: Self = StObject.set(x, "timeslots", js.undefined)
    
    inline def setTitleAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = StObject.set(x, "titleAccessor", value.asInstanceOf[js.Any])
    
    inline def setTitleAccessorFunction1(value: /* event */ TEvent => String): Self = StObject.set(x, "titleAccessor", js.Any.fromFunction1(value))
    
    inline def setTitleAccessorUndefined: Self = StObject.set(x, "titleAccessor", js.undefined)
    
    inline def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = StObject.set(x, "tooltipAccessor", value.asInstanceOf[js.Any])
    
    inline def setTooltipAccessorFunction1(value: /* event */ TEvent => String): Self = StObject.set(x, "tooltipAccessor", js.Any.fromFunction1(value))
    
    inline def setTooltipAccessorUndefined: Self = StObject.set(x, "tooltipAccessor", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setViews(value: ViewsProps[TEvent, TResource]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: View*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
