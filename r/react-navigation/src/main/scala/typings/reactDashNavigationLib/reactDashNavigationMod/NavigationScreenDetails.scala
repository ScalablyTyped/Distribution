package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScreenDetails[T] extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  var options: T
  var state: NavigationRoute[NavigationParams]
}

object NavigationScreenDetails {
  @scala.inline
  def apply[T](
    navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams],
    options: T,
    state: NavigationRoute[NavigationParams]
  ): NavigationScreenDetails[T] = {
    val __obj = js.Dynamic.literal(navigation = navigation, options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationScreenDetails[T]]
  }
}

