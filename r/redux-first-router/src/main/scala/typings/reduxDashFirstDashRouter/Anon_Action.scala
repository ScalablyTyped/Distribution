package typings.reduxDashFirstDashRouter

import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.NavigationAction
import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: js.Object
  var navigationAction: Nullable[NavigationAction]
}

object Anon_Action {
  @scala.inline
  def apply(action: js.Object, navigationAction: Nullable[NavigationAction]): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, navigationAction = navigationAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

