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
  var params: NavigationParams
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object NavigationState {
  @scala.inline
  def apply(
    index: Double,
    isTransitioning: Boolean,
    key: String,
    params: NavigationParams,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationState = {
    val __obj = js.Dynamic.literal(index = index, isTransitioning = isTransitioning, key = key, params = params, routes = routes)
  
    __obj.asInstanceOf[NavigationState]
  }
}

