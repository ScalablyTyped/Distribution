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
    params: NavigationParams,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): DrawerNavigationState = {
    val __obj = js.Dynamic.literal(index = index, isDrawerOpen = isDrawerOpen, isTransitioning = isTransitioning, key = key, params = params, routes = routes)
  
    __obj.asInstanceOf[DrawerNavigationState]
  }
}

