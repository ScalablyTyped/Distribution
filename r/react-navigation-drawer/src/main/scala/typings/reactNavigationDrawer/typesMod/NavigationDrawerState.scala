package typings.reactNavigationDrawer.typesMod

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationState & {  isDrawerOpen  :boolean} */
trait NavigationDrawerState extends js.Object {
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double
  var isDrawerOpen: Boolean
  var isTransitioning: Boolean
  var key: String
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object NavigationDrawerState {
  @scala.inline
  def apply(
    index: Double,
    isDrawerOpen: Boolean,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]],
    params: NavigationParams = null
  ): NavigationDrawerState = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerState]
  }
}

