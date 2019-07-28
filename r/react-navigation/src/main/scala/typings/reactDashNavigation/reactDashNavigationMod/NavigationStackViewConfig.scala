package typings.reactDashNavigation.reactDashNavigationMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationStrings.`fade-in-place`
import typings.reactDashNavigation.reactDashNavigationStrings.card
import typings.reactDashNavigation.reactDashNavigationStrings.center
import typings.reactDashNavigation.reactDashNavigationStrings.left
import typings.reactDashNavigation.reactDashNavigationStrings.modal
import typings.reactDashNavigation.reactDashNavigationStrings.uikit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationStackViewConfig extends js.Object {
  var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined
  var headerLayoutPreset: js.UndefOr[left | center] = js.undefined
  var headerMode: js.UndefOr[HeaderMode] = js.undefined
  var headerTransitionPreset: js.UndefOr[`fade-in-place` | uikit] = js.undefined
  var mode: js.UndefOr[card | modal] = js.undefined
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  var transitionConfig: js.UndefOr[
    js.Function3[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ NavigationTransitionProps, 
      /* isModal */ Boolean, 
      TransitionConfig
    ]
  ] = js.undefined
  var transparentCard: js.UndefOr[Boolean] = js.undefined
}

object NavigationStackViewConfig {
  @scala.inline
  def apply(
    cardStyle: StyleProp[ViewStyle] = null,
    headerBackTitleVisible: js.UndefOr[Boolean] = js.undefined,
    headerLayoutPreset: left | center = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: `fade-in-place` | uikit = null,
    mode: card | modal = null,
    onTransitionEnd: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => Unit = null,
    onTransitionStart: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => js.Promise[Unit] | Unit = null,
    transitionConfig: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ NavigationTransitionProps, /* isModal */ Boolean) => TransitionConfig = null,
    transparentCard: js.UndefOr[Boolean] = js.undefined
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

