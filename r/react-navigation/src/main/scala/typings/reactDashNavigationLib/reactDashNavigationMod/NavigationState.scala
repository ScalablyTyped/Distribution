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

