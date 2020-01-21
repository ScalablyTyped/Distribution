package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDismissedAction extends ShareAction {
  var action: dismissedAction
}

object ShareDismissedAction {
  @scala.inline
  def apply(action: dismissedAction): ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShareDismissedAction]
  }
}

