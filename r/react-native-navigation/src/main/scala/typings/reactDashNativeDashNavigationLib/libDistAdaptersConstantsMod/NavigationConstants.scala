package typings
package reactDashNativeDashNavigationLib.libDistAdaptersConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationConstants extends js.Object {
  var backButtonId: java.lang.String
  var bottomTabsHeight: scala.Double
  var statusBarHeight: scala.Double
  var topBarHeight: scala.Double
}

object NavigationConstants {
  @scala.inline
  def apply(
    backButtonId: java.lang.String,
    bottomTabsHeight: scala.Double,
    statusBarHeight: scala.Double,
    topBarHeight: scala.Double
  ): NavigationConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backButtonId")(backButtonId)
    __obj.updateDynamic("bottomTabsHeight")(bottomTabsHeight)
    __obj.updateDynamic("statusBarHeight")(statusBarHeight)
    __obj.updateDynamic("topBarHeight")(topBarHeight)
    __obj.asInstanceOf[NavigationConstants]
  }
}

