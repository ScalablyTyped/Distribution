package typings.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimatedValue = js.Any
  type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig with RouterConfig with (typings.reactNavigation.AnonDefaultNavigationOptions[Options, NavigationScreenPropType])
  type InferProps[T /* <: typings.react.mod.ComponentType[_] */] = js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.reactNavigation.mod.NavigationInitAction
    - typings.reactNavigation.mod.NavigationStackAction
    - typings.reactNavigation.mod.NavigationTabAction
    - typings.reactNavigation.mod.NavigationDrawerAction
    - typings.reactNavigation.mod.NavigationSwitchAction
    - typings.reactNavigation.AnonCHILDACTION
  */
  type NavigationAction = typings.reactNavigation.mod._NavigationAction | typings.reactNavigation.mod.NavigationSwitchAction
  type NavigationComponent[Options, NavigationPropType] = (typings.reactNavigation.mod.NavigationScreenComponent[Options, NavigationPropType]) | (typings.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType])
  type NavigationDispatch = js.Function1[/* action */ typings.reactNavigation.mod.NavigationAction, scala.Boolean]
  type NavigationEventCallback = js.Function1[/* payload */ typings.reactNavigation.mod.NavigationEventPayload, scala.Unit]
  type NavigationNavigator[Options, NavigationPropType] = (typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationNavigatorProps[Options, js.Object, _]]) with (typings.reactNavigation.AnonNavigationOptionsRouter[Options, NavigationPropType])
  type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = (typings.reactNavigation.mod.NavigationComponent[Options, NavigationScreenPropType]) | (((typings.reactNavigation.AnonScreen[Options, NavigationScreenPropType]) | (typings.reactNavigation.AnonGetScreen[Options, NavigationScreenPropType])) with (typings.reactNavigation.AnonKey[Options, NavigationScreenPropType, ScreenProps]))
  type NavigationRouteConfigMap[Options, NavigationScreenPropType, ScreenProps] = org.scalablytyped.runtime.StringDictionary[
    typings.reactNavigation.mod.NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]
  ]
  type NavigationScreenComponent[Options, NavigationScreenPropType] = typings.react.mod.ComponentType[_] with (typings.reactNavigation.AnonNavigationOptions[Options, NavigationScreenPropType])
  type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
    /* navigationOptionsContainer */ typings.reactNavigation.NavigationScreenConfigPropsNavigationScreenPropTyp[NavigationScreenPropType, ScreenProps, Options], 
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
  type NavigationSwitchAction = typings.reactNavigation.mod.NavigationJumpToAction
  type NavigationSwitchScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[typings.reactNavigation.mod.NavigationSwitchScreenProps[Params, ScreenProps]]) with (typings.reactNavigation.AnonNavigationOptionsNavigationParams[Params, ScreenProps])
  type NavigationView[Options, State, ScreenProps] = typings.react.mod.ComponentType[
    typings.reactNavigation.descriptorskeystringNavigationDescriptorNavigation[Options, ScreenProps]
  ]
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  // Themed components
  type ThemedStatusBarProps = typings.react.mod.ComponentProps[typings.reactNavigation.TypeofClassStatusBar]
  type ThemedTextInputProps = typings.react.mod.ComponentProps[typings.reactNavigation.TypeofClassTextInput]
  type ThemedTextProps = typings.react.mod.ComponentProps[org.scalablytyped.runtime.Instantiable0[typings.reactNative.mod.Text]]
}
