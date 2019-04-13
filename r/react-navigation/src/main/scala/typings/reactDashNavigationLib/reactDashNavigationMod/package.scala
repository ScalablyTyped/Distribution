package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNavigationMod {
  type AnimatedValue = js.Any
  type InferProps[T /* <: reactLib.reactMod.ComponentType[_] */] = js.Any
  type NavigationAnimationSetter = js.Function3[
    /* position */ AnimatedValue, 
    /* newState */ NavigationState, 
    /* lastState */ NavigationState, 
    scala.Unit
  ]
  type NavigationComponent = (NavigationScreenComponent[NavigationParams, js.Any, js.Any]) | (NavigationNavigator[js.Any, js.Any, js.Any]) | js.Any
  type NavigationDispatch = js.Function1[/* action */ NavigationAction, scala.Boolean]
  type NavigationEventCallback = js.Function1[/* payload */ NavigationEventPayload, scala.Unit]
  type NavigationNavigator[State, Options, Props] = (reactLib.reactMod.ComponentType[(NavigationNavigatorProps[Options, State]) with Props]) with (reactDashNavigationLib.Anon_NavigationOptionsRouter[State, Options])
  type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type NavigationRoute[Params] = NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  type NavigationRouteConfig = NavigationComponent | (reactDashNavigationLib.Anon_NavigationOptionsPath with NavigationScreenRouteConfig)
  type NavigationRouteConfigMap = org.scalablytyped.runtime.StringDictionary[NavigationRouteConfig]
  type NavigationSceneRenderer = js.Function0[reactLib.reactMod.ReactElement[js.Any] | scala.Null]
  type NavigationSceneRendererProps = NavigationTransitionProps
  type NavigationScreenComponent[Params, Options, Props] = (reactLib.reactMod.ComponentType[(NavigationScreenProps[Params, Options]) with Props]) with reactDashNavigationLib.Anon_NavigationOptionsNavigationScreenConfig[Options]
  type NavigationScreenConfig[Options] = Options | (js.Function1[
    /* navigationOptionsContainer */ NavigationScreenConfigProps with reactDashNavigationLib.Anon_NavigationOptions, 
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
    /* screenProps */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    Options
  ]
  /* Rewritten from type alias, can be one of: 
    - NavigationComponent
    - reactDashNavigationLib.Anon_Screen
    - reactDashNavigationLib.Anon_GetScreen
  */
  type NavigationScreenRouteConfig = _NavigationScreenRouteConfig | NavigationComponent
  type NavigationStateRoute[NavigationLeafRouteParams] = NavigationLeafRoute[NavigationLeafRouteParams] with NavigationState
  type NavigationStyleInterpolator = js.Function1[
    /* props */ NavigationSceneRendererProps, 
    reactDashNativeLib.reactDashNativeMod.ViewStyle
  ]
  type NavigationView[O, S] = reactLib.reactMod.ComponentType[
    reactDashNavigationLib.Anon_Descriptors[O] with NavigationInjectedProps[NavigationParams]
  ]
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type TransitionConfigurer = js.Function3[
    /* transitionProps */ NavigationTransitionProps, 
    /* prevTransitionProps */ NavigationTransitionProps, 
    /* isModal */ scala.Boolean, 
    TransitionConfig
  ]
  type _SwitchNavigatorConfig = NavigationSwitchRouterConfig
}
