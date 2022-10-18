package typings.reactNavigation.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.reactNative.mod.Text
import typings.reactNavigation.anon.CreateNavigatorConfigNavi
import typings.reactNavigation.anon.DefaultNavigationOptions
import typings.reactNavigation.anon.Descriptors
import typings.reactNavigation.anon.GetScreen
import typings.reactNavigation.anon.NavigationOptions
import typings.reactNavigation.anon.NavigationOptionsOptions
import typings.reactNavigation.anon.OnRef
import typings.reactNavigation.anon.Params
import typings.reactNavigation.anon.Screen
import typings.reactNavigation.anon.TypeofStatusBar
import typings.reactNavigation.anon.TypeofTextInput
import typings.reactNavigation.anon.Value
import typings.reactNavigation.anon.`0`
import typings.reactNavigation.anon.`2`
import typings.reactNavigation.anon.`3`
import typings.reactNavigation.anon.`4`
import typings.reactNavigation.anon.`5`
import typings.reactNavigation.mod.^
import typings.reactNavigation.reactNavigationStrings.isFocused
import typings.reactNavigation.reactNavigationStrings.isLandscape
import typings.reactNavigation.reactNavigationStrings.navigation
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def NavigationContext: Context[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]] = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationContext").asInstanceOf[Context[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]]]

inline def NavigationEvents: ComponentType[NavigationEventsProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationEvents").asInstanceOf[ComponentType[NavigationEventsProps]]

inline def NavigationProvider: ComponentType[Value] = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationProvider").asInstanceOf[ComponentType[Value]]

inline def SceneView: ComponentType[SceneViewProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SceneView").asInstanceOf[ComponentType[SceneViewProps]]

inline def StackRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any]): NavigationRouter[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[NavigationRouter[Any, Any]]
inline def StackRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any], config: NavigationTabRouterConfig): NavigationRouter[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationRouter[Any, Any]]

inline def SwitchRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any]): NavigationRouter[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[NavigationRouter[Any, Any]]
inline def SwitchRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any], config: NavigationSwitchRouterConfig): NavigationRouter[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationRouter[Any, Any]]

inline def TabRouter(routeConfigs: NavigationRouteConfigMap[Any, Any, Any], config: NavigationTabRouterConfig): NavigationRouter[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[NavigationRouter[Any, Any]]

inline def ThemeContext: Context[SupportedThemes] = ^.asInstanceOf[js.Dynamic].selectDynamic("ThemeContext").asInstanceOf[Context[SupportedThemes]]

inline def createAppContainer[Options, NavigationPropType](Component: NavigationNavigator[Options, NavigationPropType]): NavigationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createAppContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[NavigationContainer]

inline def createKeyboardAwareNavigator[Props](Comp: ComponentType[Props], stackConfig: js.Object): ComponentType[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("createKeyboardAwareNavigator")(Comp.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[ComponentType[Props]]

inline def createNavigationContainer[Options, NavigationPropType](Component: NavigationNavigator[Options, NavigationPropType]): NavigationContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("createNavigationContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[NavigationContainer]

inline def createNavigator[S, Options](view: NavigationView[Options, S, Any], router: NavigationRouter[S, Options]): NavigationNavigator[Options, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Options, NavigationProp[NavigationState]]]
inline def createNavigator[S, Options](
  view: NavigationView[Options, S, Any],
  router: NavigationRouter[S, Options],
  navigatorConfig: js.Object
): NavigationNavigator[Options, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Options, NavigationProp[NavigationState]]]
inline def createNavigator[S, Options](
  view: NavigationView[Options, S, Any],
  router: NavigationRouter[S, Options],
  navigatorConfig: js.Object,
  navigatorType: NavigatorType
): NavigationNavigator[Options, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Options, NavigationProp[NavigationState]]]
inline def createNavigator[S, Options](
  view: NavigationView[Options, S, Any],
  router: NavigationRouter[S, Options],
  navigatorConfig: Unit,
  navigatorType: NavigatorType
): NavigationNavigator[Options, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Options, NavigationProp[NavigationState]]]

inline def createSwitchNavigator(
  routeConfigMap: NavigationRouteConfigMap[
  js.Object, 
  NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
  Any
]
): NavigationNavigator[js.Object, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[js.Object, NavigationProp[NavigationState]]]
inline def createSwitchNavigator(
  routeConfigMap: NavigationRouteConfigMap[
  js.Object, 
  NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
  Any
],
  switchConfig: CreateNavigatorConfigNavi
): NavigationNavigator[js.Object, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any], switchConfig.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[js.Object, NavigationProp[NavigationState]]]

inline def getActiveChildNavigationOptions[S](navigation: NavigationProp[S]): NavigationParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any]).asInstanceOf[NavigationParams]
inline def getActiveChildNavigationOptions[S](navigation: NavigationProp[S], screenProps: Any): NavigationParams = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any])).asInstanceOf[NavigationParams]
inline def getActiveChildNavigationOptions[S](navigation: NavigationProp[S], screenProps: Any, theme: SupportedThemes): NavigationParams = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[NavigationParams]
inline def getActiveChildNavigationOptions[S](navigation: NavigationProp[S], screenProps: Unit, theme: SupportedThemes): NavigationParams = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[NavigationParams]

inline def useTheme(): SupportedThemes = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[SupportedThemes]

inline def withNavigation[P /* <: NavigationInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[Omit[P, navigation]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[P, navigation]]]
inline def withNavigation[P /* <: NavigationInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T & (ComponentClass[P, ComponentState])): ComponentType[(Omit[P, navigation]) & (OnRef[T, P])] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[(Omit[P, navigation]) & (OnRef[T, P])]]

inline def withNavigationFocus[P /* <: NavigationFocusInjectedProps[NavigationParams] */](Component: ComponentType[P]): ComponentType[
Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
]]]
inline def withNavigationFocus[P /* <: NavigationFocusInjectedProps[NavigationParams] */, T /* <: ComponentClass[P, ComponentState] */](Component: T & (ComponentClass[P, ComponentState])): ComponentType[
(Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
]) & (`4`[T, P])] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
(Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ isFocused | navigation
]) & (`4`[T, P])]]

inline def withNavigationFocus_TP[T, P](Component: ComponentType[T & NavigationFocusInjectedProps[P]]): ComponentType[T & (`5`[T, P])] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[T & (`5`[T, P])]]

inline def withNavigation_TP[T, P](Component: ComponentType[T & NavigationInjectedProps[P]]): ComponentType[T & (`3`[T, P])] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[T & (`3`[T, P])]]

inline def withOrientation[P /* <: NavigationOrientationInjectedProps */](Component: ComponentType[P]): ComponentType[Omit[P, isLandscape]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[P, isLandscape]]]

type AnimatedValue = Any

type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig & RouterConfig & (DefaultNavigationOptions[Options, NavigationScreenPropType])

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.mod.NavigationInitAction
  - typings.reactNavigation.mod.NavigationStackAction
  - typings.reactNavigation.mod.NavigationTabAction
  - typings.reactNavigation.mod.NavigationDrawerAction
  - typings.reactNavigation.mod.NavigationSwitchAction
  - typings.reactNavigation.anon.Key
*/
type NavigationAction = _NavigationAction | NavigationSwitchAction

type NavigationComponent[Options, NavigationPropType] = (NavigationScreenComponent[Options, NavigationPropType]) | (NavigationNavigator[Options, NavigationPropType])

type NavigationDispatch = js.Function1[/* action */ NavigationAction, Boolean]

type NavigationEventCallback = js.Function1[/* payload */ NavigationEventPayload, Unit]

type NavigationNavigator[Options, NavigationPropType] = (ComponentType[NavigationNavigatorProps[Options, js.Object, Any]]) & (NavigationOptions[Options, NavigationPropType])

type NavigationParams = StringDictionary[Any]

type NavigationPathsConfig = StringDictionary[String]

type NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = (NavigationComponent[Options, NavigationScreenPropType]) | ((Screen[Options, NavigationScreenPropType]) & (Params[Options, NavigationScreenPropType, ScreenProps])) | ((GetScreen[Options, NavigationScreenPropType]) & (Params[Options, NavigationScreenPropType, ScreenProps]))

type NavigationRouteConfigMap[Options, NavigationScreenPropType, ScreenProps] = StringDictionary[NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]]

type NavigationScreenComponent[Options, NavigationScreenPropType] = ComponentType[Any] & (`0`[Options, NavigationScreenPropType])

type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
/* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) & NavigationOptionsOptions[Options], 
Options])

type NavigationScreenOptionsGetter[Options] = js.Function3[
/* navigation */ NavigationScreenProp[NavigationRoute[Any], NavigationParams], 
/* screenProps */ Any | Null, 
/* theme */ SupportedThemes, 
Options]

type NavigationSwitchAction = NavigationJumpToAction

type NavigationSwitchScreenComponent[Params, ScreenProps] = (ComponentType[NavigationSwitchScreenProps[Params, ScreenProps]]) & (`2`[Params, ScreenProps])

type NavigationView[Options, State, ScreenProps] = ComponentType[
((Descriptors[Options, ScreenProps]) & NavigationInjectedProps[NavigationParams]) | Any]

type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

// Themed components
type ThemedStatusBarProps = ComponentProps[TypeofStatusBar]

type ThemedTextInputProps = ComponentProps[TypeofTextInput]

type ThemedTextProps = ComponentProps[Instantiable0[Text]]
