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

object NavigationStackViewConfig {
  @scala.inline
  def apply(
    cardStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    headerBackTitleVisible: js.UndefOr[scala.Boolean] = js.undefined,
    headerLayoutPreset: reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.center = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: reactDashNavigationLib.reactDashNavigationLibStrings.`fade-in-place` | reactDashNavigationLib.reactDashNavigationLibStrings.uikit = null,
    mode: reactDashNavigationLib.reactDashNavigationLibStrings.card | reactDashNavigationLib.reactDashNavigationLibStrings.modal = null,
    onTransitionEnd: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => scala.Unit = null,
    onTransitionStart: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => js.Promise[scala.Unit] | scala.Unit = null,
    transitionConfig: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ NavigationTransitionProps, /* isModal */ scala.Boolean) => TransitionConfig = null,
    transparentCard: js.UndefOr[scala.Boolean] = js.undefined
  ): NavigationStackViewConfig = {
    val __obj = js.Dynamic.literal()
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible)
    if (headerLayoutPreset != null) __obj.updateDynamic("headerLayoutPreset")(headerLayoutPreset.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode)
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    if (transitionConfig != null) __obj.updateDynamic("transitionConfig")(js.Any.fromFunction3(transitionConfig))
    if (!js.isUndefined(transparentCard)) __obj.updateDynamic("transparentCard")(transparentCard)
    __obj.asInstanceOf[NavigationStackViewConfig]
  }
}

