package typings.reactDashNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNavigationMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ReactElement
  import typings.reactDashNative.reactDashNativeMod.ViewStyle
  import typings.reactDashNavigation.Anon_Descriptors
  import typings.reactDashNavigation.Anon_NavigationOptions
  import typings.reactDashNavigation.Anon_NavigationOptionsNavigationScreenConfig
  import typings.reactDashNavigation.Anon_NavigationOptionsPath
  import typings.reactDashNavigation.Anon_NavigationOptionsRouter
  import typings.std.Exclude
  import typings.std.Pick

  type AnimatedValue = js.Any
  type InferProps[T /* <: ComponentType[_] */] = js.Any
  type NavigationAnimationSetter = js.Function3[
    /* position */ AnimatedValue, 
    /* newState */ NavigationState, 
    /* lastState */ NavigationState, 
    Unit
  ]
  type NavigationComponent = (NavigationScreenComponent[NavigationParams, js.Any, js.Any]) | (NavigationNavigator[js.Any, js.Any, js.Any]) | js.Any
  type NavigationDispatch = js.Function1[/* action */ NavigationAction, Boolean]
  type NavigationEventCallback = js.Function1[/* payload */ NavigationEventPayload, Unit]
  type NavigationNavigator[State, Options, Props] = (ComponentType[(NavigationNavigatorProps[Options, State]) with Props]) with (Anon_NavigationOptionsRouter[State, Options])
  type NavigationParams = StringDictionary[js.Any]
  type NavigationPathsConfig = StringDictionary[String]
  type NavigationRoute[Params] = NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  type NavigationRouteConfig = NavigationComponent | (Anon_NavigationOptionsPath with NavigationScreenRouteConfig)
  type NavigationRouteConfigMap = StringDictionary[NavigationRouteConfig]
  type NavigationSceneRenderer = js.Function0[ReactElement | Null]
  type NavigationSceneRendererProps = NavigationTransitionProps
  type NavigationScreenComponent[Params, Options, Props] = (ComponentType[(NavigationScreenProps[Params, Options]) with Props]) with Anon_NavigationOptionsNavigationScreenConfig[Options]
  type NavigationScreenConfig[Options] = Options | (js.Function1[
    /* navigationOptionsContainer */ NavigationScreenConfigProps with Anon_NavigationOptions, 
    Options
  ])
  type NavigationScreenOption[T] = T | (js.Function2[
    /* navigation */ NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
    /* config */ T, 
    T
  ])
  type NavigationScreenOptions = NavigationStackScreenOptions with NavigationTabScreenOptions with NavigationDrawerScreenOptions
  type NavigationScreenOptionsGetter[Options] = js.Function2[
    /* navigation */ NavigationScreenProp[NavigationRoute[js.Any], NavigationParams], 
    /* screenProps */ js.UndefOr[StringDictionary[js.Any]], 
    Options
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNavigation.reactDashNavigationMod.NavigationComponent
    - typings.reactDashNavigation.Anon_Screen
    - typings.reactDashNavigation.Anon_GetScreen
  */
  type NavigationScreenRouteConfig = _NavigationScreenRouteConfig | NavigationComponent
  type NavigationStateRoute[NavigationLeafRouteParams] = NavigationLeafRoute[NavigationLeafRouteParams] with NavigationState
  type NavigationStyleInterpolator = js.Function1[/* props */ NavigationSceneRendererProps, ViewStyle]
  type NavigationView[O, S] = ComponentType[Anon_Descriptors[O] with NavigationInjectedProps[NavigationParams]]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type TransitionConfigurer = js.Function3[
    /* transitionProps */ NavigationTransitionProps, 
    /* prevTransitionProps */ NavigationTransitionProps, 
    /* isModal */ Boolean, 
    TransitionConfig
  ]
  type _SwitchNavigatorConfig = NavigationSwitchRouterConfig
}
