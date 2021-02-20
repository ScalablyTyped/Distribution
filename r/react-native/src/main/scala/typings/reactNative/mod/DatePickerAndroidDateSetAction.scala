package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dateSetAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAndroidDateSetAction extends DatePickerAndroidOpenReturn {
  
  var action: dateSetAction = js.native
  
  var day: Double = js.native
  
  var month: Double = js.native
  
  var year: Double = js.native
}
object DatePickerAndroidDateSetAction {
  
  @scala.inline
  def apply(action: dateSetAction, day: Double, month: Double, year: Double): DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
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
