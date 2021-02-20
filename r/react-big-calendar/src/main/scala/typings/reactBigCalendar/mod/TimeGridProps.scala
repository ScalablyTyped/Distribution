package typings.reactBigCalendar.mod

import typings.react.mod.SyntheticEvent
import typings.reactBigCalendar.anon.Action
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeGridProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
  var accessors: js.UndefOr[js.Object] = js.native
  
  var components: js.UndefOr[js.Object] = js.native
  
  var dayLayoutAlgorithm: js.UndefOr[js.Any] = js.native
  
  var eventOffset: Double = js.native
  
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  
  var getDrilldownView: js.UndefOr[
    (js.Function3[
      /* targetDate */ Date, 
      /* currentViewName */ View, 
      /* configuredViewNames */ js.Array[View], 
      Unit
    ]) | Null
  ] = js.native
  
  var getNow: js.UndefOr[js.Function0[Date]] = js.native
  
  var getters: js.UndefOr[js.Object] = js.native
  
  var localizer: js.UndefOr[js.Object] = js.native
  
  var longPressThreshold: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[stringOrDate] = js.native
  
  var min: js.UndefOr[stringOrDate] = js.native
  
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.native
  
  var onDrillDown: js.UndefOr[js.Function2[/* date */ Date, /* view */ View, Unit]] = js.native
  
  var onKeyPressEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onNavigate: js.UndefOr[js.Function1[/* action */ NavigateAction, Unit]] = js.native
  
  var onSelectEnd: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onSelectEvent: js.UndefOr[
    js.Function2[/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event], Unit]
  ] = js.native
  
  var onSelectSlot: js.UndefOr[js.Function1[/* slotInfo */ Action, Unit]] = js.native
  
  var onSelectStart: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var range: js.UndefOr[js.Array[_]] = js.native
  
  var resources: js.UndefOr[js.Array[TResource]] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
  
  var scrollToTime: js.UndefOr[Date] = js.native
  
  var selectable: js.UndefOr[Boolean | ignoreEvents] = js.native
  
  var selected: js.UndefOr[js.Object] = js.native
  
  var showMultiDayTimes: js.UndefOr[Boolean] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var timeslots: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object TimeGridProps {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](eventOffset: Double): TimeGridProps[TEvent, TResource] = {
    val __obj = js.Dynamic.literal(eventOffset = eventOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeGridProps[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class TimeGridPropsMutableBuilder[Self <: TimeGridProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (TimeGridProps[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def setAccessors(value: js.Object): Self = StObject.set(x, "accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessorsUndefined: Self = StObject.set(x, "accessors", js.undefined)
    
    @scala.inline
    def setComponents(value: js.Object): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setDayLayoutAlgorithm(value: js.Any): Self = StObject.set(x, "dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayLayoutAlgorithmUndefined: Self = StObject.set(x, "dayLayoutAlgorithm", js.undefined)
    
    @scala.inline
    def setEventOffset(value: Double): Self = StObject.set(x, "eventOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
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
    def setGetters(value: js.Object): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
    
    @scala.inline
    def setLocalizer(value: js.Object): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizerUndefined: Self = StObject.set(x, "localizer", js.undefined)
    
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
    def setOnDoubleClickEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onDoubleClickEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDoubleClickEventUndefined: Self = StObject.set(x, "onDoubleClickEvent", js.undefined)
    
    @scala.inline
    def setOnDrillDown(value: (/* date */ Date, /* view */ View) => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
    
    @scala.inline
    def setOnKeyPressEvent(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onKeyPressEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyPressEventUndefined: Self = StObject.set(x, "onKeyPressEvent", js.undefined)
    
    @scala.inline
    def setOnNavigate(value: /* action */ NavigateAction => Unit): Self = StObject.set(x, "onNavigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNavigateUndefined: Self = StObject.set(x, "onNavigate", js.undefined)
    
    @scala.inline
    def setOnSelectEnd(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onSelectEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectEndUndefined: Self = StObject.set(x, "onSelectEnd", js.undefined)
    
    @scala.inline
    def setOnSelectEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = StObject.set(x, "onSelectEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectEventUndefined: Self = StObject.set(x, "onSelectEvent", js.undefined)
    
    @scala.inline
    def setOnSelectSlot(value: /* slotInfo */ Action => Unit): Self = StObject.set(x, "onSelectSlot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectSlotUndefined: Self = StObject.set(x, "onSelectSlot", js.undefined)
    
    @scala.inline
    def setOnSelectStart(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onSelectStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectStartUndefined: Self = StObject.set(x, "onSelectStart", js.undefined)
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = StObject.set(x, "range", js.Array(value :_*))
    
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
    def setSelected(value: js.Object): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShowMultiDayTimes(value: Boolean): Self = StObject.set(x, "showMultiDayTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMultiDayTimesUndefined: Self = StObject.set(x, "showMultiDayTimes", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTimeslots(value: Double): Self = StObject.set(x, "timeslots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeslotsUndefined: Self = StObject.set(x, "timeslots", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
