package typings.reactNavigationNative

import typings.react.mod.CElement
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextProps
import typings.reactNavigationCore.anon.Data
import typings.reactNavigationCore.anon.Descriptors
import typings.reactNavigationCore.anon.Options
import typings.reactNavigationCore.anon.PartialStateNavigationSta
import typings.reactNavigationCore.anon.PreventedRoutes
import typings.reactNavigationCore.anon.State
import typings.reactNavigationCore.libTypescriptSrcGetActionFromStateMod.NavigateAction
import typings.reactNavigationCore.libTypescriptSrcGetStateFromPathMod.ResultState
import typings.reactNavigationCore.libTypescriptSrcTypesMod.DefaultNavigatorOptions
import typings.reactNavigationCore.libTypescriptSrcTypesMod.EventMapBase
import typings.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerProps
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRefWithCurrent
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationHelpers
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationCore.libTypescriptSrcTypesMod.TypedNavigator
import typings.reactNavigationCore.libTypescriptSrcTypesMod.global.ReactNavigation.RootParamList
import typings.reactNavigationCore.libTypescriptSrcUseFocusEffectMod.EffectCallback
import typings.reactNavigationCore.libTypescriptSrcUseNavigationStateMod.Selector
import typings.reactNavigationNative.anon.AccessibilityRole
import typings.reactNavigationNative.anon.DocumentTitle
import typings.reactNavigationNative.anon.ServerContextTypechildren
import typings.reactNavigationNative.libTypescriptSrcLinkMod.Props
import typings.reactNavigationNative.libTypescriptSrcTypesMod.Theme
import typings.reactNavigationNative.libTypescriptSrcUseLinkToMod.To
import typings.reactNavigationNative.libTypescriptSrcUseScrollToTopMod.ScrollableWrapper
import typings.reactNavigationNative.reactNavigationNativeStrings.key
import typings.reactNavigationRouters.anon.Merge
import typings.reactNavigationRouters.anon.Path
import typings.reactNavigationRouters.anon.Readonlykeystringindexnum
import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.Action
import typings.reactNavigationRouters.libTypescriptSrcCommonActionsMod.ResetState
import typings.reactNavigationRouters.libTypescriptSrcDrawerRouterMod.DrawerActionType
import typings.reactNavigationRouters.libTypescriptSrcDrawerRouterMod.DrawerNavigationState
import typings.reactNavigationRouters.libTypescriptSrcDrawerRouterMod.DrawerRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackActionType
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackNavigationState
import typings.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabActionType
import typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabNavigationState
import typings.reactNavigationRouters.libTypescriptSrcTabRouterMod.TabRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.CommonNavigationAction
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.DefaultRouterOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.InitialState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.PartialState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.RouterFactory
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-navigation/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps & RefAttributes[NavigationContainerRef[ParamListBase]]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("@react-navigation/native", "BaseRouter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateForAction")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State | PartialState[State] | Null]
    
    inline def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldActionChangeFocus")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object CommonActions {
    
    @JSImport("@react-navigation/native", "CommonActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
    
    inline def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
    inline def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
    inline def navigate(options: Merge): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(options.asInstanceOf[js.Any]).asInstanceOf[Action]
    inline def navigate(options: Path): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(options.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    inline def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
    inline def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    inline def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
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
    
    @JSImport("@react-navigation/native", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def closeDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[DrawerActionType]
    
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
    
    inline def openDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[DrawerActionType]
    
    inline def toggleDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[DrawerActionType]
  }
  
  inline def DrawerRouter(hasDefaultStatusRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(hasDefaultStatusRest.asInstanceOf[js.Any]).asInstanceOf[Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction]]
  
  inline def Link[ParamList /* <: RootParamList */](hasToActionRest: Props[ParamList]): CElement[TextProps, Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("Link")(hasToActionRest.asInstanceOf[js.Any]).asInstanceOf[CElement[TextProps, Text]]
  
  @JSImport("@react-navigation/native", "LinkingContext")
  @js.native
  val LinkingContext: Context[typings.reactNavigationNative.anon.Options] = js.native
  
  inline def NavigationContainer[RootParamList /* <: js.Object */](props: DocumentTitle[RootParamList] & NavigationContainerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("NavigationContainer")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationContainerRefContext")
  @js.native
  val NavigationContainerRefContext: Context[js.UndefOr[NavigationContainerRef[ParamListBase]]] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationContext")
  @js.native
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[
        ParamListBase, 
        String, 
        Unit, 
        typings.reactNavigationCore.anon.Readonlykeystringindexnum, 
        js.Object, 
        js.Object
      ]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  @JSImport("@react-navigation/native", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[ParamListBase, js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/native", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("@react-navigation/native", "PreventRemoveContext")
  @js.native
  val PreventRemoveContext: Context[js.UndefOr[PreventedRoutes]] = js.native
  
  inline def PreventRemoveProvider(hasChildren: typings.reactNavigationCore.libTypescriptSrcPreventRemoveProviderMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreventRemoveProvider")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-navigation/native", "PrivateValueStore")
  @js.native
  open class PrivateValueStore[T /* <: js.Tuple3[Any, Any, Any] */] ()
    extends typings.reactNavigationCore.mod.PrivateValueStore[T]
  
  /**
    * Container component for server rendering.
    *
    * @param props.location Location object to base the initial URL for SSR.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which contains helper methods.
    */
  @JSImport("@react-navigation/native", "ServerContainer")
  @js.native
  val ServerContainer: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  object StackActions {
    
    @JSImport("@react-navigation/native", "StackActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def pop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[StackActionType]
    inline def pop(count: Double): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(count.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    
    inline def popToTop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")().asInstanceOf[StackActionType]
    
    inline def push(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    inline def push(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
    
    inline def replace(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    inline def replace(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
  }
  
  inline def StackRouter(options: StackRouterOptions): Router[StackNavigationState[ParamListBase], Action | StackActionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(options.asInstanceOf[js.Any]).asInstanceOf[Router[StackNavigationState[ParamListBase], Action | StackActionType]]
  
  object TabActions {
    
    @JSImport("@react-navigation/native", "TabActions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    inline def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
  }
  
  inline def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[TabNavigationState[ParamListBase], Action | TabActionType] = ^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(hasInitialRouteNameBackBehavior.asInstanceOf[js.Any]).asInstanceOf[Router[TabNavigationState[ParamListBase], Action | TabActionType]]
  
  inline def ThemeProvider(hasValueChildren: typings.reactNavigationNative.libTypescriptSrcThemingThemeProviderMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasValueChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def UNSTABLEUsePreventRemove(preventRemove: Boolean, callback: js.Function1[/* options */ Data, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UNSTABLE_usePreventRemove")(preventRemove.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createNavigationContainerRef[ParamList /* <: js.Object */](): NavigationContainerRefWithCurrent[ParamList] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNavigationContainerRef")().asInstanceOf[NavigationContainerRefWithCurrent[ParamList]]
  
  inline def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[Any] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[ParamListBase, State, ScreenOptions, EventMap, NavigatorComponent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNavigatorFactory")(Navigator.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    TypedNavigator[ParamListBase, State, ScreenOptions, EventMap, NavigatorComponent]
  ]]
  
  inline def findFocusedRoute(state: InitialState): js.UndefOr[(Omit[Route[String, js.UndefOr[js.Object]], key]) & State] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFocusedRoute")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(Omit[Route[String, js.UndefOr[js.Object]], key]) & State]]
  
  inline def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromState")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  inline def getActionFromState(
    state: PartialStateNavigationSta,
    options: typings.reactNavigationCore.libTypescriptSrcGetActionFromStateMod.Options
  ): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  
  inline def getFocusedRouteNameFromRoute(route: Partial[Route[String, js.UndefOr[js.Object]]]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedRouteNameFromRoute")(route.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getPathFromState[ParamList /* <: js.Object */](state: typings.reactNavigationCore.libTypescriptSrcGetPathFromStateMod.State): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromState")(state.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPathFromState[ParamList /* <: js.Object */](
    state: typings.reactNavigationCore.libTypescriptSrcGetPathFromStateMod.State,
    options: typings.reactNavigationCore.libTypescriptSrcGetPathFromStateMod.Options[ParamList]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStateFromPath[ParamList /* <: js.Object */](path: String): js.UndefOr[ResultState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResultState]]
  inline def getStateFromPath[ParamList /* <: js.Object */](
    path: String,
    options: typings.reactNavigationCore.libTypescriptSrcGetStateFromPathMod.Options[ParamList]
  ): js.UndefOr[ResultState] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateFromPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResultState]]
  
  inline def useFocusEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useIsFocused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFocused")().asInstanceOf[Boolean]
  
  inline def useLinkBuilder(): js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkBuilder")().asInstanceOf[js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]]]
  
  inline def useLinkProps[ParamList /* <: RootParamList */](hasToAction: typings.reactNavigationNative.libTypescriptSrcUseLinkPropsMod.Props[ParamList]): AccessibilityRole = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkProps")(hasToAction.asInstanceOf[js.Any]).asInstanceOf[AccessibilityRole]
  
  inline def useLinkTo[ParamList /* <: RootParamList */](): js.Function1[/* to */ To[ParamList, /* keyof ParamList */ String], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLinkTo")().asInstanceOf[js.Function1[/* to */ To[ParamList, /* keyof ParamList */ String], Unit]]
  
  inline def useNavigation[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[T]
  
  inline def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */](
    createRouter: RouterFactory[State, Any, RouterOptions],
    options: (DefaultNavigatorOptions[ParamListBase, State, ScreenOptions, EventMap]) & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationBuilder")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  
  inline def useNavigationContainerRef[ParamList /* <: js.Object */](): NavigationContainerRefWithCurrent[ParamList] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationContainerRef")().asInstanceOf[NavigationContainerRefWithCurrent[ParamList]]
  
  inline def useNavigationState[ParamList /* <: ParamListBase */, T](selector: Selector[ParamList, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationState")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def usePreventRemoveContext(): PreventedRoutes = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreventRemoveContext")().asInstanceOf[PreventedRoutes]
  
  inline def useRoute[T /* <: RouteProp[ParamListBase, Keyof[ParamListBase]] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoute")().asInstanceOf[T]
  
  inline def useScrollToTop(ref: RefObject[ScrollableWrapper]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useScrollToTop")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[Theme]
  
  inline def validatePathConfig(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePathConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validatePathConfig(config: Any, root: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validatePathConfig")(config.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
