package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerScene extends js.Object {
  var focused: Boolean
  var index: Double
  var route: NavigationRoute[NavigationParams]
  var tintColor: js.UndefOr[String] = js.undefined
}

object DrawerScene {
  @scala.inline
  def apply(
    focused: Boolean,
    index: Double,
    route: NavigationRoute[NavigationParams],
    tintColor: String = null
  ): DrawerScene = {
    val __obj = js.Dynamic.literal(focused = focused, index = index, route = route.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[DrawerScene]
  }
}

