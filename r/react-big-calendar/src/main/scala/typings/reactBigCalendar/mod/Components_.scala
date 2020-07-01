package typings.reactBigCalendar.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.SFC
import typings.react.mod.global.JSX.Element
import typings.reactBigCalendar.anon.Date
import typings.reactBigCalendar.anon.DateHeader
import typings.reactBigCalendar.anon.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components_[TEvent /* <: js.Object */] extends js.Object {
  var agenda: js.UndefOr[Date] = js.undefined
  var dateCellWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var day: js.UndefOr[Header] = js.undefined
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.undefined
  var eventContainerWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var eventWrapper: js.UndefOr[ComponentType[EventWrapperProps[TEvent]]] = js.undefined
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.undefined
  var month: js.UndefOr[DateHeader] = js.undefined
  var resourceHeader: js.UndefOr[ComponentType[ResourceHeaderProps]] = js.undefined
  var timeGutterHeader: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var timeGutterWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var timeSlotWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var toolbar: js.UndefOr[ComponentType[ToolbarProps]] = js.undefined
  var week: js.UndefOr[Header] = js.undefined
}

object Components_ {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](
    agenda: Date = null,
    dateCellWrapper: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    day: Header = null,
    event: ComponentType[EventProps[TEvent]] = null,
    eventContainerWrapper: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    eventWrapper: ComponentType[EventWrapperProps[TEvent]] = null,
    header: ComponentType[HeaderProps] = null,
    month: DateHeader = null,
    resourceHeader: ComponentType[ResourceHeaderProps] = null,
    timeGutterHeader: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    timeGutterWrapper: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    timeSlotWrapper: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    toolbar: ComponentType[ToolbarProps] = null,
    week: Header = null
  ): Components_[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (agenda != null) __obj.updateDynamic("agenda")(agenda.asInstanceOf[js.Any])
    if (dateCellWrapper != null) __obj.updateDynamic("dateCellWrapper")(dateCellWrapper.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventContainerWrapper != null) __obj.updateDynamic("eventContainerWrapper")(eventContainerWrapper.asInstanceOf[js.Any])
    if (eventWrapper != null) __obj.updateDynamic("eventWrapper")(eventWrapper.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (resourceHeader != null) __obj.updateDynamic("resourceHeader")(resourceHeader.asInstanceOf[js.Any])
    if (timeGutterHeader != null) __obj.updateDynamic("timeGutterHeader")(timeGutterHeader.asInstanceOf[js.Any])
    if (timeGutterWrapper != null) __obj.updateDynamic("timeGutterWrapper")(timeGutterWrapper.asInstanceOf[js.Any])
    if (timeSlotWrapper != null) __obj.updateDynamic("timeSlotWrapper")(timeSlotWrapper.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components_[TEvent]]
  }
}

