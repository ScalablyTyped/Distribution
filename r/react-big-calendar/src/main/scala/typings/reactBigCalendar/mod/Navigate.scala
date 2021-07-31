package typings.reactBigCalendar.mod

import typings.reactBigCalendar.reactBigCalendarStrings.DATE
import typings.reactBigCalendar.reactBigCalendarStrings.NEXT
import typings.reactBigCalendar.reactBigCalendarStrings.PREV
import typings.reactBigCalendar.reactBigCalendarStrings.TODAY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigate extends StObject {
  
  var DATE: typings.reactBigCalendar.reactBigCalendarStrings.DATE
  
  var NEXT: typings.reactBigCalendar.reactBigCalendarStrings.NEXT
  
  var PREVIOUS: PREV
  
  var TODAY: typings.reactBigCalendar.reactBigCalendarStrings.TODAY
}
object Navigate {
  
  @scala.inline
  def apply(): Navigate = {
    val __obj = js.Dynamic.literal(DATE = "DATE", NEXT = "NEXT", PREVIOUS = "PREV", TODAY = "TODAY")
    __obj.asInstanceOf[Navigate]
  }
  
  @scala.inline
  implicit class NavigateMutableBuilder[Self <: Navigate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDATE(value: DATE): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNEXT(value: NEXT): Self = StObject.set(x, "NEXT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPREVIOUS(value: PREV): Self = StObject.set(x, "PREVIOUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTODAY(value: TODAY): Self = StObject.set(x, "TODAY", value.asInstanceOf[js.Any])
  }
}
