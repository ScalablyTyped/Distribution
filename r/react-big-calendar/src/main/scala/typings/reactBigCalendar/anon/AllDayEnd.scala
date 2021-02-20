package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllDayEnd extends StObject {
  
  var allDay: Boolean = js.native
  
  var end: stringOrDate = js.native
  
  var start: stringOrDate = js.native
}
object AllDayEnd {
  
  @scala.inline
  def apply(allDay: Boolean, end: stringOrDate, start: stringOrDate): AllDayEnd = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDayEnd]
  }
  
  @scala.inline
  implicit class AllDayEndMutableBuilder[Self <: AllDayEnd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: stringOrDate): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: stringOrDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
