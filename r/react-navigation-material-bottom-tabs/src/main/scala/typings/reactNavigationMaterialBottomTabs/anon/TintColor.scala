package typings.reactNavigationMaterialBottomTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TintColor extends js.Object {
  var focused: Boolean
  var route: Key
  var tintColor: String
}

object TintColor {
  @scala.inline
  def apply(focused: Boolean, route: Key, tintColor: String): TintColor = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintColor]
  }
}

