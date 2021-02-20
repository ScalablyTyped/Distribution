package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import typings.reactNative.reactNativeStrings.sharedAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.mod.ShareSharedAction
  - typings.reactNative.mod.ShareDismissedAction
*/
trait ShareAction extends StObject
object ShareAction {
  
  @scala.inline
  def ShareDismissedAction(action: dismissedAction): typings.reactNative.mod.ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.ShareDismissedAction]
  }
  
  @scala.inline
  def ShareSharedAction(action: sharedAction): typings.reactNative.mod.ShareSharedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNative.mod.ShareSharedAction]
  }
}
