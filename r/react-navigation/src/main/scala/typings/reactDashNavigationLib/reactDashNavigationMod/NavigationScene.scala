package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScene extends js.Object {
  var descriptor: NavigationDescriptor[NavigationParams]
  var index: scala.Double
  var isActive: scala.Boolean
  var isStale: scala.Boolean
  var key: java.lang.String
  var route: NavigationRoute[NavigationParams]
}

object NavigationScene {
  @scala.inline
  def apply(
    descriptor: NavigationDescriptor[NavigationParams],
    index: scala.Double,
    isActive: scala.Boolean,
    isStale: scala.Boolean,
    key: java.lang.String,
    route: NavigationRoute[NavigationParams]
  ): NavigationScene = {
    val __obj = js.Dynamic.literal(descriptor = descriptor, index = index, isActive = isActive, isStale = isStale, key = key, route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationScene]
  }
}

