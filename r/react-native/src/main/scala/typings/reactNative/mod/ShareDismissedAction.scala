package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareDismissedAction
  extends StObject
     with ShareAction {
  
  var action: dismissedAction
}
object ShareDismissedAction {
  
  inline def apply(): ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[ShareDismissedAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareDismissedAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: dismissedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
