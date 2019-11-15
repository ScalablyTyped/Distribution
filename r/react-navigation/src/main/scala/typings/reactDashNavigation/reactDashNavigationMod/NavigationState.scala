package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState extends js.Object {
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: Double
  var isTransitioning: Boolean
  var key: String
  var params: js.UndefOr[NavigationParams] = js.undefined
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object NavigationState {
  @scala.inline
  def apply(
    index: Double,
    isTransitioning: Boolean,
    key: String,
    routes: js.Array[NavigationRoute[NavigationParams]],
    params: NavigationParams = null
  ): NavigationState = {
    val __obj = js.Dynamic.literal(index = index, isTransitioning = isTransitioning, key = key, routes = routes)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NavigationState]
  }
}

