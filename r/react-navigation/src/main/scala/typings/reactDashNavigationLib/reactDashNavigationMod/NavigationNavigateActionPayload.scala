package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationNavigateActionPayload extends js.Object {
  // The action to run inside the sub-router
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: java.lang.String
}

object NavigationNavigateActionPayload {
  @scala.inline
  def apply(
    routeName: java.lang.String,
    action: NavigationNavigateAction = null,
    key: java.lang.String = null,
    params: NavigationParams = null
  ): NavigationNavigateActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationNavigateActionPayload]
  }
}

