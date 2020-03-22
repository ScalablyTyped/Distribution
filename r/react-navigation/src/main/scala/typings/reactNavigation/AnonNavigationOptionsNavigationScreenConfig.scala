package typings.reactNavigation

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigation.mod.NavigationSwitchProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationOptionsNavigationScreenConfig[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}

object AnonNavigationOptionsNavigationScreenConfig {
  @scala.inline
  def apply[Params, ScreenProps](
    navigationOptions: NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ] = null
  ): AnonNavigationOptionsNavigationScreenConfig[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptionsNavigationScreenConfig[Params, ScreenProps]]
  }
}

