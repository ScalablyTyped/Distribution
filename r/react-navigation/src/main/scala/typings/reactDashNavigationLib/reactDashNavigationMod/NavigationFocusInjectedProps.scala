package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationFocusInjectedProps[P] extends NavigationInjectedProps[P] {
  var isFocused: scala.Boolean
}

object NavigationFocusInjectedProps {
  @scala.inline
  def apply[P](isFocused: scala.Boolean, navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationFocusInjectedProps[P] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused, navigation = navigation)
  
    __obj.asInstanceOf[NavigationFocusInjectedProps[P]]
  }
}

