package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAndroidDismissedAction extends DatePickerAndroidOpenReturn {
  
  var action: dismissedAction = js.native
}
object DatePickerAndroidDismissedAction {
  
  @scala.inline
  def apply(action: dismissedAction): DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerAndroidDismissedAction]
  }
  
  @scala.inline
  implicit class DatePickerAndroidDismissedActionMutableBuilder[Self <: DatePickerAndroidDismissedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: dismissedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
