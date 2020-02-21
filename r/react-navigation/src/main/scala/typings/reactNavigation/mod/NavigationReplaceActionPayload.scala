package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationReplaceActionPayload extends js.Object {
  var action: js.UndefOr[NavigationAction] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var newKey: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
}

object NavigationReplaceActionPayload {
  @scala.inline
  def apply(
    routeName: String,
    action: NavigationAction = null,
    key: String = null,
    newKey: String = null,
    params: NavigationParams = null
  ): NavigationReplaceActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (newKey != null) __obj.updateDynamic("newKey")(newKey.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationReplaceActionPayload]
  }
}

