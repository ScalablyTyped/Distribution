package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var agenda: js.UndefOr[reactDashBigDashCalendarLib.Anon_Date] = js.undefined
  var dateCellWrapper: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var day: js.UndefOr[reactDashBigDashCalendarLib.Anon_Event] = js.undefined
  var dayWrapper: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var event: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[EventProps[Event]]] = js.undefined
  var eventContainerWrapper: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var eventWrapper: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[EventWrapperProps[Event]]] = js.undefined
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[HeaderProps]] = js.undefined
  var month: js.UndefOr[reactDashBigDashCalendarLib.Anon_DateHeader] = js.undefined
  var timeGutterWrapper: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var timeSlotWrapper: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var toolbar: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[ToolbarProps]] = js.undefined
  var week: js.UndefOr[reactDashBigDashCalendarLib.Anon_Event] = js.undefined
}

object Components {
  @scala.inline
  def apply(
    agenda: reactDashBigDashCalendarLib.Anon_Date = null,
    dateCellWrapper: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    day: reactDashBigDashCalendarLib.Anon_Event = null,
    dayWrapper: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    event: reactLib.reactMod.ReactNs.ComponentType[EventProps[Event]] = null,
    eventContainerWrapper: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    eventWrapper: reactLib.reactMod.ReactNs.ComponentType[EventWrapperProps[Event]] = null,
    header: reactLib.reactMod.ReactNs.ComponentType[HeaderProps] = null,
    month: reactDashBigDashCalendarLib.Anon_DateHeader = null,
    timeGutterWrapper: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    timeSlotWrapper: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    toolbar: reactLib.reactMod.ReactNs.ComponentType[ToolbarProps] = null,
    week: reactDashBigDashCalendarLib.Anon_Event = null
  ): Components = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda)
    if (dateCellWrapper != null) __obj.updateDynamic("dateCellWrapper")(dateCellWrapper.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day)
    if (dayWrapper != null) __obj.updateDynamic("dayWrapper")(dayWrapper.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventContainerWrapper != null) __obj.updateDynamic("eventContainerWrapper")(eventContainerWrapper.asInstanceOf[js.Any])
    if (eventWrapper != null) __obj.updateDynamic("eventWrapper")(eventWrapper.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month)
    if (timeGutterWrapper != null) __obj.updateDynamic("timeGutterWrapper")(timeGutterWrapper.asInstanceOf[js.Any])
    if (timeSlotWrapper != null) __obj.updateDynamic("timeSlotWrapper")(timeSlotWrapper.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week)
    __obj.asInstanceOf[Components]
  }
}

