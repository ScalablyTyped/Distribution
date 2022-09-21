package typings.reactDayPicker

import typings.reactDayPicker.anon.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getMonthWeeksMod {
  
  @JSImport("react-day-picker/dist/components/Table/utils/getMonthWeeks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMonthWeeks(/** The month to get the weeks from */
  month: js.Date, options: Locale): js.Array[MonthWeek] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMonthWeeks")(month.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[MonthWeek]]
  
  trait MonthWeek extends StObject {
    
    /** The dates in the week. */
    var dates: js.Array[js.Date]
    
    /** The week number from the start of the year. */
    var weekNumber: Double
  }
  object MonthWeek {
    
    inline def apply(dates: js.Array[js.Date], weekNumber: Double): MonthWeek = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], weekNumber = weekNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthWeek]
    }
    
    extension [Self <: MonthWeek](x: Self) {
      
      inline def setDates(value: js.Array[js.Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: js.Date*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setWeekNumber(value: Double): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    }
  }
}
