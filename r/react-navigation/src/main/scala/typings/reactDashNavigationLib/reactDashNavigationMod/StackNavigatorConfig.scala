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

object StackNavigatorConfig {
  @scala.inline
  def apply(
    cardStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    containerOptions: js.Any = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    headerBackTitleVisible: js.UndefOr[scala.Boolean] = js.undefined,
    headerLayoutPreset: reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.center = null,
    headerMode: HeaderMode = null,
    headerTransitionPreset: reactDashNavigationLib.reactDashNavigationLibStrings.`fade-in-place` | reactDashNavigationLib.reactDashNavigationLibStrings.uikit = null,
    initialRouteKey: java.lang.String = null,
    initialRouteName: java.lang.String = null,
    initialRouteParams: NavigationParams = null,
    mode: reactDashNavigationLib.reactDashNavigationLibStrings.card | reactDashNavigationLib.reactDashNavigationLibStrings.modal = null,
    navigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    onTransitionEnd: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => scala.Unit = null,
    onTransitionStart: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => js.Promise[scala.Unit] | scala.Unit = null,
    paths: NavigationPathsConfig = null,
    transitionConfig: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ NavigationTransitionProps, /* isModal */ scala.Boolean) => TransitionConfig = null,
    transparentCard: js.UndefOr[scala.Boolean] = js.undefined
  ): StackNavigatorConfig = {
    val __obj = js.Dynamic.literal()
    if (cardStyle != null) __obj.updateDynamic("cardStyle")(cardStyle.asInstanceOf[js.Any])
    if (containerOptions != null) __obj.updateDynamic("containerOptions")(containerOptions)
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(headerBackTitleVisible)) __obj.updateDynamic("headerBackTitleVisible")(headerBackTitleVisible)
    if (headerLayoutPreset != null) __obj.updateDynamic("headerLayoutPreset")(headerLayoutPreset.asInstanceOf[js.Any])
    if (headerMode != null) __obj.updateDynamic("headerMode")(headerMode)
    if (headerTransitionPreset != null) __obj.updateDynamic("headerTransitionPreset")(headerTransitionPreset.asInstanceOf[js.Any])
    if (initialRouteKey != null) __obj.updateDynamic("initialRouteKey")(initialRouteKey)
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (transitionConfig != null) __obj.updateDynamic("transitionConfig")(js.Any.fromFunction3(transitionConfig))
    if (!js.isUndefined(transparentCard)) __obj.updateDynamic("transparentCard")(transparentCard)
    __obj.asInstanceOf[StackNavigatorConfig]
  }
}

