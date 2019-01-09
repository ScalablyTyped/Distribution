package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigCalendarProps[TEvent /* <: Event */, TResource /* <: js.Object */]
  extends reactLib.reactMod.ReactNs.Props[BigCalendar[TEvent, TResource]] {
  var allDayAccessor: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var components: js.UndefOr[Components] = js.undefined
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stringOrDate] = js.undefined
  var dayPropGetter: js.UndefOr[DayPropGetter] = js.undefined
  var defaultDate: js.UndefOr[stdLib.Date] = js.undefined
  var defaultView: js.UndefOr[View] = js.undefined
  var drilldownView: js.UndefOr[View | scala.Null] = js.undefined
  var elementProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]] = js.undefined
  var endAccessor: js.UndefOr[java.lang.String] = js.undefined
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
  var length: js.UndefOr[scala.Double] = js.undefined
  var localizer: DateLocalizer
  var longPressThreshold: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[stringOrDate] = js.undefined
  var messages: js.UndefOr[Messages] = js.undefined
  var min: js.UndefOr[stringOrDate] = js.undefined
  var now: js.UndefOr[stdLib.Date] = js.undefined
  var onDoubleClickEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onDrillDown: js.UndefOr[js.Function2[/* date */ stdLib.Date, /* view */ View, scala.Unit]] = js.undefined
  var onNavigate: js.UndefOr[
    js.Function3[/* newDate */ stdLib.Date, /* view */ View, /* action */ Navigate, scala.Unit]
  ] = js.undefined
  var onSelectEvent: js.UndefOr[
    js.Function2[
      /* event */ TEvent, 
      /* e */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event], 
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
  var onView: js.UndefOr[js.Function1[/* view */ View, scala.Unit]] = js.undefined
  var popup: js.UndefOr[scala.Boolean] = js.undefined
  var popupOffset: js.UndefOr[scala.Double | reactDashBigDashCalendarLib.Anon_X] = js.undefined
  var resourceAccessor: js.UndefOr[java.lang.String] = js.undefined
  var resourceIdAccessor: js.UndefOr[java.lang.String] = js.undefined
  var resourceTitleAccessor: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.UndefOr[js.Array[TResource]] = js.undefined
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  var scrollToTime: js.UndefOr[stdLib.Date] = js.undefined
  var selectable: js.UndefOr[
    scala.Boolean | reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.ignoreEvents
  ] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
  var showMultiDayTimes: js.UndefOr[scala.Boolean] = js.undefined
  var slotPropGetter: js.UndefOr[SlotPropGetter] = js.undefined
  var startAccessor: js.UndefOr[java.lang.String] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var timeslots: js.UndefOr[scala.Double] = js.undefined
  var titleAccessor: js.UndefOr[java.lang.String] = js.undefined
  var toolbar: js.UndefOr[scala.Boolean] = js.undefined
  var view: js.UndefOr[View] = js.undefined
  var views: js.UndefOr[Views] = js.undefined
}

