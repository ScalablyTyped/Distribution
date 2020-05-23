package typings.reduxFirstRouter.anon

import typings.reduxFirstRouter.mod.NavigationAction
import typings.reduxFirstRouter.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: js.Object
  var navigationAction: Nullable[NavigationAction]
}

object Action {
  @scala.inline
  def apply(action: js.Object, navigationAction: js.UndefOr[Null | Nullable[NavigationAction]] = js.undefined): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationAction)) __obj.updateDynamic("navigationAction")(navigationAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

