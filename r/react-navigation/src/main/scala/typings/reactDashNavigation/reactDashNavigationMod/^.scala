package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.reactDashNavigation.Anon_OnRef
import typings.reactDashNavigation.Anon_OnRefAny
import typings.reactDashNavigation.Anon_OnRefAnyComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DrawerItems: ComponentType[DrawerItemsProps] = js.native
  val HeaderBackButton: ComponentClass[HeaderBackButtonProps, ComponentState] = js.native
  val NavigationContext: Context[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]] = js.native
  val NavigationEvents: ComponentType[NavigationEventsProps] = js.native
  val SafeAreaView: ComponentClass[SafeAreaViewProps, ComponentState] = js.native
  val StackViewTransitionConfigs: StackViewTransitionConfigsType = js.native
  val TabBarBottom: ComponentType[TabBarBottomProps] = js.native
  val TabBarTop: ComponentType[TabBarTopProps] = js.native
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
    navigatorConfig: Null,
    navigatorType: NavigatorType
  ): js.Any = js.native
  def createStackNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createStackNavigator(routeConfigMap: NavigationRouteConfigMap, stackConfig: StackNavigatorConfig): NavigationContainer = js.native
  def createSwitchNavigator(routeConfigMap: NavigationRouteConfigMap): NavigationContainer = js.native
  def createSwitchNavigator(routeConfigMap: NavigationRouteConfigMap, switchConfig: SwitchNavigatorConfig): NavigationContainer = js.native
  def withNavigation[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, String]] = js.native
  def withNavigation[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, String]) with Anon_OnRef[T]] = js.native
  def withNavigationFocus[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, String]] = js.native
  def withNavigationFocus[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T with (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, String]) with Anon_OnRef[T]] = js.native
  @JSName("withNavigationFocus")
  def withNavigationFocus_TP[T, P](Component: ComponentType[T with NavigationFocusInjectedProps[P]]): ComponentType[T with (Anon_OnRefAnyComponent[T, P])] = js.native
  @JSName("withNavigation")
  def withNavigation_TP[T, P](Component: ComponentType[T with NavigationInjectedProps[P]]): ComponentType[T with (Anon_OnRefAny[T, P])] = js.native
}

