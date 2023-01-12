package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerAndroidDismissedAction
  extends StObject
     with DatePickerAndroidOpenReturn {
  
  var action: dismissedAction
}
object DatePickerAndroidDismissedAction {
  
  inline def apply(): DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[DatePickerAndroidDismissedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePickerAndroidDismissedAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: dismissedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
