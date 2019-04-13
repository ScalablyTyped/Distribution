package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DrawerItems: reactLib.reactMod.ComponentType[DrawerItemsProps] = js.native
  val HeaderBackButton: reactLib.reactMod.ComponentClass[HeaderBackButtonProps, reactLib.reactMod.ComponentState] = js.native
  val NavigationContext: reactLib.reactMod.Context[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]] = js.native
  val NavigationEvents: reactLib.reactMod.ComponentType[NavigationEventsProps] = js.native
  val SafeAreaView: reactLib.reactMod.ComponentClass[SafeAreaViewProps, reactLib.reactMod.ComponentState] = js.native
  val StackViewTransitionConfigs: StackViewTransitionConfigsType = js.native
  val TabBarBottom: reactLib.reactMod.ComponentType[TabBarBottomProps] = js.native
  val TabBarTop: reactLib.reactMod.ComponentType[TabBarTopProps] = js.native
  def StackRouter(routeConfigs: NavigationRouteConfigMap, config: NavigationTabRouterConfig): NavigationRouter[_, _] = js.native
  def TabRouter(routeConfigs: NavigationRouteConfigMap, config: NavigationTabRouterConfig): NavigationRouter[_, _] = js.native
  def createAppContainer(Component: NavigationNavigator[_, _, _]): NavigationContainer = js.native
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
  def withNavigation[P /* <: NavigationInjectedProps[NavigationParams] */](Component: reactLib.reactMod.ComponentType[P]): reactLib.reactMod.ComponentType[Omit[P, java.lang.String]] = js.native
  def withNavigation[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](Component: T with (reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState])): reactLib.reactMod.ComponentType[(Omit[P, java.lang.String]) with reactDashNavigationLib.Anon_OnRef[T]] = js.native
  def withNavigationFocus[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: reactLib.reactMod.ComponentType[P]): reactLib.reactMod.ComponentType[Omit[P, java.lang.String]] = js.native
  def withNavigationFocus[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] */](Component: T with (reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState])): reactLib.reactMod.ComponentType[(Omit[P, java.lang.String]) with reactDashNavigationLib.Anon_OnRef[T]] = js.native
  @JSName("withNavigationFocus")
  def withNavigationFocus_TP[T, P](Component: reactLib.reactMod.ComponentType[T with NavigationFocusInjectedProps[P]]): reactLib.reactMod.ComponentType[T with (reactDashNavigationLib.Anon_OnRefAnyComponent[T, P])] = js.native
  @JSName("withNavigation")
  def withNavigation_TP[T, P](Component: reactLib.reactMod.ComponentType[T with NavigationInjectedProps[P]]): reactLib.reactMod.ComponentType[T with (reactDashNavigationLib.Anon_OnRefAny[T, P])] = js.native
}

