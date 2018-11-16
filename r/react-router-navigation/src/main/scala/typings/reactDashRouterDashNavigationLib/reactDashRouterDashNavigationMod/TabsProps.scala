package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TabsProps extends TabBarProps {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* transitionProps */ reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionSpec
    ]
  ] = js.undefined
  // <Tabs /> only:
  var initialLayout: js.UndefOr[reactDashRouterDashNavigationLib.Anon_Height] = js.undefined
}

