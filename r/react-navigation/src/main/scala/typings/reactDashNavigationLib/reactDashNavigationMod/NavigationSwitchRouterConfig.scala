package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationSwitchRouterConfig extends js.Object {
  var backBehavior: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute
  ] = js.undefined
  var initialRouteName: js.UndefOr[java.lang.String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var navigationOptions: js.UndefOr[NavigationScreenConfig[NavigationScreenOptions]] = js.undefined
  var order: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to `'none'`
  var resetOnBlur: js.UndefOr[scala.Boolean] = js.undefined
}

