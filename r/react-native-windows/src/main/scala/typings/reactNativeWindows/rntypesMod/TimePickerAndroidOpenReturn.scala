package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWindows.rntypesMod.TimePickerAndroidTimeSetAction
  - typings.reactNativeWindows.rntypesMod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends StObject
object TimePickerAndroidOpenReturn {
  
  inline def TimePickerAndroidDismissedAction(): typings.reactNativeWindows.rntypesMod.TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.TimePickerAndroidDismissedAction]
  }
  
  inline def TimePickerAndroidTimeSetAction(hour: Double, minute: Double): typings.reactNativeWindows.rntypesMod.TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = "timeSetAction", hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.TimePickerAndroidTimeSetAction]
  }
}
