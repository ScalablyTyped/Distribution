package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.DatePickerAndroidDateSetAction
  - typings.reactNative.mod.DatePickerAndroidDismissedAction
*/
trait DatePickerAndroidOpenReturn extends StObject
object DatePickerAndroidOpenReturn {
  
  @scala.inline
  def DatePickerAndroidDateSetAction(day: Double, month: Double, year: Double): typings.reactNative.mod.DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = "dateSetAction", day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.DatePickerAndroidDateSetAction]
  }
  
  @scala.inline
  def DatePickerAndroidDismissedAction(): typings.reactNative.mod.DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typings.reactNative.mod.DatePickerAndroidDismissedAction]
  }
}
