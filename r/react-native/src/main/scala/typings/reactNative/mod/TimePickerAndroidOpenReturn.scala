package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import typings.reactNative.reactNativeStrings.timeSetAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.TimePickerAndroidTimeSetAction
  - typings.reactNative.mod.TimePickerAndroidDismissedAction
*/
trait TimePickerAndroidOpenReturn extends StObject
object TimePickerAndroidOpenReturn {
  
  @scala.inline
  def TimePickerAndroidDismissedAction(action: dismissedAction): typings.reactNative.mod.TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.TimePickerAndroidDismissedAction]
  }
  
  @scala.inline
  def TimePickerAndroidTimeSetAction(action: timeSetAction, hour: Double, minute: Double): typings.reactNative.mod.TimePickerAndroidTimeSetAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.TimePickerAndroidTimeSetAction]
  }
}
