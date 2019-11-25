package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.dismissedAction
import typings.reactDashNative.reactDashNativeStrings.sharedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeMod.ShareSharedAction
  - typings.reactDashNative.reactDashNativeMod.ShareDismissedAction
*/
trait ShareAction extends js.Object

object ShareAction {
  @scala.inline
  def ShareSharedAction(action: sharedAction, activityType: String = null): ShareAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareAction]
  }
  @scala.inline
  def ShareDismissedAction(action: dismissedAction): ShareAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShareAction]
  }
}

