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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components_[TEvent /* <: js.Object */] extends js.Object {
  var agenda: js.UndefOr[Date] = js.native
  var dateCellWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var day: js.UndefOr[Header] = js.native
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.native
  var eventContainerWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var eventWrapper: js.UndefOr[ComponentType[EventWrapperProps[TEvent]]] = js.native
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.native
  var month: js.UndefOr[DateHeader] = js.native
  var resourceHeader: js.UndefOr[ComponentType[ResourceHeaderProps]] = js.native
  var timeGutterHeader: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var timeGutterWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var timeSlotWrapper: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.native
  var toolbar: js.UndefOr[ComponentType[ToolbarProps]] = js.native
  var week: js.UndefOr[Header] = js.native
}

object Components_ {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](): Components_[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components_[TEvent]]
  }
  @scala.inline
  implicit class Components_Ops[Self <: Components_[_], /* <: js.Object */ TEvent] (val x: Self with Components_[TEvent]) extends AnyVal {
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
    def setAgenda(value: Date): Self = this.set("agenda", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    @scala.inline
    def setDateCellWrapper(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("dateCellWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCellWrapper: Self = this.set("dateCellWrapper", js.undefined)
    @scala.inline
    def setDay(value: Header): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setEventContainerWrapper(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("eventContainerWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventContainerWrapper: Self = this.set("eventContainerWrapper", js.undefined)
    @scala.inline
    def setEventWrapper(value: ComponentType[EventWrapperProps[TEvent]]): Self = this.set("eventWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventWrapper: Self = this.set("eventWrapper", js.undefined)
    @scala.inline
    def setHeader(value: ComponentType[HeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMonth(value: DateHeader): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setResourceHeader(value: ComponentType[ResourceHeaderProps]): Self = this.set("resourceHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceHeader: Self = this.set("resourceHeader", js.undefined)
    @scala.inline
    def setTimeGutterHeader(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("timeGutterHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeGutterHeader: Self = this.set("timeGutterHeader", js.undefined)
    @scala.inline
    def setTimeGutterWrapper(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("timeGutterWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeGutterWrapper: Self = this.set("timeGutterWrapper", js.undefined)
    @scala.inline
    def setTimeSlotWrapper(
      value: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
    ): Self = this.set("timeSlotWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSlotWrapper: Self = this.set("timeSlotWrapper", js.undefined)
    @scala.inline
    def setToolbar(value: ComponentType[ToolbarProps]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setWeek(value: Header): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
  }
  
}

