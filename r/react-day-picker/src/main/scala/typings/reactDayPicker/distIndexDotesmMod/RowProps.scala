package typings.reactDayPicker.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The props for the {@link Row} component.
  */
trait RowProps extends StObject {
  
  /** The days contained in the week. */
  var dates: js.Array[js.Date]
  
  /** The month where the row is displayed. */
  var displayMonth: js.Date
  
  /** The number of the week to render. */
  var weekNumber: Double
}
object RowProps {
  
  inline def apply(dates: js.Array[js.Date], displayMonth: js.Date, weekNumber: Double): RowProps = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], displayMonth = displayMonth.asInstanceOf[js.Any], weekNumber = weekNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
  
  extension [Self <: RowProps](x: Self) {
    
    inline def setDates(value: js.Array[js.Date]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setDatesVarargs(value: js.Date*): Self = StObject.set(x, "dates", js.Array(value*))
    
    inline def setDisplayMonth(value: js.Date): Self = StObject.set(x, "displayMonth", value.asInstanceOf[js.Any])
    
    inline def setWeekNumber(value: Double): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
  }
}
