package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components[TEvent /* <: Event */] extends js.Object {
  var agenda: js.UndefOr[reactDashBigDashCalendarLib.Anon_Date] = js.undefined
  var dateCellWrapper: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var day: js.UndefOr[reactDashBigDashCalendarLib.Anon_Event] = js.undefined
  var dayWrapper: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var event: js.UndefOr[reactLib.reactMod.ComponentType[EventProps[TEvent]]] = js.undefined
  var eventContainerWrapper: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var eventWrapper: js.UndefOr[reactLib.reactMod.ComponentType[EventWrapperProps[TEvent]]] = js.undefined
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[reactLib.reactMod.ComponentType[HeaderProps]] = js.undefined
  var month: js.UndefOr[reactDashBigDashCalendarLib.Anon_DateHeader] = js.undefined
  var resourceHeader: js.UndefOr[reactLib.reactMod.ComponentType[ResourceHeaderProps]] = js.undefined
  var timeGutterHeader: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var timeGutterWrapper: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var timeSlotWrapper: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var toolbar: js.UndefOr[reactLib.reactMod.ComponentType[ToolbarProps]] = js.undefined
  var week: js.UndefOr[reactDashBigDashCalendarLib.Anon_Event] = js.undefined
}

object Components {
  @scala.inline
  def apply[TEvent /* <: Event */](
    agenda: reactDashBigDashCalendarLib.Anon_Date = null,
    dateCellWrapper: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    day: reactDashBigDashCalendarLib.Anon_Event = null,
    dayWrapper: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    event: reactLib.reactMod.ComponentType[EventProps[TEvent]] = null,
    eventContainerWrapper: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    eventWrapper: reactLib.reactMod.ComponentType[EventWrapperProps[TEvent]] = null,
    header: reactLib.reactMod.ComponentType[HeaderProps] = null,
    month: reactDashBigDashCalendarLib.Anon_DateHeader = null,
    resourceHeader: reactLib.reactMod.ComponentType[ResourceHeaderProps] = null,
    timeGutterHeader: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    timeGutterWrapper: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    timeSlotWrapper: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    toolbar: reactLib.reactMod.ComponentType[ToolbarProps] = null,
    week: reactDashBigDashCalendarLib.Anon_Event = null
  ): Components[TEvent] = {
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
    if (resourceHeader != null) __obj.updateDynamic("resourceHeader")(resourceHeader.asInstanceOf[js.Any])
    if (timeGutterHeader != null) __obj.updateDynamic("timeGutterHeader")(timeGutterHeader.asInstanceOf[js.Any])
    if (timeGutterWrapper != null) __obj.updateDynamic("timeGutterWrapper")(timeGutterWrapper.asInstanceOf[js.Any])
    if (timeSlotWrapper != null) __obj.updateDynamic("timeSlotWrapper")(timeSlotWrapper.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week)
    __obj.asInstanceOf[Components[TEvent]]
  }
}

