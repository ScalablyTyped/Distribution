package typings.reactDashNativeDashNavigation.libDistAdaptersConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationConstants extends js.Object {
  var backButtonId: String
  var bottomTabsHeight: Double
  var statusBarHeight: Double
  var topBarHeight: Double
}

object NavigationConstants {
  @scala.inline
  def apply(backButtonId: String, bottomTabsHeight: Double, statusBarHeight: Double, topBarHeight: Double): NavigationConstants = {
    val __obj = js.Dynamic.literal(backButtonId = backButtonId.asInstanceOf[js.Any], bottomTabsHeight = bottomTabsHeight.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], topBarHeight = topBarHeight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationConstants]
  }
}

