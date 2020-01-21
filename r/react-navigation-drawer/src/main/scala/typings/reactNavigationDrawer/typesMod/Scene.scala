package typings.reactNavigationDrawer.typesMod

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var focused: Boolean
  var index: Double
  var route: NavigationRoute[NavigationParams]
  var tintColor: js.UndefOr[String] = js.undefined
}

object Scene {
  @scala.inline
  def apply(
    focused: Boolean,
    index: Double,
    route: NavigationRoute[NavigationParams],
    tintColor: String = null
  ): Scene = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

