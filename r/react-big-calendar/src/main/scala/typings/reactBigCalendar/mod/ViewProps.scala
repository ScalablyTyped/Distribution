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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-big-calendar.react-big-calendar.Omit<react-big-calendar.react-big-calendar.CalendarProps<TEvent, TResource>, 'elementProps' | 'className' | 'style' | 'view' | 'toolbar' | 'components' | 'formats' | 'messages' | 'culture'> & {  date :react-big-calendar.react-big-calendar.stringOrDate,   accessors :any,   components :any,   getters :any,   localizer :any,   getDrilldownView :any,   onNavigate :any,   onDrillDown :any,   onSelectEvent :any,   onDoubleClickEvent :any,   onSelectSlot :any} */
@js.native
trait ViewProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends js.Object {
  
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
  implicit class ViewPropsOps[Self <: ViewProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (ViewProps[TEvent, TResource])) extends AnyVal {
    
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
    def setAccessors(value: js.Any): Self = this.set("accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: js.Any): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.UndefOr[stringOrDate] with stringOrDate): Self = this.set("date", value.asInstanceOf[js.Any])
    
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
    ): Self = this.set("getDrilldownView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetters(value: js.Any): Self = this.set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizer(value: DateLocalizer with js.Any): Self = this.set("localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDoubleClickEvent(
      value: (js.UndefOr[
          js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
        ]) with js.Any
    ): Self = this.set("onDoubleClickEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDrillDown(value: (js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]]) with js.Any): Self = this.set("onDrillDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnNavigate(
      value: (js.UndefOr[
          js.Function3[/* newDate */ Date, /* view */ View, /* action */ NavigateAction, Unit]
        ]) with js.Any
    ): Self = this.set("onNavigate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectEvent(
      value: (js.UndefOr[
          js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
        ]) with js.Any
    ): Self = this.set("onSelectEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectSlot(value: (js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]]) with js.Any): Self = this.set("onSelectSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayAccessorFunction1(value: /* event */ TEvent => Boolean): Self = this.set("allDayAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllDayAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, Boolean])): Self = this.set("allDayAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDayAccessor: Self = this.set("allDayAccessor", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
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
    def setGetNow(value: () => Date): Self = this.set("getNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNow: Self = this.set("getNow", js.undefined)
    
    @scala.inline
    def setHandleDragStart(value: /* event */ TEvent => Unit): Self = this.set("handleDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleDragStart: Self = this.set("handleDragStart", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
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
    def setMin(value: stringOrDate): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnRangeChange(value: (/* range */ js.Array[Date] | End, /* view */ js.UndefOr[View]) => Unit): Self = this.set("onRangeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRangeChange: Self = this.set("onRangeChange", js.undefined)
    
    @scala.inline
    def setOnSelecting(value: /* range */ End => js.UndefOr[Boolean | Null]): Self = this.set("onSelecting", js.Any.fromFunction1(value))
    
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
    def setRefFunction1(value: /* instance */ (Calendar[TEvent, TResource]) | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: LegacyRef[Calendar[TEvent, TResource]]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
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
    def setTooltipAccessorFunction1(value: /* event */ TEvent => String): Self = this.set("tooltipAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTooltipAccessor(value: (/* keyof TEvent */ String) | (js.Function1[/* event */ TEvent, String])): Self = this.set("tooltipAccessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipAccessor: Self = this.set("tooltipAccessor", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: View*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: ViewsProps[TEvent, TResource]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
