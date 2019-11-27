package typings.reactDashNavigationDashDrawer

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerContentComponentProps
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.DrawerLockMode
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import typings.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod.ThemedColor
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.`on-drag`
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.back
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.fade
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.front
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.history
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.initialRoute
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.left
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.none
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.right
import typings.reactDashNavigationDashDrawer.reactDashNavigationDashDrawerStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerConfig, react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerRouterConfig, react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerOptions, react-navigation-drawer.react-navigation-drawer/lib/typescript/src/types.NavigationDrawerProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, any>> */
trait CreateNavigatorConfigNavigationDrawerConfigNavigat extends js.Object {
  var backBehavior: js.UndefOr[none | initialRoute | history] = js.undefined
  var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
  var contentOptions: js.UndefOr[js.Object] = js.undefined
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ] = js.undefined
  var drawerBackgroundColor: js.UndefOr[ThemedColor] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var drawerPosition: js.UndefOr[left | right] = js.undefined
  var drawerType: js.UndefOr[front | back | slide] = js.undefined
  var drawerWidth: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var hideStatusBar: js.UndefOr[Boolean] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
  var minSwipeDistance: js.UndefOr[Double] = js.undefined
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var overlayColor: js.UndefOr[ThemedColor] = js.undefined
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
  var screenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var statusBarAnimation: js.UndefOr[slide | none | fade] = js.undefined
  var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
  var swipeEdgeWidth: js.UndefOr[Double] = js.undefined
  var swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}

object CreateNavigatorConfigNavigationDrawerConfigNavigat {
  @scala.inline
  def apply(
    backBehavior: none | initialRoute | history = null,
    contentComponent: ComponentType[DrawerContentComponentProps] = null,
    contentOptions: js.Object = null,
    defaultNavigationOptions: NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], _], 
      _
    ] = null,
    drawerBackgroundColor: ThemedColor = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: left | right = null,
    drawerType: front | back | slide = null,
    drawerWidth: Double | js.Function0[Double] = null,
    edgeWidth: Int | Double = null,
    hideStatusBar: js.UndefOr[Boolean] = js.undefined,
    initialRouteName: String = null,
    keyboardDismissMode: none | `on-drag` = null,
    minSwipeDistance: Int | Double = null,
    navigationOptions: NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ] = null,
    overlayColor: ThemedColor = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined,
    screenContainerStyle: StyleProp[ViewStyle] = null,
    statusBarAnimation: slide | none | fade = null,
    swipeDistanceThreshold: Int | Double = null,
    swipeEdgeWidth: Int | Double = null,
    swipeVelocityThreshold: Int | Double = null,
    unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  ): CreateNavigatorConfigNavigationDrawerConfigNavigat = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerType != null) __obj.updateDynamic("drawerType")(drawerType.asInstanceOf[js.Any])
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hideStatusBar)) __obj.updateDynamic("hideStatusBar")(hideStatusBar.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (minSwipeDistance != null) __obj.updateDynamic("minSwipeDistance")(minSwipeDistance.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    if (screenContainerStyle != null) __obj.updateDynamic("screenContainerStyle")(screenContainerStyle.asInstanceOf[js.Any])
    if (statusBarAnimation != null) __obj.updateDynamic("statusBarAnimation")(statusBarAnimation.asInstanceOf[js.Any])
    if (swipeDistanceThreshold != null) __obj.updateDynamic("swipeDistanceThreshold")(swipeDistanceThreshold.asInstanceOf[js.Any])
    if (swipeEdgeWidth != null) __obj.updateDynamic("swipeEdgeWidth")(swipeEdgeWidth.asInstanceOf[js.Any])
    if (swipeVelocityThreshold != null) __obj.updateDynamic("swipeVelocityThreshold")(swipeVelocityThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountInactiveRoutes)) __obj.updateDynamic("unmountInactiveRoutes")(unmountInactiveRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNavigatorConfigNavigationDrawerConfigNavigat]
  }
}

