package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps
     with TabBarProps {
  var onIndexChange: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.undefined
  var onReset: js.UndefOr[
    js.Function1[
      /* props */ TabBarProps with reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps, 
      scala.Unit
    ]
  ] = js.undefined
}

