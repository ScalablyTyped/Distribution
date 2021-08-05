package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.TimePickerAndroidTimeSetAction
  - typings.reactNative.mod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends StObject
object TimePickerAndroidOpenReturn {
  
  inline def TimePickerAndroidDismissedAction(): typings.reactNative.mod.TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typings.reactNative.mod.TimePickerAndroidDismissedAction]
  }
  
  inline def TimePickerAndroidTimeSetAction(hour: Double, minute: Double): typings.reactNative.mod.TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = "timeSetAction", hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.TimePickerAndroidTimeSetAction]
  }
}
