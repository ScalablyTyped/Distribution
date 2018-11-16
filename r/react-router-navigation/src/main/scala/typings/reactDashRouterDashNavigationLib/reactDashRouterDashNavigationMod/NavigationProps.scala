package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationProps extends NavBarProps {
  var cardStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var configureTransition: js.UndefOr[
    js.Function2[
      /* transitionProps */ reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionProps], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationTransitionSpec
    ]
  ] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]] = js.undefined
}

