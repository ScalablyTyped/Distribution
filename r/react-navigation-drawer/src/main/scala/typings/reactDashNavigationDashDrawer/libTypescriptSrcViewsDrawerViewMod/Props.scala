package typings.reactDashNavigationDashDrawer.libTypescriptSrcViewsDrawerViewMod

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigationDashDrawer.DrawerOptionscontentComponentComponentTypeDrawerCo
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerState
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var descriptors: SceneDescriptorMap
  var `lazy`: Boolean
  var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  var navigationConfig: DrawerOptionscontentComponentComponentTypeDrawerCo
  var screenProps: js.Any
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    `lazy`: Boolean,
    navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
    navigationConfig: DrawerOptionscontentComponentComponentTypeDrawerCo,
    screenProps: js.Any
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

