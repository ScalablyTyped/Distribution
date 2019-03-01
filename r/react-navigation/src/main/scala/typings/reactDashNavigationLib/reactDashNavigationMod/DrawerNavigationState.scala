package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNavigationState extends NavigationState {
  var isDrawerOpen: scala.Boolean
}

object DrawerNavigationState {
  @scala.inline
  def apply(
    index: scala.Double,
    isDrawerOpen: scala.Boolean,
    isTransitioning: scala.Boolean,
    key: java.lang.String,
    params: NavigationParams,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): DrawerNavigationState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isDrawerOpen")(isDrawerOpen)
    __obj.updateDynamic("isTransitioning")(isTransitioning)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[DrawerNavigationState]
  }
}

