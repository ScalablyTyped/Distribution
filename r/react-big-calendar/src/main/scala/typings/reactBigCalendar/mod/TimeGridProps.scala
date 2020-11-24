package typings.reactBigCalendar.mod

import typings.react.mod.SyntheticEvent
import typings.reactBigCalendar.anon.Action
import typings.reactBigCalendar.reactBigCalendarStrings.ignoreEvents
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeGridProps[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends js.Object {
  
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
  implicit class TimeGridPropsOps[Self <: TimeGridProps[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (TimeGridProps[TEvent, TResource])) extends AnyVal {
    
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
    def setEventOffset(value: Double): Self = this.set("eventOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessors(value: js.Object): Self = this.set("accessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessors: Self = this.set("accessors", js.undefined)
    
    @scala.inline
    def setComponents(value: js.Object): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setDayLayoutAlgorithm(value: js.Any): Self = this.set("dayLayoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayLayoutAlgorithm: Self = this.set("dayLayoutAlgorithm", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
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
    def setGetters(value: js.Object): Self = this.set("getters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetters: Self = this.set("getters", js.undefined)
    
    @scala.inline
    def setLocalizer(value: js.Object): Self = this.set("localizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalizer: Self = this.set("localizer", js.undefined)
    
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
    def setOnDoubleClickEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = this.set("onDoubleClickEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDoubleClickEvent: Self = this.set("onDoubleClickEvent", js.undefined)
    
    @scala.inline
    def setOnDrillDown(value: (/* date */ Date, /* view */ View) => Unit): Self = this.set("onDrillDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDrillDown: Self = this.set("onDrillDown", js.undefined)
    
    @scala.inline
    def setOnKeyPressEvent(value: /* repeated */ js.Any => _): Self = this.set("onKeyPressEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPressEvent: Self = this.set("onKeyPressEvent", js.undefined)
    
    @scala.inline
    def setOnNavigate(value: /* action */ NavigateAction => Unit): Self = this.set("onNavigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNavigate: Self = this.set("onNavigate", js.undefined)
    
    @scala.inline
    def setOnSelectEnd(value: /* repeated */ js.Any => _): Self = this.set("onSelectEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectEnd: Self = this.set("onSelectEnd", js.undefined)
    
    @scala.inline
    def setOnSelectEvent(value: (/* event */ TEvent, /* e */ SyntheticEvent[HTMLElement, typings.std.Event]) => Unit): Self = this.set("onSelectEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSelectEvent: Self = this.set("onSelectEvent", js.undefined)
    
    @scala.inline
    def setOnSelectSlot(value: /* slotInfo */ Action => Unit): Self = this.set("onSelectSlot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectSlot: Self = this.set("onSelectSlot", js.undefined)
    
    @scala.inline
    def setOnSelectStart(value: /* repeated */ js.Any => _): Self = this.set("onSelectStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectStart: Self = this.set("onSelectStart", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
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
    def setSelected(value: js.Object): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setShowMultiDayTimes(value: Boolean): Self = this.set("showMultiDayTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMultiDayTimes: Self = this.set("showMultiDayTimes", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setTimeslots(value: Double): Self = this.set("timeslots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeslots: Self = this.set("timeslots", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
