package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDismissedAction extends ShareAction {
  var action: dismissedAction
}

object ShareDismissedAction {
  @scala.inline
  def apply(action: dismissedAction): ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = action)
  
    __obj.asInstanceOf[ShareDismissedAction]
  }
}

