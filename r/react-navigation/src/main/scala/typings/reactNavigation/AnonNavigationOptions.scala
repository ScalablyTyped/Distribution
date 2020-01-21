package typings.reactNavigation

import typings.reactNavigation.mod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.undefined
}

object AnonNavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](navigationOptions: NavigationScreenConfig[Options, NavigationScreenPropType, _] = null): AnonNavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptions[Options, NavigationScreenPropType]]
  }
}

