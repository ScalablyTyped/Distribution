package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsNavigationScreenConfig[Options] extends js.Object {
  var navigationOptions: js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationScreenConfig[Options]] = js.undefined
}

object Anon_NavigationOptionsNavigationScreenConfig {
  @scala.inline
  def apply[Options](
    navigationOptions: reactDashNavigationLib.reactDashNavigationMod.NavigationScreenConfig[Options] = null
  ): Anon_NavigationOptionsNavigationScreenConfig[Options] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptionsNavigationScreenConfig[Options]]
  }
}

