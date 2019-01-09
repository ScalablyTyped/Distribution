package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNavigationLib.reactDashNavigationMod.NavigationStackRouterConfig because var conflicts: headerTransitionPreset. Inlined initialRouteName, initialRouteParams, paths, defaultNavigationOptions, navigationOptions, initialRouteKey */ trait StackNavigatorConfig extends NavigationStackViewConfig {
  var containerOptions: js.UndefOr[js.Any] = js.undefined
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[NavigationScreenOptions]] = js.undefined
  var initialRouteKey: js.UndefOr[java.lang.String] = js.undefined
  var initialRouteName: js.UndefOr[java.lang.String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var navigationOptions: js.UndefOr[NavigationScreenConfig[NavigationScreenOptions]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
}

