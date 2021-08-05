package typings.reactNavigation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def NavigationContext: typings.react.mod.Context[
typings.reactNavigation.mod.NavigationScreenProp[
  typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
  typings.reactNavigation.mod.NavigationParams
]] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationContext").asInstanceOf[typings.react.mod.Context[
typings.reactNavigation.mod.NavigationScreenProp[
  typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
  typings.reactNavigation.mod.NavigationParams
]]]

inline def NavigationEvents: typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationEventsProps] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationEvents").asInstanceOf[typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationEventsProps]]

inline def NavigationProvider: typings.react.mod.ComponentType[typings.reactNavigation.anon.Value] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationProvider").asInstanceOf[typings.react.mod.ComponentType[typings.reactNavigation.anon.Value]]

inline def SceneView: typings.react.mod.ComponentType[typings.reactNavigation.mod.SceneViewProps] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SceneView").asInstanceOf[typings.react.mod.ComponentType[typings.reactNavigation.mod.SceneViewProps]]

inline def StackRouter(routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[js.Any, js.Any, js.Any]): typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any]]
inline def StackRouter(
  routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[js.Any, js.Any, js.Any],
  config: typings.reactNavigation.mod.NavigationTabRouterConfig
): typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any]]

inline def SwitchRouter(routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[js.Any, js.Any, js.Any]): typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any]]
inline def SwitchRouter(
  routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[js.Any, js.Any, js.Any],
  config: typings.reactNavigation.mod.NavigationSwitchRouterConfig
): typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any]]

inline def TabRouter(
  routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[js.Any, js.Any, js.Any],
  config: typings.reactNavigation.mod.NavigationTabRouterConfig
): typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[js.Any, js.Any]]

inline def ThemeContext: typings.react.mod.Context[typings.reactNavigation.mod.SupportedThemes] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ThemeContext").asInstanceOf[typings.react.mod.Context[typings.reactNavigation.mod.SupportedThemes]]

inline def createAppContainer[Options, NavigationPropType](Component: typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]): typings.reactNavigation.mod.NavigationContainer = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAppContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationContainer]

inline def createKeyboardAwareNavigator[Props](Comp: typings.react.mod.ComponentType[Props], stackConfig: js.Object): typings.react.mod.ComponentType[Props] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createKeyboardAwareNavigator")(Comp.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ComponentType[Props]]

inline def createNavigationContainer[Options, NavigationPropType](Component: typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]): typings.reactNavigation.mod.NavigationContainer = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigationContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationContainer]

inline def createNavigator[S, Options](
  view: typings.reactNavigation.mod.NavigationView[Options, S, js.Any],
  router: typings.reactNavigation.mod.NavigationRouter[S, Options]
): typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]]]
inline def createNavigator[S, Options](
  view: typings.reactNavigation.mod.NavigationView[Options, S, js.Any],
  router: typings.reactNavigation.mod.NavigationRouter[S, Options],
  navigatorConfig: js.Object
): typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]]]
inline def createNavigator[S, Options](
  view: typings.reactNavigation.mod.NavigationView[Options, S, js.Any],
  router: typings.reactNavigation.mod.NavigationRouter[S, Options],
  navigatorConfig: js.Object,
  navigatorType: typings.reactNavigation.mod.NavigatorType
): typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]]]
inline def createNavigator[S, Options](
  view: typings.reactNavigation.mod.NavigationView[Options, S, js.Any],
  router: typings.reactNavigation.mod.NavigationRouter[S, Options],
  navigatorConfig: scala.Unit,
  navigatorType: typings.reactNavigation.mod.NavigatorType
): typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
Options, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]]]

inline def createSwitchNavigator(
  routeConfigMap: typings.reactNavigation.mod.NavigationRouteConfigMap[
  js.Object, 
  typings.reactNavigation.mod.NavigationSwitchProp[
    typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
    typings.reactNavigation.mod.NavigationParams
  ], 
  js.Any
]
): typings.reactNavigation.mod.NavigationNavigator[
js.Object, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
js.Object, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]]]
inline def createSwitchNavigator(
  routeConfigMap: typings.reactNavigation.mod.NavigationRouteConfigMap[
  js.Object, 
  typings.reactNavigation.mod.NavigationSwitchProp[
    typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
    typings.reactNavigation.mod.NavigationParams
  ], 
  js.Any
],
  switchConfig: typings.reactNavigation.anon.CreateNavigatorConfigNavi
): typings.reactNavigation.mod.NavigationNavigator[
js.Object, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any], switchConfig.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
js.Object, 
typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]]]

inline def getActiveChildNavigationOptions[S](navigation: typings.reactNavigation.mod.NavigationProp[S]): typings.reactNavigation.mod.NavigationParams = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
inline def getActiveChildNavigationOptions[S](navigation: typings.reactNavigation.mod.NavigationProp[S], screenProps: js.Any): typings.reactNavigation.mod.NavigationParams = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
inline def getActiveChildNavigationOptions[S](
  navigation: typings.reactNavigation.mod.NavigationProp[S],
  screenProps: js.Any,
  theme: typings.reactNavigation.mod.SupportedThemes
): typings.reactNavigation.mod.NavigationParams = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
inline def getActiveChildNavigationOptions[S](
  navigation: typings.reactNavigation.mod.NavigationProp[S],
  screenProps: scala.Unit,
  theme: typings.reactNavigation.mod.SupportedThemes
): typings.reactNavigation.mod.NavigationParams = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationParams]

inline def useTheme(): typings.reactNavigation.mod.SupportedThemes = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[typings.reactNavigation.mod.SupportedThemes]

inline def withNavigation[P /* <: typings.reactNavigation.mod.NavigationInjectedProps[typings.reactNavigation.mod.NavigationParams] */](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[
typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]]]
inline def withNavigation[P /* <: typings.reactNavigation.mod.NavigationInjectedProps[typings.reactNavigation.mod.NavigationParams] */, T /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](Component: T & (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState])): typings.react.mod.ComponentType[
(typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]) & (typings.reactNavigation.anon.OnRef[T, P])] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
(typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]) & (typings.reactNavigation.anon.OnRef[T, P])]]

inline def withNavigationFocus[P /* <: typings.reactNavigation.mod.NavigationFocusInjectedProps[typings.reactNavigation.mod.NavigationParams] */](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[
typings.reactNavigation.mod.Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
]] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
typings.reactNavigation.mod.Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
]]]
inline def withNavigationFocus[P /* <: typings.reactNavigation.mod.NavigationFocusInjectedProps[typings.reactNavigation.mod.NavigationParams] */, T /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](Component: T & (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState])): typings.react.mod.ComponentType[
(typings.reactNavigation.mod.Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
]) & (typings.reactNavigation.anon.`3`[T, P])] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
(typings.reactNavigation.mod.Omit[
  P, 
  /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
]) & (typings.reactNavigation.anon.`3`[T, P])]]

inline def withNavigationFocus_TP[T, P](
  Component: typings.react.mod.ComponentType[T & typings.reactNavigation.mod.NavigationFocusInjectedProps[P]]
): typings.react.mod.ComponentType[T & (typings.reactNavigation.anon.`4`[T, P])] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[T & (typings.reactNavigation.anon.`4`[T, P])]]

inline def withNavigation_TP[T, P](
  Component: typings.react.mod.ComponentType[T & typings.reactNavigation.mod.NavigationInjectedProps[P]]
): typings.react.mod.ComponentType[T & (typings.reactNavigation.anon.`2`[T, P])] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[T & (typings.reactNavigation.anon.`2`[T, P])]]

inline def withOrientation[P /* <: typings.reactNavigation.mod.NavigationOrientationInjectedProps */](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[
typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.isLandscape]] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.isLandscape]]]

type AnimatedValue = js.Any

type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig & RouterConfig & (typings.reactNavigation.anon.DefaultNavigationOptions[Options, NavigationScreenPropType])

type InferProps[T /* <: typings.react.mod.ComponentType[js.Any] */] = js.Any

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.mod.NavigationInitAction
  - typings.reactNavigation.mod.NavigationStackAction
  - typings.reactNavigation.mod.NavigationTabAction
  - typings.reactNavigation.mod.NavigationDrawerAction
  - typings.reactNavigation.mod.NavigationSwitchAction
  - typings.reactNavigation.anon.Key
*/
type NavigationAction = typings.reactNavigation.mod._NavigationAction | typings.reactNavigation.mod.NavigationSwitchAction

type NavigationComponent[Options, NavigationPropType] = (typings.reactNavigation.mod.NavigationScreenComponent[Options, NavigationPropType]) | (typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType])

type NavigationDispatch = js.Function1[/* action */ typings.reactNavigation.mod.NavigationAction, scala.Boolean]

type NavigationEventCallback = js.Function1[/* payload */ typings.reactNavigation.mod.NavigationEventPayload, scala.Unit]

type NavigationNavigator[Options, NavigationPropType] = (typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationNavigatorProps[Options, js.Object, js.Any]]) & (typings.reactNavigation.anon.Router[Options, NavigationPropType])

type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]

type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]

type NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = (typings.reactNavigation.mod.NavigationComponent[Options, NavigationScreenPropType]) | (((typings.reactNavigation.anon.Screen[Options, NavigationScreenPropType]) | (typings.reactNavigation.anon.GetScreen[Options, NavigationScreenPropType])) & (typings.reactNavigation.anon.Path[Options, NavigationScreenPropType, ScreenProps]))

type NavigationRouteConfigMap[Options, NavigationScreenPropType, ScreenProps] = org.scalablytyped.runtime.StringDictionary[
typings.reactNavigation.mod.NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]]

type NavigationScreenComponent[Options, NavigationScreenPropType] = typings.react.mod.ComponentType[js.Any] & (typings.reactNavigation.anon.NavigationOptions[Options, NavigationScreenPropType])

type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
/* navigationOptionsContainer */ (typings.reactNavigation.mod.NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) & typings.reactNavigation.anon.NavigationOptionsOptions[Options], 
Options])

type NavigationScreenOptionsGetter[Options] = js.Function3[
/* navigation */ typings.reactNavigation.mod.NavigationScreenProp[
  typings.reactNavigation.mod.NavigationRoute[js.Any], 
  typings.reactNavigation.mod.NavigationParams
], 
/* screenProps */ js.Any | scala.Null, 
/* theme */ typings.reactNavigation.mod.SupportedThemes, 
Options]

type NavigationSwitchAction = typings.reactNavigation.mod.NavigationJumpToAction

type NavigationSwitchScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationSwitchScreenProps[Params, ScreenProps]]) & (typings.reactNavigation.anon.`0`[Params, ScreenProps])

type NavigationView[Options, State, ScreenProps] = typings.react.mod.ComponentType[
((typings.reactNavigation.anon.Descriptors[Options, ScreenProps]) & typings.reactNavigation.mod.NavigationInjectedProps[typings.reactNavigation.mod.NavigationParams]) | js.Any]

type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]

// Themed components
type ThemedStatusBarProps = typings.react.mod.ComponentProps[typings.reactNavigation.anon.TypeofStatusBar]

type ThemedTextInputProps = typings.react.mod.ComponentProps[typings.reactNavigation.anon.TypeofTextInput]

type ThemedTextProps = typings.react.mod.ComponentProps[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod.Text]]
