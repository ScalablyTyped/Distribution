package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", JSImport.Namespace)
@js.native
object reactDashNavigationModMembers extends js.Object {
  val DrawerItems: reactLib.reactMod.ReactNs.ReactType[js.Any] = js.native
  val HeaderBackButton: reactLib.reactMod.ReactNs.ComponentClass[HeaderBackButtonProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val NavigationEvents: reactLib.reactMod.ReactNs.ComponentType[NavigationEventsProps] = js.native
  val SafeAreaView: reactLib.reactMod.ReactNs.ComponentClass[SafeAreaViewProps, reactLib.reactMod.ReactNs.ComponentState] = js.native
  val StackViewTransitionConfigs: StackViewTransitionConfigsType = js.native
  val TabBarBottom: reactLib.reactMod.ReactNs.ComponentType[TabBarBottomProps] = js.native
  val TabBarTop: reactLib.reactMod.ReactNs.ComponentType[TabBarTopProps] = js.native
  def DrawerNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def DrawerNavigator(routeConfigMap: NavigationRouteConfigMap, drawerConfig: DrawerNavigatorConfig): NavigationContainer = js.native
  def StackNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def StackNavigator(routeConfigMap: NavigationRouteConfigMap, stackConfig: StackNavigatorConfig): NavigationContainer = js.native
  def StackRouter(routeConfigs: NavigationRouteConfigMap, config: NavigationTabRouterConfig): NavigationRouter[_, _] = js.native
  def SwitchNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def SwitchNavigator(routeConfigMap: NavigationRouteConfigMap, switchConfig: SwitchNavigatorConfig): NavigationContainer = js.native
  def TabNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def TabNavigator(routeConfigMap: NavigationRouteConfigMap, drawConfig: TabNavigatorConfig): NavigationContainer = js.native
  def TabRouter(routeConfigs: NavigationRouteConfigMap, config: NavigationTabRouterConfig): NavigationRouter[_, _] = js.native
  def createBottomTabNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createBottomTabNavigator(routeConfigMap: NavigationRouteConfigMap, drawConfig: BottomTabNavigatorConfig): NavigationContainer = js.native
  def createDrawerNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createDrawerNavigator(routeConfigMap: NavigationRouteConfigMap, drawerConfig: DrawerNavigatorConfig): NavigationContainer = js.native
  def createMaterialTopTabNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createMaterialTopTabNavigator(routeConfigMap: NavigationRouteConfigMap, drawConfig: TabNavigatorConfig): NavigationContainer = js.native
  def createNavigationContainer(Component: NavigationNavigator[_, _, _]): NavigationContainer = js.native
  def createNavigator[S, Options](view: NavigationView[Options, S], router: NavigationRouter[S, Options]): js.Any = js.native
  def createNavigator[S, Options](view: NavigationView[Options, S], router: NavigationRouter[S, Options], navigatorConfig: js.Object): js.Any = js.native
  def createNavigator[S, Options](
    view: NavigationView[Options, S],
    router: NavigationRouter[S, Options],
    navigatorConfig: js.Object,
    navigatorType: NavigatorType
  ): js.Any = js.native
  def createNavigator[S, Options](
    view: NavigationView[Options, S],
    router: NavigationRouter[S, Options],
    navigatorConfig: scala.Null,
    navigatorType: NavigatorType
  ): js.Any = js.native
  def createStackNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createStackNavigator(routeConfigMap: NavigationRouteConfigMap, stackConfig: StackNavigatorConfig): NavigationContainer = js.native
  def createSwitchNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createSwitchNavigator(routeConfigMap: NavigationRouteConfigMap, switchConfig: SwitchNavigatorConfig): NavigationContainer = js.native
  def createTabNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createTabNavigator(routeConfigMap: NavigationRouteConfigMap, drawConfig: TabNavigatorConfig): NavigationContainer = js.native
  def withNavigation[T /* <: reactLib.reactMod.ReactNs.ComponentType[NavigationInjectedProps[NavigationParams]] */](Component: T): reactLib.reactMod.ReactNs.ComponentType[
    Omit[InferProps[T], reactDashNavigationLib.reactDashNavigationLibStrings.navigation]
  ] = js.native
  def withNavigation[T, P](Component: reactLib.reactMod.ReactNs.ComponentType[T | (T with NavigationInjectedProps[P])]): reactLib.reactMod.ReactNs.ComponentType[T with (reactDashNavigationLib.Anon_OnRefRefComponent[T, P])] = js.native
  def withNavigationFocus[T /* <: reactLib.reactMod.ReactNs.ComponentType[NavigationFocusInjectedProps[NavigationParams]] */](Component: T): reactLib.reactMod.ReactNs.ComponentType[
    Omit[InferProps[T], reactDashNavigationLib.reactDashNavigationLibStrings.isFocused]
  ] = js.native
  def withNavigationFocus[T, P](Component: reactLib.reactMod.ReactNs.ComponentType[T with NavigationFocusInjectedProps[P]]): reactLib.reactMod.ReactNs.ComponentType[T with (reactDashNavigationLib.Anon_OnRefRef[T, P])] = js.native
  @JSName("withNavigationFocus")
  def withNavigationFocus_TComponentClass[T /* <: reactLib.reactMod.ReactNs.ComponentClass[
    NavigationFocusInjectedProps[NavigationParams], 
    reactLib.reactMod.ReactNs.ComponentState
  ] */](Component: T): reactLib.reactMod.ReactNs.ComponentType[
    (Omit[InferProps[T], reactDashNavigationLib.reactDashNavigationLibStrings.isFocused]) with reactDashNavigationLib.Anon_OnRef[T]
  ] = js.native
  @JSName("withNavigation")
  def withNavigation_TComponentClass[T /* <: reactLib.reactMod.ReactNs.ComponentClass[
    NavigationInjectedProps[NavigationParams], 
    reactLib.reactMod.ReactNs.ComponentState
  ] */](Component: T): reactLib.reactMod.ReactNs.ComponentType[
    (Omit[InferProps[T], reactDashNavigationLib.reactDashNavigationLibStrings.navigation]) with reactDashNavigationLib.Anon_OnRefRefInstanceType[T]
  ] = js.native
}

