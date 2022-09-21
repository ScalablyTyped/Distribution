package typings.reactBigCalendar.mod

import typings.react.mod.SyntheticEvent
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeGridProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
  var accessors: js.UndefOr[js.Object] = js.undefined
  
  var backgroundEvents: js.UndefOr[js.Array[TEvent]] = js.undefined
  
  var components: js.UndefOr[js.Object] = js.undefined
  
  var dayLayoutAlgorithm: js.UndefOr[Any] = js.undefined
  
  var eventOffset: Double
  
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ js.Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.undefined
  
  var getNow: js.UndefOr[js.Function0[js.Date]] = js.undefined
  
  var getters: js.UndefOr[js.Object] = js.undefined
  
  var localizer: js.UndefOr[js.Object] = js.undefined
  
  var longPressThreshold: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onDrillDown: js.UndefOr[js.Function2[/* date */ js.Date, /* view */ View, Unit]] = js.undefined
  
  var onKeyPressEvent: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var onNavigate: js.UndefOr[js.Function1[/* action */ NavigateAction, Unit]] = js.undefined
  
  var onSelectEnd: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var onSelectEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.undefined
  
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ SlotInfo, Unit]] = js.undefined
  
  var onSelectStart: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var range: js.UndefOr[js.Array[Any]] = js.undefined
  
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  var scrollToTime: js.UndefOr[js.Date] = js.undefined
  
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.undefined
  
  var selected: js.UndefOr[js.Object] = js.undefined
  
  var showMultiDayTimes: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var timeslots: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object TimeGridProps {
  
  inline def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](eventOffset: Double): TimeGridProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(eventOffset = eventOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeGridProps[TEvent, TResource]]
  }
  
  extension [Self <: TimeGridProps[?, ?], TEvent /* <: js.Object */, TResource /* <: js.Object */](x: Self & (TimeGridProps[TEvent, TResource])) {
    
    inline def setAccessors(value: js.Object): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
    
    inline def setAccessorsUndefined: Self = StObject.set(x, "accessors", js.undefined)
    
    inline def setBackgroundEvents(value: js.Array[TEvent]): Self = StObject.set(x, "backgroundEvents", value.asInstanceOf[js.Any])
    
    inline def setBackgroundEventsUndefined: Self = StObject.set(x, "backgroundEvents", js.undefined)
    
    inline def setBackgroundEventsVarargs(value: TEvent*): Self = StObject.set(x, "backgroundEvents", js.Array(value*))
    
    inline def setComponents(value: js.Object): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDayLayoutAlgorithm(value: Any): Self = StObject.set(x, "dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDayLayoutAlgorithmUndefined: Self = StObject.set(x, "dayLayoutAlgorithm", js.undefined)
    
    inline def setEventOffset(value: Double): Self = StObject.set(x, "eventOffset", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetDrilldownView(
      value: (/* targetDate */ js.Date, /* currentViewName */ View, /* configuredViewNames */ js.Array[View]) => Unit
    ): Self = StObject.set(x, "getDrilldownView", js.Any.fromFunction3(value))
    
    inline def setGetDrilldownViewNull: Self = StObject.set(x, "getDrilldownView", null)
    
    inline def setGetDrilldownViewUndefined: Self = StObject.set(x, "getDrilldownView", js.undefined)
    
    inline def setGetNow(value: () => js.Date): Self = StObject.set(x, "getNow", js.Any.fromFunction0(value))
    
    inline def setGetNowUndefined: Self = StObject.set(x, "getNow", js.undefined)
    
    inline def setGetters(value: js.Object): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    inline def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
    
    inline def setLocalizer(value: js.Object): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    inline def setLocalizerUndefined: Self = StObject.set(x, "localizer", js.undefined)
    
    inline def setLongPressThreshold(value: Double): Self = StObject.set(x, "longPressThreshold", value.asInstanceOf[js.Any])
    
    inline def setLongPressThresholdUndefined: Self = StObject.set(x, "longPressThreshold", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOnDoubleClickEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onDoubleClickEvent", js.Any.fromFunction2(value))
    
    inline def setOnDoubleClickEventUndefined: Self = StObject.set(x, "onDoubleClickEvent", js.undefined)
    
    inline def setOnDrillDown(value: (/* date */ js.Date, /* view */ View) => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction2(value))
    
    inline def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
    
    inline def setOnKeyPressEvent(value: /* repeated */ Any => Any): Self = StObject.set(x, "onKeyPressEvent", js.Any.fromFunction1(value))
    
    inline def setOnKeyPressEventUndefined: Self = StObject.set(x, "onKeyPressEvent", js.undefined)
    
    inline def setOnNavigate(value: /* action */ NavigateAction => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction1(value))
    
    inline def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
    
    inline def setOnSelectEnd(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSelectEnd", js.Any.fromFunction1(value))
    
    inline def setOnSelectEndUndefined: Self = StObject.set(x, "onSelectEnd", js.undefined)
    
    inline def setOnSelectEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onSelectEvent", js.Any.fromFunction2(value))
    
    inline def setOnSelectEventUndefined: Self = StObject.set(x, "onSelectEvent", js.undefined)
    
    inline def setOnSelectSlot(value: /* slotInfo */ SlotInfo => Unit): Self = StObject.set(x, "onSelectSlot", js.Any.fromFunction1(value))
    
    inline def setOnSelectSlotUndefined: Self = StObject.set(x, "onSelectSlot", js.undefined)
    
    inline def setOnSelectStart(value: /* repeated */ Any => Any): Self = StObject.set(x, "onSelectStart", js.Any.fromFunction1(value))
    
    inline def setOnSelectStartUndefined: Self = StObject.set(x, "onSelectStart", js.undefined)
    
    inline def setRange(value: js.Array[Any]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Any*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setResources(value: js.Array[TResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: TResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setScrollToTime(value: js.Date): Self = StObject.set(x, "scrollToTime", value.asInstanceOf[js.Any])
    
    inline def setScrollToTimeUndefined: Self = StObject.set(x, "scrollToTime", js.undefined)
    
    inline def setSelectable(value: Boolean | ignoreEvents): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelected(value: js.Object): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowMultiDayTimes(value: Boolean): Self = StObject.set(x, "showMultiDayTimes", value.asInstanceOf[js.Any])
    
    inline def setShowMultiDayTimesUndefined: Self = StObject.set(x, "showMultiDayTimes", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTimeslots(value: Double): Self = StObject.set(x, "timeslots", value.asInstanceOf[js.Any])
    
    inline def setTimeslotsUndefined: Self = StObject.set(x, "timeslots", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
