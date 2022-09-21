package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The interface representing a Date object that contains an optional time */
trait DateObject extends StObject {
  
  /** The day of the Date */
  var day: Double
  
  /** The optional hours for the time of a Date */
  var hour: js.UndefOr[Double] = js.undefined
  
  /** The optional minutes for the time of a Date */
  var minute: js.UndefOr[Double] = js.undefined
  
  /** The month of the Date */
  var month: Double
  
  /** The optional seconds for the time of a Date */
  var second: js.UndefOr[Double] = js.undefined
  
  /** The year of the Date */
  var year: Double
}
object DateObject {
  
  inline def apply(day: Double, month: Double, year: Double): DateObject = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
  
  extension [Self <: DateObject](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
