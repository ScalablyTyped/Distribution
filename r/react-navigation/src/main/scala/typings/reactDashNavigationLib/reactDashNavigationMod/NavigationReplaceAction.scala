package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationReplaceAction extends NavigationStackAction {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: java.lang.String
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: java.lang.String
  var `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/REPLACE`
}

object NavigationReplaceAction {
  @scala.inline
  def apply(
    key: java.lang.String,
    routeName: java.lang.String,
    `type`: reactDashNavigationLib.reactDashNavigationLibStrings.`Navigation/REPLACE`,
    action: NavigationNavigateAction = null,
    params: NavigationParams = null
  ): NavigationReplaceAction = {
    val __obj = js.Dynamic.literal(key = key, routeName = routeName)
    __obj.updateDynamic("type")(`type`)
    if (action != null) __obj.updateDynamic("action")(action)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationReplaceAction]
  }
}

