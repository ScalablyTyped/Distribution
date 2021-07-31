package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimePickerAndroidDismissedAction
  extends StObject
     with TimePickerAndroidOpenReturn {
  
  var action: dismissedAction
}
object TimePickerAndroidDismissedAction {
  
  @scala.inline
  def apply(): TimePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[TimePickerAndroidDismissedAction]
  }
  
  @scala.inline
  implicit class TimePickerAndroidDismissedActionMutableBuilder[Self <: TimePickerAndroidDismissedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: dismissedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
