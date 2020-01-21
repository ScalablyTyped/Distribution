package typings.reactNavigationMaterialBottomTabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusedRoute extends js.Object {
  var focused: Boolean
  var route: AnonKey
  var tintColor: String
}

object AnonFocusedRoute {
  @scala.inline
  def apply(focused: Boolean, route: AnonKey, tintColor: String): AnonFocusedRoute = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFocusedRoute]
  }
}

