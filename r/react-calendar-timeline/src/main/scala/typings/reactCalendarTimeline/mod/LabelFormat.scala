package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelFormat extends StObject {
  
  var day: TimeFormat = js.native
  
  var hour: TimeFormat = js.native
  
  var minute: TimeFormat = js.native
  
  var month: TimeFormat = js.native
  
  var week: TimeFormat = js.native
  
  var year: TimeFormat = js.native
}
object LabelFormat {
  
  @scala.inline
  def apply(
    day: TimeFormat,
    hour: TimeFormat,
    minute: TimeFormat,
    month: TimeFormat,
    week: TimeFormat,
    year: TimeFormat
  ): LabelFormat = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelFormat]
  }
  
  @scala.inline
  implicit class LabelFormatMutableBuilder[Self <: LabelFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: TimeFormat): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: TimeFormat): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: TimeFormat): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: TimeFormat): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: TimeFormat): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: TimeFormat): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
