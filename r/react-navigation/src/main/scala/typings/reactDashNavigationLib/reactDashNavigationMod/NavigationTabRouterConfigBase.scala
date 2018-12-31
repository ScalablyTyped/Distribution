package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait NavigationTabRouterConfigBase extends js.Object {
   // todo: type these as the real route names rather than 'string'
  // Does the back button cause the router to switch to the initial tab
  var backBehavior: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute
  ] = js.undefined
  var initialRouteName: js.UndefOr[java.lang.String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var order: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
}

