package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptionsNavigationScreenConfig[Options] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options]] = js.undefined
}

object Anon_NavigationOptionsNavigationScreenConfig {
  @scala.inline
  def apply[Options](navigationOptions: NavigationScreenConfig[Options] = null): Anon_NavigationOptionsNavigationScreenConfig[Options] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptionsNavigationScreenConfig[Options]]
  }
}

