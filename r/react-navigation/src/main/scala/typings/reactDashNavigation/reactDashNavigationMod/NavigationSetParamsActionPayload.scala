package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSetParamsActionPayload extends js.Object {
  // The key of the route where the params should be set
  var key: String
  // The new params to merge into the existing route params
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

