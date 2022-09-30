package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWindows.rntypesMod.DatePickerAndroidDateSetAction
  - typings.reactNativeWindows.rntypesMod.DatePickerAndroidDismissedAction
*/
trait DatePickerAndroidOpenReturn extends StObject
object DatePickerAndroidOpenReturn {
  
  inline def DatePickerAndroidDateSetAction(day: Double, month: Double, year: Double): typings.reactNativeWindows.rntypesMod.DatePickerAndroidDateSetAction = {
    val __obj = js.Dynamic.literal(action = "dateSetAction", day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.DatePickerAndroidDateSetAction]
  }
  
  inline def DatePickerAndroidDismissedAction(): typings.reactNativeWindows.rntypesMod.DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.DatePickerAndroidDismissedAction]
  }
}
