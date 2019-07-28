package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationReplaceActionPayload extends js.Object {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var newKey: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
}

object NavigationReplaceActionPayload {
  @scala.inline
  def apply(
    routeName: String,
    action: NavigationNavigateAction = null,
    key: String = null,
    newKey: String = null,
    params: NavigationParams = null
  ): NavigationReplaceActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (newKey != null) __obj.updateDynamic("newKey")(newKey)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationReplaceActionPayload]
  }
}

