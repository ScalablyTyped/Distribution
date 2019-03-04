package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] = js.undefined
  var routeName: java.lang.String
}

object Anon_Action {
  @scala.inline
  def apply(
    routeName: java.lang.String,
    action: reactDashNavigationLib.reactDashNavigationMod.NavigationNavigateAction = null,
    key: java.lang.String = null,
    params: reactDashNavigationLib.reactDashNavigationMod.NavigationParams = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(routeName = routeName)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Action]
  }
}

