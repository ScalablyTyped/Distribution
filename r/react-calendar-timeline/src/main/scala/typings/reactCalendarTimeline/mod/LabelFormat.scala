package typings.reactCalendarTimeline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelFormat extends StObject {
  
  var day: TimeFormat
  
  var hour: TimeFormat
  
  var minute: TimeFormat
  
  var month: TimeFormat
  
  var week: TimeFormat
  
  var year: TimeFormat
}
object LabelFormat {
  
  inline def apply(
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
  
  extension [Self <: LabelFormat](x: Self) {
    
    inline def setDay(value: TimeFormat): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: TimeFormat): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: TimeFormat): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: TimeFormat): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: TimeFormat): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setYear(value: TimeFormat): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
