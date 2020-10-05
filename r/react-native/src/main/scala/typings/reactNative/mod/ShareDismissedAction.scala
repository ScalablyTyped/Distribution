package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.dismissedAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareDismissedAction extends ShareAction {
  var action: dismissedAction = js.native
}

object ShareDismissedAction {
  @scala.inline
  def apply(action: dismissedAction): ShareDismissedAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDismissedAction]
  }
  @scala.inline
  implicit class ShareDismissedActionOps[Self <: ShareDismissedAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: dismissedAction): Self = this.set("action", value.asInstanceOf[js.Any])
  }
  
}

