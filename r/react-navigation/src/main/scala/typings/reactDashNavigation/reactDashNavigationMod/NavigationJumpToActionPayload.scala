package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationJumpToActionPayload extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routeName: String
}

object NavigationJumpToActionPayload {
  @scala.inline
  def apply(routeName: String, key: String = null, params: NavigationParams = null): NavigationJumpToActionPayload = {
    val __obj = js.Dynamic.literal(routeName = routeName)
    if (key != null) __obj.updateDynamic("key")(key)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationJumpToActionPayload]
  }
}

