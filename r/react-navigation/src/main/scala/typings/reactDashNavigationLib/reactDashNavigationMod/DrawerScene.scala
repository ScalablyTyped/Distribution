package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerScene extends js.Object {
  var focused: scala.Boolean
  var index: scala.Double
  var route: NavigationRoute[NavigationParams]
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
}

object DrawerScene {
  @scala.inline
  def apply(
    focused: scala.Boolean,
    index: scala.Double,
    route: NavigationRoute[NavigationParams],
    tintColor: java.lang.String = null
  ): DrawerScene = {
    val __obj = js.Dynamic.literal(focused = focused, index = index, route = route.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[DrawerScene]
  }
}

