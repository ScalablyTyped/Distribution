package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.ShareSharedAction
  - typings.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends StObject
object ShareAction {
  
  @scala.inline
  def ShareDismissedAction(): typings.reactNative.mod.ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = "dismissedAction")
    __obj.asInstanceOf[typings.reactNative.mod.ShareDismissedAction]
  }
  
  @scala.inline
  def ShareSharedAction(): typings.reactNative.mod.ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = "sharedAction")
    __obj.asInstanceOf[typings.reactNative.mod.ShareSharedAction]
  }
}
