package typings.reactDashNavigationDashMaterialDashBottomDashTabs

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationPathsConfig
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenConfig
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabOptions
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationTabProp
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.history
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.initialRoute
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.none
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.reactDashNavigationDashMaterialDashBottomDashTabsStrings.order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<react-navigation-material-bottom-tabs.react-navigation-material-bottom-tabs/lib/typescript/src/types.NavigationMaterialBottomTabConfig, react-navigation.react-navigation.NavigationTabRouterConfig, react-navigation-material-bottom-tabs.react-navigation-material-bottom-tabs/lib/typescript/src/types.NavigationMaterialBottomTabOptions, react-navigation-material-bottom-tabs.react-navigation-material-bottom-tabs/lib/typescript/src/types.NavigationTabProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, any>> */
trait CreateNavigatorConfigNavigationMaterialBottomTabCo extends js.Object {
  var activeColorDark: js.UndefOr[String] = js.undefined
  var activeColorLight: js.UndefOr[String] = js.undefined
   // todo: type these as the real route names rather than 'string'
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ]
  ] = js.undefined
  var inactiveColorDark: js.UndefOr[String] = js.undefined
  var inactiveColorLight: js.UndefOr[String] = js.undefined
  var initialRouteName: js.UndefOr[String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ]
  ] = js.undefined
  var order: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to 'initialRoute'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}

object CreateNavigatorConfigNavigationMaterialBottomTabCo {
  @scala.inline
  def apply(
    activeColorDark: String = null,
    activeColorLight: String = null,
    backBehavior: none | initialRoute | history | order = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    defaultNavigationOptions: NavigationScreenConfig[
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], _], 
      _
    ] = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null,
    initialRouteName: String = null,
    initialRouteParams: NavigationParams = null,
    navigationOptions: NavigationScreenConfig[
      StringDictionary[_], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      _
    ] = null,
    order: js.Array[String] = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[Boolean] = js.undefined
  ): CreateNavigatorConfigNavigationMaterialBottomTabCo = {
    val __obj = js.Dynamic.literal()
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark.asInstanceOf[js.Any])
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight.asInstanceOf[js.Any])
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark.asInstanceOf[js.Any])
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName.asInstanceOf[js.Any])
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNavigatorConfigNavigationMaterialBottomTabCo]
  }
}

