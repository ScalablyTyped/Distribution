package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerAndroidDismissedAction extends TimePickerAndroidOpenReturn {
  
  var action: dismissedAction = js.native
}
object TimePickerAndroidDismissedAction {
  
  @scala.inline
  def apply(action: dismissedAction): TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerAndroidDismissedAction]
  }
  
  @scala.inline
  implicit class TimePickerAndroidDismissedActionMutableBuilder[Self <: TimePickerAndroidDismissedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: dismissedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
