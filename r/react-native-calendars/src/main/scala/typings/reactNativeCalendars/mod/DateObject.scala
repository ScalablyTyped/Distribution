package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateObject extends StObject {
  
  var dateString: String = js.native
  
  var day: Double = js.native
  
  var month: Double = js.native
  
  var timestamp: Double = js.native
  
  var year: Double = js.native
}
object DateObject {
  
  @scala.inline
  def apply(dateString: String, day: Double, month: Double, timestamp: Double, year: Double): DateObject = {
    val __obj = js.Dynamic.literal(dateString = dateString.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  @scala.inline
  implicit class DateObjectMutableBuilder[Self <: DateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateString(value: String): Self = StObject.set(x, "dateString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
