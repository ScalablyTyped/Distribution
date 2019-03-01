package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationState extends js.Object {
  /**
    * Index refers to the active child route in the routes array.
    */
  var index: scala.Double
  var isTransitioning: scala.Boolean
  var key: java.lang.String
  var params: NavigationParams
  var routes: js.Array[NavigationRoute[NavigationParams]]
}

object NavigationState {
  @scala.inline
  def apply(
    index: scala.Double,
    isTransitioning: scala.Boolean,
    key: java.lang.String,
    params: NavigationParams,
    routes: js.Array[NavigationRoute[NavigationParams]]
  ): NavigationState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isTransitioning")(isTransitioning)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("routes")(routes)
    __obj.asInstanceOf[NavigationState]
  }
}

