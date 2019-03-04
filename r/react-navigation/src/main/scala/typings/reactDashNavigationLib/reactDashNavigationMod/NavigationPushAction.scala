package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPushAction extends NavigationStackAction {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: java.lang.String
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/PUSH`
}

object NavigationPushAction {
  @scala.inline
  def apply(
    routeName: java.lang.String,
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/PUSH`,
    action: NavigationNavigateAction = null,
    key: java.lang.String = null,
    params: NavigationParams = null
  ): NavigationPushAction = {
    val __obj = js.Dynamic.literal(routeName = routeName)
    __obj.updateDynamic("type")(`type`)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationPushAction]
  }
}

