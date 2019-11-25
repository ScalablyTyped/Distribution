package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationNavigateAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
}

object Anon_Action {
  @scala.inline
  def apply(
    routeName: String,
    action: NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

