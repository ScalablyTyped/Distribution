package typings.reactNavigationCore.navigationActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsActionPayload extends js.Object {
  var key: String
  var params: js.UndefOr[NavigationParams] = js.undefined
}

object NavigationSetParamsActionPayload {
  @scala.inline
  def apply(key: String, params: NavigationParams = null): NavigationSetParamsActionPayload = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationSetParamsActionPayload]
  }
}

