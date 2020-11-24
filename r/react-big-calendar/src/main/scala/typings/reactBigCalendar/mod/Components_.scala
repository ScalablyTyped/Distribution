package typings.reactBigCalendar.mod

import typings.react.mod.ComponentType
import typings.reactBigCalendar.anon.Date
import typings.reactBigCalendar.anon.DateHeader
import typings.reactBigCalendar.anon.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Components_[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends js.Object {
  
  var agenda: js.UndefOr[Date[TEvent]] = js.native
  
  var dateCellWrapper: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var day: js.UndefOr[Header[TEvent]] = js.native
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.native
  
  var eventContainerWrapper: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var eventWrapper: js.UndefOr[ComponentType[EventWrapperProps[TEvent]]] = js.native
  
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.native
  
  var month: js.UndefOr[DateHeader[TEvent]] = js.native
  
  var resourceHeader: js.UndefOr[ComponentType[ResourceHeaderProps]] = js.native
  
  var timeGutterHeader: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var timeGutterWrapper: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var timeSlotWrapper: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var toolbar: js.UndefOr[ComponentType[ToolbarProps[TEvent, TResource]]] = js.native
  
  var week: js.UndefOr[Header[TEvent]] = js.native
}
object Components_ {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](): Components_[TEvent, TResource] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components_[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class Components_Ops[Self <: Components_[_, _], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self with (Components_[TEvent, TResource])) extends AnyVal {
    
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
    def setAgenda(value: Date[TEvent]): Self = this.set("agenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgenda: Self = this.set("agenda", js.undefined)
    
    @scala.inline
    def setDateCellWrapper(value: ComponentType[js.Object]): Self = this.set("dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCellWrapper: Self = this.set("dateCellWrapper", js.undefined)
    
    @scala.inline
    def setDay(value: Header[TEvent]): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setEventContainerWrapper(value: ComponentType[js.Object]): Self = this.set("eventContainerWrapper", value.asInstanceOf[js.Any])
    
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
    def setMonth(value: DateHeader[TEvent]): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setResourceHeader(value: ComponentType[ResourceHeaderProps]): Self = this.set("resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceHeader: Self = this.set("resourceHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterHeader(value: ComponentType[js.Object]): Self = this.set("timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeGutterHeader: Self = this.set("timeGutterHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterWrapper(value: ComponentType[js.Object]): Self = this.set("timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeGutterWrapper: Self = this.set("timeGutterWrapper", js.undefined)
    
    @scala.inline
    def setTimeSlotWrapper(value: ComponentType[js.Object]): Self = this.set("timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSlotWrapper: Self = this.set("timeSlotWrapper", js.undefined)
    
    @scala.inline
    def setToolbar(value: ComponentType[ToolbarProps[TEvent, TResource]]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setWeek(value: Header[TEvent]): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
  }
}
