package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationScreenConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions[Options, NavigationScreenPropType] extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options, NavigationScreenPropType, _]] = js.undefined
}

object NavigationOptions {
  @scala.inline
  def apply[Options, NavigationScreenPropType](navigationOptions: NavigationScreenConfig[Options, NavigationScreenPropType, _] = null): NavigationOptions[Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions[Options, NavigationScreenPropType]]
  }
}

