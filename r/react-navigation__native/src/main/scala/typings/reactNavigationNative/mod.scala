package typings.reactNavigationNative

import typings.react.mod.CElement
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextProps
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
import typings.reactNavigationNative.anon.AccessibilityRole
import typings.reactNavigationNative.anon.GetInitialState
import typings.reactNavigationNative.anon.NavigationContainerPropst
import typings.reactNavigationNative.anon.ServerContextTypechildren
import typings.reactNavigationNative.linkMod.Props
import typings.reactNavigationNative.typesMod.LinkingOptions
import typings.reactNavigationNative.typesMod.Theme
import typings.reactNavigationNative.useScrollToTopMod.ScrollableWrapper
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
  @JSImport("@react-navigation/native", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("@react-navigation/native", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("@react-navigation/native", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("@react-navigation/native", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(route: KeyParams): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(route: Name): Action = js.native
    
    @JSImport("@react-navigation/native", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("@react-navigation/native", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("@react-navigation/native", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("@react-navigation/native", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  @JSImport("@react-navigation/native", "DarkTheme")
  @js.native
  val DarkTheme: Theme = js.native
  
  @JSImport("@react-navigation/native", "DefaultTheme")
  @js.native
  val DefaultTheme: Theme = js.native
  
  object DrawerActions {
    
    @JSImport("@react-navigation/native", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/native", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/native", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("@react-navigation/native", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    @JSImport("@react-navigation/native", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("@react-navigation/native", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  @JSImport("@react-navigation/native", "Link")
  @js.native
  def Link(hasToActionRest: Props): CElement[TextProps, Text] = js.native
  
  /**
    * Container component which holds the navigation state designed for React Native apps.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree. When deep link handling is enabled, this will override deep links when specified. Make sure that you don't specify an `initialState` when there's a deep link (`Linking.getInitialURL()`).
    * @param props.onReady Callback which is called after the navigation tree mounts.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.theme Theme object for the navigators.
    * @param props.linking Options for deep linking. Deep link handling is enabled when this prop is provided, unless `linking.enabled` is `false`.
    * @param props.fallback Fallback component to render until we have finished getting initial state when linking is enabled. Defaults to `null`.
    * @param props.documentTitle Options to configure the document title on Web. Updating document title is handled by default unless `documentTitle.enabled` is `false`.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("@react-navigation/native", "NavigationContainer")
  @js.native
  val NavigationContainer: ForwardRefExoticComponent[NavigationContainerPropst] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationContext")
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
  @JSImport("@react-navigation/native", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("@react-navigation/native", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typings.reactNavigationCore.mod.PrivateValueStore[A, B, C]
  
  @JSImport("@react-navigation/native", "ServerContainer")
  @js.native
  val ServerContainer: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  object StackActions {
    
    @JSImport("@react-navigation/native", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("@react-navigation/native", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("@react-navigation/native", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    @JSImport("@react-navigation/native", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("@react-navigation/native", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    @JSImport("@react-navigation/native", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("@react-navigation/native", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("@react-navigation/native", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | PayloadSource | TargetType | PayloadSourceTarget | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    @JSImport("@react-navigation/native", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("@react-navigation/native", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("@react-navigation/native", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
  
  @JSImport("@react-navigation/native", "ThemeProvider")
  @js.native
  def ThemeProvider(hasValueChildren: typings.reactNavigationNative.themeProviderMod.Props): Element = js.native
  
  @JSImport("@react-navigation/native", "createNavigatorFactory")
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
  
  @JSImport("@react-navigation/native", "getActionFromState")
  @js.native
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  @JSImport("@react-navigation/native", "getActionFromState")
  @js.native
  def getActionFromState(
    state: PartialStateNavigationSta,
    options: typings.reactNavigationCore.getActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  @JSImport("@react-navigation/native", "getFocusedRouteNameFromRoute")
  @js.native
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) with State): js.UndefOr[String] = js.native
  
  @JSImport("@react-navigation/native", "getPathFromState")
  @js.native
  def getPathFromState(state: typings.reactNavigationCore.getPathFromStateMod.State): String = js.native
  @JSImport("@react-navigation/native", "getPathFromState")
  @js.native
  def getPathFromState(
    state: typings.reactNavigationCore.getPathFromStateMod.State,
    options: typings.reactNavigationCore.getPathFromStateMod.Options
  ): String = js.native
  
  @JSImport("@react-navigation/native", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String): js.UndefOr[ResultState] = js.native
  @JSImport("@react-navigation/native", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String, options: typings.reactNavigationCore.getStateFromPathMod.Options): js.UndefOr[ResultState] = js.native
  
  @JSImport("@react-navigation/native", "useBackButton")
  @js.native
  def useBackButton(ref: RefObject[NavigationContainerRef]): Unit = js.native
  
  @JSImport("@react-navigation/native", "useFocusEffect")
  @js.native
  def useFocusEffect(effect: EffectCallback): Unit = js.native
  
  @JSImport("@react-navigation/native", "useIsFocused")
  @js.native
  def useIsFocused(): Boolean = js.native
  
  @JSImport("@react-navigation/native", "useLinkBuilder")
  @js.native
  def useLinkBuilder(): js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]] = js.native
  
  @JSImport("@react-navigation/native", "useLinkProps")
  @js.native
  def useLinkProps(hasToAction: typings.reactNavigationNative.useLinkPropsMod.Props): AccessibilityRole = js.native
  
  @JSImport("@react-navigation/native", "useLinkTo")
  @js.native
  def useLinkTo(): js.Function1[/* path */ String, Unit] = js.native
  
  @JSImport("@react-navigation/native", "useLinking")
  @js.native
  def useLinking(
    ref: RefObject[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
  
  @JSImport("@react-navigation/native", "useNavigation")
  @js.native
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = js.native
  
  @JSImport("@react-navigation/native", "useNavigationBuilder")
  @js.native
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
  
  @JSImport("@react-navigation/native", "useNavigationState")
  @js.native
  def useNavigationState[T](selector: Selector[T]): T = js.native
  
  @JSImport("@react-navigation/native", "useRoute")
  @js.native
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = js.native
  
  @JSImport("@react-navigation/native", "useScrollToTop")
  @js.native
  def useScrollToTop(ref: RefObject[ScrollableWrapper]): Unit = js.native
  
  @JSImport("@react-navigation/native", "useTheme")
  @js.native
  def useTheme(): Theme = js.native
}
