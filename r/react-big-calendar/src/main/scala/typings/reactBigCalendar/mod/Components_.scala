package typings.reactBigCalendar.mod

import typings.react.mod.ComponentType
import typings.reactBigCalendar.anon.Date
import typings.reactBigCalendar.anon.DateHeader
import typings.reactBigCalendar.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components_[TEvent /* <: js.Object */, TResource /* <: js.Object */] extends StObject {
  
  var agenda: js.UndefOr[Date[TEvent]] = js.undefined
  
  var dateCellWrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var day: js.UndefOr[Header[TEvent]] = js.undefined
  
  var event: js.UndefOr[ComponentType[EventProps[TEvent]]] = js.undefined
  
  var eventContainerWrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var eventWrapper: js.UndefOr[ComponentType[EventWrapperProps[TEvent]]] = js.undefined
  
  /**
    * component used as a header for each column in the TimeGridHeader
    */
  var header: js.UndefOr[ComponentType[HeaderProps]] = js.undefined
  
  var month: js.UndefOr[DateHeader[TEvent]] = js.undefined
  
  var resourceHeader: js.UndefOr[ComponentType[ResourceHeaderProps]] = js.undefined
  
  var timeGutterHeader: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var timeGutterWrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var timeSlotWrapper: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var toolbar: js.UndefOr[ComponentType[ToolbarProps[TEvent, TResource]]] = js.undefined
  
  var week: js.UndefOr[Header[TEvent]] = js.undefined
}
object Components_ {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */, TResource /* <: js.Object */](): Components_[TEvent, TResource] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Components_[TEvent, TResource]]
  }
  
  @scala.inline
  implicit class Components_MutableBuilder[Self <: Components_[?, ?], TEvent /* <: js.Object */, TResource /* <: js.Object */] (val x: Self & (Components_[TEvent, TResource])) extends AnyVal {
    
    @scala.inline
    def setAgenda(value: Date[TEvent]): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
    
    @scala.inline
    def setDateCellWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "dateCellWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCellWrapperUndefined: Self = StObject.set(x, "dateCellWrapper", js.undefined)
    
    @scala.inline
    def setDay(value: Header[TEvent]): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setEvent(value: ComponentType[EventProps[TEvent]]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "eventContainerWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventContainerWrapperUndefined: Self = StObject.set(x, "eventContainerWrapper", js.undefined)
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventWrapper(value: ComponentType[EventWrapperProps[TEvent]]): Self = StObject.set(x, "eventWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventWrapperUndefined: Self = StObject.set(x, "eventWrapper", js.undefined)
    
    @scala.inline
    def setHeader(value: ComponentType[HeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMonth(value: DateHeader[TEvent]): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setResourceHeader(value: ComponentType[ResourceHeaderProps]): Self = StObject.set(x, "resourceHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceHeaderUndefined: Self = StObject.set(x, "resourceHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterHeader(value: ComponentType[js.Object]): Self = StObject.set(x, "timeGutterHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterHeaderUndefined: Self = StObject.set(x, "timeGutterHeader", js.undefined)
    
    @scala.inline
    def setTimeGutterWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "timeGutterWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeGutterWrapperUndefined: Self = StObject.set(x, "timeGutterWrapper", js.undefined)
    
    @scala.inline
    def setTimeSlotWrapper(value: ComponentType[js.Object]): Self = StObject.set(x, "timeSlotWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSlotWrapperUndefined: Self = StObject.set(x, "timeSlotWrapper", js.undefined)
    
    @scala.inline
    def setToolbar(value: ComponentType[ToolbarProps[TEvent, TResource]]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setWeek(value: Header[TEvent]): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
  }
}
