package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationFocusInjectedProps[P] extends NavigationInjectedProps[P] {
  var isFocused: Boolean
}

object NavigationFocusInjectedProps {
  @scala.inline
  def apply[P](isFocused: Boolean, navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationFocusInjectedProps[P] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFocusInjectedProps[P]]
  }
}

