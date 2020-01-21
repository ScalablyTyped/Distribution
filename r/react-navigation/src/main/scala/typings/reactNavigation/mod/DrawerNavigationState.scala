package typings.reactNavigation.mod

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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigationState]
  }
}

