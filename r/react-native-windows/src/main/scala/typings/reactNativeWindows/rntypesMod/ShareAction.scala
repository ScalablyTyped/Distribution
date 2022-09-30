package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeWindows.rntypesMod.ShareSharedAction
  - typings.reactNativeWindows.rntypesMod.ShareDismissedAction
*/
trait ShareAction extends StObject
object ShareAction {
  
  inline def ShareDismissedAction(): typings.reactNativeWindows.rntypesMod.ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.ShareDismissedAction]
  }
  
  inline def ShareSharedAction(): typings.reactNativeWindows.rntypesMod.ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = "sharedAction")
    __obj.asInstanceOf[typings.reactNativeWindows.rntypesMod.ShareSharedAction]
  }
}
