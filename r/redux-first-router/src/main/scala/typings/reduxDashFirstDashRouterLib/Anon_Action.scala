package typings
package reduxDashFirstDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: js.Object
  var navigationAction: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Nullable[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.NavigationAction]
}

object Anon_Action {
  @scala.inline
  def apply(
    action: js.Object,
    navigationAction: reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.Nullable[reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.NavigationAction]
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action, navigationAction = navigationAction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

