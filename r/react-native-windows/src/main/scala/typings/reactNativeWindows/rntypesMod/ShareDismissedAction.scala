package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.dismissedAction
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
  
  extension [Self <: ShareDismissedAction](x: Self) {
    
    inline def setAction(value: dismissedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
