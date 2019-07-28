package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPushActionPayload extends js.Object {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
}

object NavigationPushActionPayload {
  @scala.inline
  def apply(
    routeName: String,
    action: NavigationNavigateAction = null,
    key: String = null,
    params: NavigationParams = null
  ): NavigationPushActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationPushActionPayload]
  }
}

