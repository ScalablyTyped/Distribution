package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationAction
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionKey extends js.Object {
  var action: js.UndefOr[NavigationAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String | Anon_Action
}

object Anon_ActionKey {
  @scala.inline
  def apply(
    routeName: String | Anon_Action,
    action: NavigationAction = null,
    key: String = null,
    params: NavigationParams = null
  ): Anon_ActionKey = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_ActionKey]
  }
}

