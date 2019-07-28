package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScene extends js.Object {
  var descriptor: NavigationDescriptor[NavigationParams]
  var index: Double
  var isActive: Boolean
  var isStale: Boolean
  var key: String
  var route: NavigationRoute[NavigationParams]
}

object NavigationScene {
  @scala.inline
  def apply(
    descriptor: NavigationDescriptor[NavigationParams],
    index: Double,
    isActive: Boolean,
    isStale: Boolean,
    key: String,
    route: NavigationRoute[NavigationParams]
  ): NavigationScene = {
    val __obj = js.Dynamic.literal(descriptor = descriptor, index = index, isActive = isActive, isStale = isStale, key = key, route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationScene]
  }
}

