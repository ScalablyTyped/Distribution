package typings.reactCalendar

import typings.reactCalendar.mod.Detail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-calendar.react-calendar.CalendarTileProperties & {  activeStartDate :std.Date} */
  trait CalendarTilePropertiesact extends StObject {
    
    var activeStartDate: typings.std.Date
    
    var date: typings.std.Date
    
    var view: Detail
  }
  object CalendarTilePropertiesact {
    
    @scala.inline
    def apply(activeStartDate: typings.std.Date, date: typings.std.Date, view: Detail): CalendarTilePropertiesact = {
      val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarTilePropertiesact]
    }
    
    @scala.inline
    implicit class CalendarTilePropertiesactMutableBuilder[Self <: CalendarTilePropertiesact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStartDate(value: typings.std.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var date: typings.std.Date
    
    var label: String
    
    var view: Detail
  }
  object Date {
    
    @scala.inline
    def apply(date: typings.std.Date, label: String, view: Detail): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
