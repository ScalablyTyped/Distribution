package typings.reactNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def SafeAreaView: typings.react.mod.ComponentClass[typings.reactNavigation.mod.SafeAreaViewProps, typings.react.mod.ComponentState] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SafeAreaView").asInstanceOf[typings.react.mod.ComponentClass[typings.reactNavigation.mod.SafeAreaViewProps, typings.react.mod.ComponentState]]
  
  type AnimatedValue = js.Any
  
  type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig with RouterConfig with (typings.reactNavigation.anon.DefaultNavigationOptions[Options, NavigationScreenPropType])
  
  type InferProps[T /* <: typings.react.mod.ComponentType[_] */] = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigation.mod.NavigationInitAction
    - typings.reactNavigation.mod.NavigationStackAction
    - typings.reactNavigation.mod.NavigationTabAction
    - typings.reactNavigation.mod.NavigationDrawerAction
    - typings.reactNavigation.mod.NavigationSwitchAction
    - typings.reactNavigation.anon.Type
  */
  type NavigationAction = typings.reactNavigation.mod._NavigationAction | typings.reactNavigation.mod.NavigationSwitchAction
  
  type NavigationComponent[Options, NavigationPropType] = (typings.reactNavigation.mod.NavigationScreenComponent[Options, NavigationPropType]) | (typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType])
  
  @scala.inline
  def NavigationContext: typings.react.mod.Context[
    typings.reactNavigation.mod.NavigationScreenProp[
      typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
      typings.reactNavigation.mod.NavigationParams
    ]
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationContext").asInstanceOf[typings.react.mod.Context[
    typings.reactNavigation.mod.NavigationScreenProp[
      typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
      typings.reactNavigation.mod.NavigationParams
    ]
  ]]
  
  type NavigationDispatch = js.Function1[/* action */ typings.reactNavigation.mod.NavigationAction, scala.Boolean]
  
  type NavigationEventCallback = js.Function1[/* payload */ typings.reactNavigation.mod.NavigationEventPayload, scala.Unit]
  
  @scala.inline
  def NavigationEvents: typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationEventsProps] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationEvents").asInstanceOf[typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationEventsProps]]
  
  type NavigationNavigator[Options, NavigationPropType] = (typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationNavigatorProps[Options, js.Object, _]]) with (typings.reactNavigation.anon.Router[Options, NavigationPropType])
  
  type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def NavigationProvider: typings.react.mod.ComponentType[typings.reactNavigation.anon.Value] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NavigationProvider").asInstanceOf[typings.react.mod.ComponentType[typings.reactNavigation.anon.Value]]
  
  type NavigationRoute[Params] = typings.reactNavigation.mod.NavigationLeafRoute[Params] | typings.reactNavigation.mod.NavigationStateRoute[Params]
  
  type NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = (typings.reactNavigation.mod.NavigationComponent[Options, NavigationScreenPropType]) | (((typings.reactNavigation.anon.Screen[Options, NavigationScreenPropType]) | (typings.reactNavigation.anon.GetScreen[Options, NavigationScreenPropType])) with (typings.reactNavigation.anon.Path[Options, NavigationScreenPropType, ScreenProps]))
  
  type NavigationRouteConfigMap[Options, NavigationScreenPropType, ScreenProps] = org.scalablytyped.runtime.StringDictionary[
    typings.reactNavigation.mod.NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]
  ]
  
  type NavigationScreenComponent[Options, NavigationScreenPropType] = typings.react.mod.ComponentType[_] with (typings.reactNavigation.anon.NavigationOptions[Options, NavigationScreenPropType])
  
  type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
    /* navigationOptionsContainer */ (typings.reactNavigation.mod.NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with typings.reactNavigation.anon.NavigationOptionsOptions[Options], 
    Options
  ])
  
  type NavigationScreenOptionsGetter[Options] = js.Function3[
    /* navigation */ typings.reactNavigation.mod.NavigationScreenProp[
      typings.reactNavigation.mod.NavigationRoute[js.Any], 
      typings.reactNavigation.mod.NavigationParams
    ], 
    /* screenProps */ js.Any | scala.Null, 
    /* theme */ typings.reactNavigation.mod.SupportedThemes, 
    Options
  ]
  
  type NavigationStateRoute[NavigationLeafRouteParams] = typings.reactNavigation.mod.NavigationLeafRoute[NavigationLeafRouteParams] with typings.reactNavigation.mod.NavigationState
  
  type NavigationSwitchAction = typings.reactNavigation.mod.NavigationJumpToAction
  
  type NavigationSwitchScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationSwitchScreenProps[Params, ScreenProps]]) with (typings.reactNavigation.anon.`1`[Params, ScreenProps])
  
  type NavigationView[Options, State, ScreenProps] = typings.react.mod.ComponentType[
    ((typings.reactNavigation.anon.Descriptors[Options, ScreenProps]) with typings.reactNavigation.mod.NavigationInjectedProps[typings.reactNavigation.mod.NavigationParams]) | js.Any
  ]
  
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  @scala.inline
  def SceneView: typings.react.mod.ComponentType[typings.reactNavigation.mod.SceneViewProps] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SceneView").asInstanceOf[typings.react.mod.ComponentType[typings.reactNavigation.mod.SceneViewProps]]
  
  @scala.inline
  def StackRouter(routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[_, _, _]): typings.reactNavigation.mod.NavigationRouter[_, _] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[_, _]]
  @scala.inline
  def StackRouter(
    routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[_, _, _],
    config: typings.reactNavigation.mod.NavigationTabRouterConfig
  ): typings.reactNavigation.mod.NavigationRouter[_, _] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[_, _]]
  
  @scala.inline
  def SwitchRouter(routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[_, _, _]): typings.reactNavigation.mod.NavigationRouter[_, _] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[_, _]]
  @scala.inline
  def SwitchRouter(
    routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[_, _, _],
    config: typings.reactNavigation.mod.NavigationSwitchRouterConfig
  ): typings.reactNavigation.mod.NavigationRouter[_, _] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("SwitchRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[_, _]]
  
  @scala.inline
  def TabRouter(
    routeConfigs: typings.reactNavigation.mod.NavigationRouteConfigMap[_, _, _],
    config: typings.reactNavigation.mod.NavigationTabRouterConfig
  ): typings.reactNavigation.mod.NavigationRouter[_, _] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(routeConfigs.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationRouter[_, _]]
  
  @scala.inline
  def ThemeContext: typings.react.mod.Context[typings.reactNavigation.mod.SupportedThemes] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ThemeContext").asInstanceOf[typings.react.mod.Context[typings.reactNavigation.mod.SupportedThemes]]
  
  // Themed components
  type ThemedStatusBarProps = typings.react.mod.ComponentProps[typings.reactNavigation.anon.TypeofStatusBar]
  
  type ThemedTextInputProps = typings.react.mod.ComponentProps[typings.reactNavigation.anon.TypeofTextInput]
  
  type ThemedTextProps = typings.react.mod.ComponentProps[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod.Text]]
  
  @scala.inline
  def createAppContainer[Options, NavigationPropType](Component: typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]): typings.reactNavigation.mod.NavigationContainer = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAppContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationContainer]
  
  @scala.inline
  def createKeyboardAwareNavigator[Props](Comp: typings.react.mod.ComponentType[Props], stackConfig: js.Object): typings.react.mod.ComponentType[Props] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createKeyboardAwareNavigator")(Comp.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ComponentType[Props]]
  
  @scala.inline
  def createNavigationContainer[Options, NavigationPropType](Component: typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType]): typings.reactNavigation.mod.NavigationContainer = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigationContainer")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationContainer]
  
  @scala.inline
  def createNavigator[S, Options](
    view: typings.reactNavigation.mod.NavigationView[Options, S, _],
    router: typings.reactNavigation.mod.NavigationRouter[S, Options]
  ): typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createNavigator[S, Options](
    view: typings.reactNavigation.mod.NavigationView[Options, S, _],
    router: typings.reactNavigation.mod.NavigationRouter[S, Options],
    navigatorConfig: js.UndefOr[scala.Nothing],
    navigatorType: typings.reactNavigation.mod.NavigatorType
  ): typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createNavigator[S, Options](
    view: typings.reactNavigation.mod.NavigationView[Options, S, _],
    router: typings.reactNavigation.mod.NavigationRouter[S, Options],
    navigatorConfig: js.Object
  ): typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createNavigator[S, Options](
    view: typings.reactNavigation.mod.NavigationView[Options, S, _],
    router: typings.reactNavigation.mod.NavigationRouter[S, Options],
    navigatorConfig: js.Object,
    navigatorType: typings.reactNavigation.mod.NavigatorType
  ): typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(view.asInstanceOf[js.Any], router.asInstanceOf[js.Any], navigatorConfig.asInstanceOf[js.Any], navigatorType.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
    Options, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ]]
  
  @scala.inline
  def createSwitchNavigator(
    routeConfigMap: typings.reactNavigation.mod.NavigationRouteConfigMap[
      js.Object, 
      typings.reactNavigation.mod.NavigationSwitchProp[
        typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
        typings.reactNavigation.mod.NavigationParams
      ], 
      _
    ]
  ): typings.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ]]
  @scala.inline
  def createSwitchNavigator(
    routeConfigMap: typings.reactNavigation.mod.NavigationRouteConfigMap[
      js.Object, 
      typings.reactNavigation.mod.NavigationSwitchProp[
        typings.reactNavigation.mod.NavigationRoute[typings.reactNavigation.mod.NavigationParams], 
        typings.reactNavigation.mod.NavigationParams
      ], 
      _
    ],
    switchConfig: typings.reactNavigation.anon.CreateNavigatorConfigNavi
  ): typings.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ] = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSwitchNavigator")(routeConfigMap.asInstanceOf[js.Any], switchConfig.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationNavigator[
    js.Object, 
    typings.reactNavigation.mod.NavigationProp[typings.reactNavigation.mod.NavigationState]
  ]]
  
  @scala.inline
  def getActiveChildNavigationOptions[S](navigation: typings.reactNavigation.mod.NavigationProp[S]): typings.reactNavigation.mod.NavigationParams = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any]).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
  @scala.inline
  def getActiveChildNavigationOptions[S](
    navigation: typings.reactNavigation.mod.NavigationProp[S],
    screenProps: js.UndefOr[scala.Nothing],
    theme: typings.reactNavigation.mod.SupportedThemes
  ): typings.reactNavigation.mod.NavigationParams = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
  @scala.inline
  def getActiveChildNavigationOptions[S](navigation: typings.reactNavigation.mod.NavigationProp[S], screenProps: js.Any): typings.reactNavigation.mod.NavigationParams = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
  @scala.inline
  def getActiveChildNavigationOptions[S](
    navigation: typings.reactNavigation.mod.NavigationProp[S],
    screenProps: js.Any,
    theme: typings.reactNavigation.mod.SupportedThemes
  ): typings.reactNavigation.mod.NavigationParams = (typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getActiveChildNavigationOptions")(navigation.asInstanceOf[js.Any], screenProps.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[typings.reactNavigation.mod.NavigationParams]
  
  @scala.inline
  def useTheme(): typings.reactNavigation.mod.SupportedThemes = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[typings.reactNavigation.mod.SupportedThemes]
  
  @scala.inline
  def withNavigation[P /* <: typings.reactNavigation.mod.NavigationInjectedProps[typings.reactNavigation.mod.NavigationParams] */](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[
    typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
    typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]
  ]]
  @scala.inline
  def withNavigation[P /* <: typings.reactNavigation.mod.NavigationInjectedProps[typings.reactNavigation.mod.NavigationParams] */, T /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](Component: T with (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState])): typings.react.mod.ComponentType[
    (typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]) with (typings.reactNavigation.anon.OnRef[T, P])
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
    (typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.navigation]) with (typings.reactNavigation.anon.OnRef[T, P])
  ]]
  
  @scala.inline
  def withNavigationFocus[P /* <: typings.reactNavigation.mod.NavigationFocusInjectedProps[typings.reactNavigation.mod.NavigationParams] */](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[
    typings.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
    ]
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
    typings.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
    ]
  ]]
  @scala.inline
  def withNavigationFocus[P /* <: typings.reactNavigation.mod.NavigationFocusInjectedProps[typings.reactNavigation.mod.NavigationParams] */, T /* <: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState] */](Component: T with (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState])): typings.react.mod.ComponentType[
    (typings.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
    ]) with (typings.reactNavigation.anon.`4`[T, P])
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
    (typings.reactNavigation.mod.Omit[
      P, 
      /* keyof react-navigation.react-navigation.NavigationFocusInjectedProps<react-navigation.react-navigation.NavigationParams> */ typings.reactNavigation.reactNavigationStrings.isFocused | typings.reactNavigation.reactNavigationStrings.navigation
    ]) with (typings.reactNavigation.anon.`4`[T, P])
  ]]
  
  @scala.inline
  def withNavigationFocus_TP[T, P](
    Component: typings.react.mod.ComponentType[T with typings.reactNavigation.mod.NavigationFocusInjectedProps[P]]
  ): typings.react.mod.ComponentType[T with (typings.reactNavigation.anon.`5`[T, P])] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigationFocus")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[T with (typings.reactNavigation.anon.`5`[T, P])]]
  
  @scala.inline
  def withNavigation_TP[T, P](
    Component: typings.react.mod.ComponentType[T with typings.reactNavigation.mod.NavigationInjectedProps[P]]
  ): typings.react.mod.ComponentType[T with (typings.reactNavigation.anon.`3`[T, P])] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withNavigation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[T with (typings.reactNavigation.anon.`3`[T, P])]]
  
  @scala.inline
  def withOrientation[P /* <: typings.reactNavigation.mod.NavigationOrientationInjectedProps */](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[
    typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.isLandscape]
  ] = typings.reactNavigation.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withOrientation")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[
    typings.reactNavigation.mod.Omit[P, typings.reactNavigation.reactNavigationStrings.isLandscape]
  ]]
}
