package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.dateSetAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerAndroidDateSetAction
  extends StObject
     with DatePickerAndroidOpenReturn {
  
  var action: dateSetAction
  
  var day: Double
  
  var month: Double
  
  var year: Double
}
object DatePickerAndroidDateSetAction {
  
  inline def apply(day: Double, month: Double, year: Double): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = "dateSetAction", day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAndroidDateSetAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePickerAndroidDateSetAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: dateSetAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
