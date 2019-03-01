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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("descriptor")(descriptor)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isStale")(isStale)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationScene]
  }
}

