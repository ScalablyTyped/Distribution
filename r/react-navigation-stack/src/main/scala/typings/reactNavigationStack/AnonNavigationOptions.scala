package typings.reactNavigationStack

import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenConfig
import typings.reactNavigationStack.vendorTypesMod.StackNavigationOptions
import typings.reactNavigationStack.vendorTypesMod.StackNavigationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNavigationOptions[Params, ScreenProps] extends js.Object {
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ]
  ] = js.undefined
}

object AnonNavigationOptions {
  @scala.inline
  def apply[Params, ScreenProps](
    navigationOptions: NavigationScreenConfig[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], Params], 
      ScreenProps
    ] = null
  ): AnonNavigationOptions[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNavigationOptions[Params, ScreenProps]]
  }
}

