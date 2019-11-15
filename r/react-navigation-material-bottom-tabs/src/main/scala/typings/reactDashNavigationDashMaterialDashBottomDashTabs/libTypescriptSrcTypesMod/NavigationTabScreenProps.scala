package typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationTabScreenProps[Params, ScreenProps] extends js.Object {
  var navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params]
  var screenProps: ScreenProps
  var theme: SupportedThemes
}

object NavigationTabScreenProps {
  @scala.inline
  def apply[Params, ScreenProps](
    navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params],
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationTabScreenProps[Params, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation, screenProps = screenProps.asInstanceOf[js.Any], theme = theme)
  
    __obj.asInstanceOf[NavigationTabScreenProps[Params, ScreenProps]]
  }
}

