package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePickerAndroidDismissedAction extends StObject {
  
  var action: "dismissedAction"
}
object DatePickerAndroidDismissedAction {
  
  inline def apply(): DatePickerAndroidDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[DatePickerAndroidDismissedAction]
  }
  
  extension [Self <: DatePickerAndroidDismissedAction](x: Self) {
    
    inline def setAction(value: "dismissedAction"): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
