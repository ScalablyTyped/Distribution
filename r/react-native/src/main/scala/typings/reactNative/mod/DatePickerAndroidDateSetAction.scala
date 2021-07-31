package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dateSetAction
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
  
  @scala.inline
  def apply(day: Double, month: Double, year: Double): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = "dateSetAction", day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAndroidDateSetAction]
  }
  
  @scala.inline
  implicit class DatePickerAndroidDateSetActionMutableBuilder[Self <: DatePickerAndroidDateSetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: dateSetAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
