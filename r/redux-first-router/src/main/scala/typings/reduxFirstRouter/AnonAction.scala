package typings.reduxFirstRouter

import typings.reduxFirstRouter.mod.NavigationAction
import typings.reduxFirstRouter.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: js.Object
  var navigationAction: Nullable[NavigationAction]
}

object AnonAction {
  @scala.inline
  def apply(action: js.Object, navigationAction: Nullable[NavigationAction] = null): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (navigationAction != null) __obj.updateDynamic("navigationAction")(navigationAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAction]
  }
}

