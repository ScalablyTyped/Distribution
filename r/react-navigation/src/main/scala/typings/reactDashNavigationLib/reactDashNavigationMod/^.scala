package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DrawerItems: reactLib.reactMod.ReactNs.ComponentType[reactDashNavigationLib.reactDashNavigationMod.DrawerItemsProps] = js.native
  val HeaderBackButton: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashNavigationLib.reactDashNavigationMod.HeaderBackButtonProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val NavigationEvents: reactLib.reactMod.ReactNs.ComponentType[reactDashNavigationLib.reactDashNavigationMod.NavigationEventsProps] = js.native
  val SafeAreaView: reactLib.reactMod.ReactNs.ComponentClass[
    reactDashNavigationLib.reactDashNavigationMod.SafeAreaViewProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  val StackViewTransitionConfigs: reactDashNavigationLib.reactDashNavigationMod.StackViewTransitionConfigsType = js.native
  val TabBarBottom: reactLib.reactMod.ReactNs.ComponentType[reactDashNavigationLib.reactDashNavigationMod.TabBarBottomProps] = js.native
  val TabBarTop: reactLib.reactMod.ReactNs.ComponentType[reactDashNavigationLib.reactDashNavigationMod.TabBarTopProps] = js.native
  def DrawerNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def DrawerNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    drawerConfig: reactDashNavigationLib.reactDashNavigationMod.DrawerNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def StackNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def StackNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    stackConfig: reactDashNavigationLib.reactDashNavigationMod.StackNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def StackRouter(
    routeConfigs: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    config: reactDashNavigationLib.reactDashNavigationMod.NavigationTabRouterConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[_, _] = js.native
  def SwitchNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def SwitchNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    switchConfig: reactDashNavigationLib.reactDashNavigationMod.SwitchNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def TabNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def TabNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    drawConfig: reactDashNavigationLib.reactDashNavigationMod.TabNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def TabRouter(
    routeConfigs: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    config: reactDashNavigationLib.reactDashNavigationMod.NavigationTabRouterConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[_, _] = js.native
  def createAppContainer(Component: reactDashNavigationLib.reactDashNavigationMod.NavigationNavigator[_, _, _]): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createBottomTabNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createBottomTabNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    drawConfig: reactDashNavigationLib.reactDashNavigationMod.BottomTabNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createDrawerNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createDrawerNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    drawerConfig: reactDashNavigationLib.reactDashNavigationMod.DrawerNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createMaterialTopTabNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createMaterialTopTabNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    drawConfig: reactDashNavigationLib.reactDashNavigationMod.TabNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createNavigationContainer(Component: reactDashNavigationLib.reactDashNavigationMod.NavigationNavigator[_, _, _]): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createNavigator[S, Options](
    view: reactDashNavigationLib.reactDashNavigationMod.NavigationView[Options, S],
    router: reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[S, Options]
  ): js.Any = js.native
  def createNavigator[S, Options](
    view: reactDashNavigationLib.reactDashNavigationMod.NavigationView[Options, S],
    router: reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[S, Options],
    navigatorConfig: js.Object
  ): js.Any = js.native
  def createNavigator[S, Options](
    view: reactDashNavigationLib.reactDashNavigationMod.NavigationView[Options, S],
    router: reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[S, Options],
    navigatorConfig: js.Object,
    navigatorType: reactDashNavigationLib.reactDashNavigationMod.NavigatorType
  ): js.Any = js.native
  def createNavigator[S, Options](
    view: reactDashNavigationLib.reactDashNavigationMod.NavigationView[Options, S],
    router: reactDashNavigationLib.reactDashNavigationMod.NavigationRouter[S, Options],
    navigatorConfig: scala.Null,
    navigatorType: reactDashNavigationLib.reactDashNavigationMod.NavigatorType
  ): js.Any = js.native
  def createStackNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createStackNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    stackConfig: reactDashNavigationLib.reactDashNavigationMod.StackNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createSwitchNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createSwitchNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    switchConfig: reactDashNavigationLib.reactDashNavigationMod.SwitchNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createTabNavigator(routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def createTabNavigator(
    routeConfigMap: reactDashNavigationLib.reactDashNavigationMod.NavigationRouteConfigMap,
    drawConfig: reactDashNavigationLib.reactDashNavigationMod.TabNavigatorConfig
  ): reactDashNavigationLib.reactDashNavigationMod.NavigationContainer = js.native
  def withNavigation[P /* <: reactDashNavigationLib.reactDashNavigationMod.NavigationInjectedProps[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] */](Component: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentType[
    reactDashNavigationLib.reactDashNavigationMod.Omit[P, reactDashNavigationLib.reactDashNavigationLibStrings.navigation]
  ] = js.native
  def withNavigation[P /* <: reactDashNavigationLib.reactDashNavigationMod.NavigationInjectedProps[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] */, T /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](
    Component: T with (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState])
  ): reactLib.reactMod.ReactNs.ComponentType[
    (reactDashNavigationLib.reactDashNavigationMod.Omit[P, reactDashNavigationLib.reactDashNavigationLibStrings.navigation]) with reactDashNavigationLib.Anon_OnRef[T]
  ] = js.native
  def withNavigationFocus[P /* <: reactDashNavigationLib.reactDashNavigationMod.NavigationFocusInjectedProps[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] */](Component: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentType[
    reactDashNavigationLib.reactDashNavigationMod.Omit[P, reactDashNavigationLib.reactDashNavigationLibStrings.isFocused]
  ] = js.native
  def withNavigationFocus[P /* <: reactDashNavigationLib.reactDashNavigationMod.NavigationFocusInjectedProps[reactDashNavigationLib.reactDashNavigationMod.NavigationParams] */, T /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](
    Component: T with (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState])
  ): reactLib.reactMod.ReactNs.ComponentType[
    (reactDashNavigationLib.reactDashNavigationMod.Omit[P, reactDashNavigationLib.reactDashNavigationLibStrings.isFocused]) with reactDashNavigationLib.Anon_OnRef[T]
  ] = js.native
  @JSName("withNavigationFocus")
  def withNavigationFocus_TP[T, P](
    Component: reactLib.reactMod.ReactNs.ComponentType[
      T with reactDashNavigationLib.reactDashNavigationMod.NavigationFocusInjectedProps[P]
    ]
  ): reactLib.reactMod.ReactNs.ComponentType[T with (reactDashNavigationLib.Anon_OnRefAnyComponent[T, P])] = js.native
  @JSName("withNavigation")
  def withNavigation_TP[T, P](
    Component: reactLib.reactMod.ReactNs.ComponentType[T with reactDashNavigationLib.reactDashNavigationMod.NavigationInjectedProps[P]]
  ): reactLib.reactMod.ReactNs.ComponentType[T with (reactDashNavigationLib.Anon_OnRefAny[T, P])] = js.native
}

