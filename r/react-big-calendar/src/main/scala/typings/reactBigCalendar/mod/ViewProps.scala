package typings.reactBigCalendar.mod

import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-big-calendar.react-big-calendar.Omit<react-big-calendar.react-big-calendar.CalendarProps<TEvent, TResource>, 'elementProps' | 'className' | 'style' | 'view' | 'toolbar' | 'components' | 'formats' | 'messages' | 'culture'> & {  date :react-big-calendar.react-big-calendar.stringOrDate,   accessors :any,   components :any,   getters :any,   localizer :any,   getDrilldownView :any,   onNavigate :any,   onDrillDown :any,   onSelectEvent :any,   onDoubleClickEvent :any,   onSelectSlot :any} */
@js.native
trait ViewProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
  // date has always a value, in contrast to optional date in CalendarProps
  // props assigned from Calendar's this.state.context, see there if you want to improve the type defs:
  var accessors: js.Any = js.native
  
  var allDayAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var components: js.Any = js.native
  
  var date: js.UndefOr[stringOrDate] with stringOrDate = js.native
  
  var dayLayoutAlgorithm: js.UndefOr[DayLayoutAlgorithm | DayLayoutFunction[TEvent]] = js.native
  
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.native
  
  var defaultDate: js.UndefOr[Date] = js.native
  
  var defaultView: js.UndefOr[View] = js.native
  
  var drilldownView: js.UndefOr[View | Null] = js.native
  
  var endAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Date])] = js.native
  
  var eventPropGetter: js.UndefOr[EventPropGetter[TEvent]] = js.native
  
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  
  // props assigned from Calendar instance, see there if you want to improve the type defs:
  var getDrilldownView: (js.UndefOr[
    (js.Function3[
      /* targetDate */ Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ]) with js.Any = js.native
  
  var getNow: js.UndefOr[js.Function0[Date]] = js.native
  
  var getters: js.Any = js.native
  
  var handleDragStart: js.UndefOr[js.Function1[/* event */ TEvent, Unit]] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var localizer: DateLocalizer with js.Any = js.native
  
  var longPressThreshold: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[stringOrDate] = js.native
  
  var min: js.UndefOr[stringOrDate] = js.native
  
  // = this.handleSelectEvent
  var onDoubleClickEvent: (js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ]) with js.Any = js.native
  
  // = this.handleNavigate
  var onDrillDown: (js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]]) with js.Any = js.native
  
  // = this.getDrilldownView
  var onNavigate: (js.UndefOr[
    js.Function3[/* newDate */ Date, /* view */ View, /* action */ NavigateAction, Unit]
  ]) with js.Any = js.native
  
  var onRangeChange: js.UndefOr[
    js.Function2[/* range */ js.Array[Date] | End, /* view */ js.UndefOr[View], Unit]
  ] = js.native
  
  // = this.handleDrillDown
  var onSelectEvent: (js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ]) with js.Any = js.native
  
  // = this.handleDoubleClickEvent
  var onSelectSlot: (js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]]) with js.Any = js.native
  
  var onSelecting: js.UndefOr[js.Function1[/* range */ End, js.UndefOr[Boolean | Null]]] = js.native
  
  var onShowMore: js.UndefOr[js.Function2[/* events */ js.Array[TEvent], /* date */ Date, Unit]] = js.native
  
  var onView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.native
  
  var popup: js.UndefOr[Boolean] = js.native
  
  var popupOffset: js.UndefOr[Double | X] = js.native
  
  var ref: js.UndefOr[LegacyRef[Calendar[TEvent, TResource]]] = js.native
  
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
  
  var timeslots: js.UndefOr[Double] = js.native
  
  var titleAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.native
  
  var tooltipAccessor: js.UndefOr[(/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])] = js.native
  
  var views: js.UndefOr[ViewsProps[TEvent, TResource]] = js.native
}
object ViewProps {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](
    accessors: js.Any,
    components: js.Any,
    date: js.UndefOr[stringOrDate] with stringOrDate,
    getDrilldownView: (js.UndefOr[
      (js.Function3[
        /* targetDate */ Date, 
        /* currentViewName */ View, 
        /* configuredViewNames */ js.Array[View], 
        Unit
      ]) | Null
    ]) with js.Any,
    getters: js.Any,
    localizer: DateLocalizer with js.Any,
    onDoubleClickEvent: (js.UndefOr[
      js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
    ]) with js.Any,
    onDrillDown: (js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]]) with js.Any,
    onNavigate: (js.UndefOr[
      js.Function3[/* newDate */ Date, /* view */ View, /* action */ NavigateAction, Unit]
    ]) with js.Any,
    onSelectEvent: (js.UndefOr[
      js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
    ]) with js.Any,
    onSelectSlot: (js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]]) with js.Any
  ): ViewProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(accessors = accessors.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], getDrilldownView = getDrilldownView.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any], onDoubleClickEvent = onDoubleClickEvent.asInstanceOf[js.Any], onDrillDown = onDrillDown.asInstanceOf[js.Any], onNavigate = onNavigate.asInstanceOf[js.Any], onSelectEvent = onSelectEvent.asInstanceOf[js.Any], onSelectSlot = onSelectSlot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewProps[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class ViewPropsMutableBuilder[Self <: ViewProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (ViewProps[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def setAccessors(value: js.Any): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = StObject.set(x, "allDayAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self = StObject.set(x, "allDayAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllDayAccessorUndefined: Self = StObject.set(x, "allDayAccessor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setComponents(value: js.Any): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.UndefOr[stringOrDate] with stringOrDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
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
    def setGetDrilldownView(
      value: (js.UndefOr[
          (js.Function3[
            /* targetDate */ Date, 
            /* currentViewName */ View, 
            /* configuredViewNames */ js.Array[View], 
            Unit
          ]) | Null
        ]) with js.Any
    ): Self = StObject.set(x, "getDrilldownView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNow(value: () => Date): Self = StObject.set(x, "getNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNowUndefined: Self = StObject.set(x, "getNow", js.undefined)
    
    @scala.inline
    def setGetters(value: js.Any): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleDragStart(value: /* event */ TEvent => Unit): Self = StObject.set(x, "handleDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleDragStartUndefined: Self = StObject.set(x, "handleDragStart", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setLocalizer(value: DateLocalizer with js.Any): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPressThreshold(value: Double): Self = StObject.set(x, "longPressThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPressThresholdUndefined: Self = StObject.set(x, "longPressThreshold", js.undefined)
    
    @scala.inline
    def setMax(value: stringOrDate): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: stringOrDate): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOnDoubleClickEvent(
      value: (js.UndefOr[
          js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
        ]) with js.Any
    ): Self = StObject.set(x, "onDoubleClickEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDrillDown(value: (js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]]) with js.Any): Self = StObject.set(x, "onDrillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNavigate(
      value: (js.UndefOr[
          js.Function3[/* newDate */ Date, /* view */ View, /* action */ NavigateAction, Unit]
        ]) with js.Any
    ): Self = StObject.set(x, "onNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRangeChange(value: (/* range */ js.Array[Date] | End, /* view */ js.UndefOr[View]) => Unit): Self = StObject.set(x, "onRangeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRangeChangeUndefined: Self = StObject.set(x, "onRangeChange", js.undefined)
    
    @scala.inline
    def setOnSelectEvent(
      value: (js.UndefOr[
          js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
        ]) with js.Any
    ): Self = StObject.set(x, "onSelectEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectSlot(value: (js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]]) with js.Any): Self = StObject.set(x, "onSelectSlot", value.asInstanceOf[js.Any])
    
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
    def setRef(value: LegacyRef[Calendar[TEvent, TResource]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ (Calendar[TEvent, TResource]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setResourceAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, _])): Self = StObject.set(x, "resourceAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAccessorFunction1(value: /* event */ TEvent => _): Self = StObject.set(x, "resourceAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceAccessorUndefined: Self = StObject.set(x, "resourceAccessor", js.undefined)
    
    @scala.inline
    def setResourceIdAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self = StObject.set(x, "resourceIdAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdAccessorFunction1(value: /* resource */ TResource => _): Self = StObject.set(x, "resourceIdAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResourceIdAccessorUndefined: Self = StObject.set(x, "resourceIdAccessor", js.undefined)
    
    @scala.inline
    def setResourceTitleAccessor(value: (/* keyof TResource */ String) | (js.Function1[/* resource */ TResource, _])): Self = StObject.set(x, "resourceTitleAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTitleAccessorFunction1(value: /* resource */ TResource => _): Self = StObject.set(x, "resourceTitleAccessor", js.Any.fromFunction1(value))
    
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
    def setTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = StObject.set(x, "tooltipAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipAccessorFunction1(value: /* event */ TEvent => String): Self = StObject.set(x, "tooltipAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipAccessorUndefined: Self = StObject.set(x, "tooltipAccessor", js.undefined)
    
    @scala.inline
    def setViews(value: ViewsProps[TEvent, TResource]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: View*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
