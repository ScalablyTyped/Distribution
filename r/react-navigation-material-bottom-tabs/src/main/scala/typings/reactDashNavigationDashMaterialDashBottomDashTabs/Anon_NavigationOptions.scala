package typings.reactDashNavigationDashMaterialDashBottomDashTabs

import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationOptions extends js.Object {
  var navigationOptions: js.UndefOr[NavigationScreenConfig[NavigationMaterialBottomTabOptions]] = js.undefined
}

object Anon_NavigationOptions {
  @scala.inline
  def apply(navigationOptions: NavigationScreenConfig[NavigationMaterialBottomTabOptions] = null): Anon_NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NavigationOptions]
  }
}

