package typings.reactNavigationCore

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactNavigationCore.anon.Descriptors
import typings.reactNavigationCore.anon.Options
import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.anon.State
import typings.reactNavigationCore.getActionFromStateMod.NavigateAction
import typings.reactNavigationCore.getStateFromPathMod.ResultState
import typings.reactNavigationCore.typesMod.DefaultNavigatorOptions
import typings.reactNavigationCore.typesMod.EventMapBase
import typings.reactNavigationCore.typesMod.NavigationContainerProps
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationCore.typesMod.TypedNavigator
import typings.reactNavigationCore.useFocusEffectMod.EffectCallback
import typings.reactNavigationCore.useNavigationStateMod.Selector
import typings.reactNavigationRouters.anon.KeyParams
import typings.reactNavigationRouters.anon.Name
import typings.reactNavigationRouters.anon.Payload
import typings.reactNavigationRouters.anon.PayloadSource
import typings.reactNavigationRouters.anon.PayloadSourceTarget
import typings.reactNavigationRouters.anon.PayloadSourceTargetType
import typings.reactNavigationRouters.anon.Readonlykeystringindexnum
import typings.reactNavigationRouters.anon.Source
import typings.reactNavigationRouters.anon.SourceTargetType
import typings.reactNavigationRouters.anon.TargetType
import typings.reactNavigationRouters.anon.Type
import typings.reactNavigationRouters.commonActionsMod.Action
import typings.reactNavigationRouters.commonActionsMod.ResetState
import typings.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typings.reactNavigationRouters.drawerRouterMod.DrawerNavigationState
import typings.reactNavigationRouters.drawerRouterMod.DrawerRouterOptions
import typings.reactNavigationRouters.stackRouterMod.StackActionType
import typings.reactNavigationRouters.stackRouterMod.StackNavigationState
import typings.reactNavigationRouters.stackRouterMod.StackRouterOptions
import typings.reactNavigationRouters.tabRouterMod.TabActionType
import typings.reactNavigationRouters.tabRouterMod.TabNavigationState
import typings.reactNavigationRouters.tabRouterMod.TabRouterOptions
import typings.reactNavigationRouters.typesMod.CommonNavigationAction
import typings.reactNavigationRouters.typesMod.DefaultRouterOptions
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.PartialState
import typings.reactNavigationRouters.typesMod.Route
import typings.reactNavigationRouters.typesMod.Router
import typings.reactNavigationRouters.typesMod.RouterFactory
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("@react-navigation/core", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("@react-navigation/core", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("@react-navigation/core", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("@react-navigation/core", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(route: KeyParams): Action = js.native
    @JSImport("@react-navigation/core", "CommonActions.navigate")
    @js.native
    def navigate(route: Name): Action = js.native
    
    @JSImport("@react-navigation/core", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("@react-navigation/core", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("@react-navigation/core", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("@react-navigation/core", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  object DrawerActions {
    
    @JSImport("@react-navigation/core", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/core", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/core", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("@react-navigation/core", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/core", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("@react-navigation/core", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  @JSImport("@react-navigation/core", "NavigationContext")
  @js.native
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  @JSImport("@react-navigation/core", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/core", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("@react-navigation/core", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typings.reactNavigationCore.typesMod.PrivateValueStore[A, B, C]
  
  object StackActions {
    
    @JSImport("@react-navigation/core", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("@react-navigation/core", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("@react-navigation/core", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    @JSImport("@react-navigation/core", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("@react-navigation/core", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    @JSImport("@react-navigation/core", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("@react-navigation/core", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("@react-navigation/core", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    @JSImport("@react-navigation/core", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/core", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("@react-navigation/core", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
  
  @JSImport("@react-navigation/core", "createNavigatorFactory")
  @js.native
  def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
  
  @JSImport("@react-navigation/core", "getActionFromState")
  @js.native
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  @JSImport("@react-navigation/core", "getActionFromState")
  @js.native
  def getActionFromState(
    state: PartialStateNavigationSta,
    options: typings.reactNavigationCore.getActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  @JSImport("@react-navigation/core", "getFocusedRouteNameFromRoute")
  @js.native
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) with State): js.UndefOr[String] = js.native
  
  @JSImport("@react-navigation/core", "getPathFromState")
  @js.native
  def getPathFromState(state: typings.reactNavigationCore.getPathFromStateMod.State): String = js.native
  @JSImport("@react-navigation/core", "getPathFromState")
  @js.native
  def getPathFromState(
    state: typings.reactNavigationCore.getPathFromStateMod.State,
    options: typings.reactNavigationCore.getPathFromStateMod.Options
  ): String = js.native
  
  @JSImport("@react-navigation/core", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String): js.UndefOr[ResultState] = js.native
  @JSImport("@react-navigation/core", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String, options: typings.reactNavigationCore.getStateFromPathMod.Options): js.UndefOr[ResultState] = js.native
  
  @JSImport("@react-navigation/core", "useFocusEffect")
  @js.native
  def useFocusEffect(effect: EffectCallback): Unit = js.native
  
  @JSImport("@react-navigation/core", "useIsFocused")
  @js.native
  def useIsFocused(): Boolean = js.native
  
  @JSImport("@react-navigation/core", "useNavigation")
  @js.native
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = js.native
  
  @JSImport("@react-navigation/core", "useNavigationBuilder")
  @js.native
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
  
  @JSImport("@react-navigation/core", "useNavigationState")
  @js.native
  def useNavigationState[T](selector: Selector[T]): T = js.native
  
  @JSImport("@react-navigation/core", "useRoute")
  @js.native
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = js.native
}
