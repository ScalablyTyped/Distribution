package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackViewConfig extends js.Object {
  var cardStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var headerBackTitleVisible: js.UndefOr[scala.Boolean] = js.undefined
  var headerLayoutPreset: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.center
  ] = js.undefined
  var headerMode: js.UndefOr[HeaderMode] = js.undefined
  var headerTransitionPreset: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.`fade-in-place` | reactDashNavigationLib.reactDashNavigationLibStrings.uikit
  ] = js.undefined
  var mode: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.card | reactDashNavigationLib.reactDashNavigationLibStrings.modal
  ] = js.undefined
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      js.Promise[scala.Unit] | scala.Unit
    ]
  ] = js.undefined
  var transitionConfig: js.UndefOr[
    js.Function3[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ NavigationTransitionProps, 
      /* isModal */ scala.Boolean, 
      TransitionConfig
    ]
  ] = js.undefined
  var transparentCard: js.UndefOr[scala.Boolean] = js.undefined
}

