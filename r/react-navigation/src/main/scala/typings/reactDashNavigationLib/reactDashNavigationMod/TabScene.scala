package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabScene extends js.Object {
  var focused: scala.Boolean
  var index: scala.Double
  var route: NavigationRoute[NavigationParams]
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
}

object TabScene {
  @scala.inline
  def apply(
    focused: scala.Boolean,
    index: scala.Double,
    route: NavigationRoute[NavigationParams],
    tintColor: java.lang.String = null
  ): TabScene = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focused")(focused)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[TabScene]
  }
}

