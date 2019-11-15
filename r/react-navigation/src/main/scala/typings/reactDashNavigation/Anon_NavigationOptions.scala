package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.undefined
}

object Anon_NavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](navigationOptions: NavigationScreenConfig[Options, NavigationScreenPropType, _] = null): Anon_NavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptions[Options, NavigationScreenPropType]]
  }
}

