package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationPushActionPayload extends js.Object {
  var action: js.UndefOr[NavigationNavigateAction] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: java.lang.String
}

object NavigationPushActionPayload {
  @scala.inline
  def apply(
    routeName: java.lang.String,
    action: NavigationNavigateAction = null,
    key: java.lang.String = null,
    params: NavigationParams = null
  ): NavigationPushActionPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("routeName")(routeName)
    if (action != null) __obj.updateDynamic("action")(action)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationPushActionPayload]
  }
}

