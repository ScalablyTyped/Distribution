package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDismissedAction extends ShareAction {
  var action: reactDashNativeLib.reactDashNativeLibStrings.dismissedAction
}

object ShareDismissedAction {
  @scala.inline
  def apply(action: reactDashNativeLib.reactDashNativeLibStrings.dismissedAction): ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = action)
  
    __obj.asInstanceOf[ShareDismissedAction]
  }
}

