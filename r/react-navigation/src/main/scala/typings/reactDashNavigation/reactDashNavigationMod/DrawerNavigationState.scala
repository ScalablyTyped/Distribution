package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNavigationState extends NavigationState {
  var isDrawerOpen: Boolean
}

object DrawerNavigationState {
  @scala.inline
  def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]],
    params: NavigationParams = null
  ): DrawerNavigationState = {
    val __obj = js.Dynamic.literal(index = index, isDrawerOpen = isDrawerOpen, isTransitioning = isTransitioning, key = key, routes = routes)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[DrawerNavigationState]
  }
}

