package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNavigationMod {
  type AnimatedValue = js.Any
  type DrawerLockMode = reactDashNavigationLib.reactDashNavigationLibStrings.unlocked | reactDashNavigationLib.reactDashNavigationLibStrings.`locked-closed` | reactDashNavigationLib.reactDashNavigationLibStrings.`locked-open`
  type EventType = reactDashNavigationLib.reactDashNavigationLibStrings.willFocus | reactDashNavigationLib.reactDashNavigationLibStrings.didFocus | reactDashNavigationLib.reactDashNavigationLibStrings.willBlur | reactDashNavigationLib.reactDashNavigationLibStrings.didBlur | reactDashNavigationLib.reactDashNavigationLibStrings.action
  type HeaderMode = reactDashNavigationLib.reactDashNavigationLibStrings.float | reactDashNavigationLib.reactDashNavigationLibStrings.screen | reactDashNavigationLib.reactDashNavigationLibStrings.none
  type InferProps[T /* <: reactLib.reactMod.ReactNs.ComponentType[_] */] = js.Any
  type NavigationAction = NavigationInitAction | NavigationStackAction | NavigationTabAction | NavigationDrawerAction
  type NavigationAnimationSetter = js.Function3[
    /* position */ AnimatedValue, 
    /* newState */ NavigationState, 
    /* lastState */ NavigationState, 
    scala.Unit
  ]
  type NavigationComponent = (NavigationScreenComponent[NavigationParams, js.Any, js.Any]) | (NavigationNavigator[js.Any, js.Any, js.Any]) | js.Any
  type NavigationDispatch = js.Function1[/* action */ NavigationAction, scala.Boolean]
  type NavigationDrawerAction = NavigationOpenDrawerAction | NavigationCloseDrawerAction | NavigationToggleDrawerAction
  type NavigationEventCallback = js.Function1[/* payload */ NavigationEventPayload, scala.Unit]
  type NavigationGestureDirection = reactDashNavigationLib.reactDashNavigationLibStrings.horizontal | reactDashNavigationLib.reactDashNavigationLibStrings.vertical
  type NavigationNavigator[State, Options, Props] = (reactLib.reactMod.ReactNs.ComponentType[(NavigationNavigatorProps[Options, State]) with Props]) with (reactDashNavigationLib.Anon_Router[State, Options])
  type NavigationRoute[Params] = NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  type NavigationRouteConfig = NavigationComponent | (reactDashNavigationLib.Anon_NavigationOptionsPath with NavigationScreenRouteConfig)
  type NavigationSceneRenderer = js.Function0[reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null]
  type NavigationSceneRendererProps = NavigationTransitionProps
  type NavigationScreenComponent[Params, Options, Props] = (reactLib.reactMod.ReactNs.ComponentType[(NavigationScreenProps[Params, Options]) with Props]) with reactDashNavigationLib.Anon_NavigationOptionsNavigationScreenConfig[Options]
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
    /* screenProps */ js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]], 
    Options
  ]
  type NavigationScreenRouteConfig = NavigationComponent | reactDashNavigationLib.Anon_Screen | reactDashNavigationLib.Anon_GetScreen
  type NavigationStackAction = NavigationInitAction | NavigationNavigateAction | NavigationBackAction | NavigationSetParamsAction | NavigationResetAction | NavigationReplaceAction | NavigationPopAction | NavigationPushAction | NavigationPopToTopAction | NavigationCompleteTransitionAction
  type NavigationStateRoute[NavigationLeafRouteParams] = NavigationLeafRoute[NavigationLeafRouteParams] with NavigationState
  type NavigationStyleInterpolator = js.Function1[
    /* props */ NavigationSceneRendererProps, 
    reactDashNativeLib.reactDashNativeMod.ViewStyle
  ]
  type NavigationTabAction = NavigationInitAction | NavigationNavigateAction | NavigationBackAction
  type NavigationView[O, S] = reactLib.reactMod.ReactNs.ComponentType[
    reactDashNavigationLib.Anon_NavigationConfig[O] with NavigationInjectedProps[NavigationParams]
  ]
  type NavigatorType = reactDashNavigationLib.reactDashNavigationLibStrings.`react-navigation/STACK` | reactDashNavigationLib.reactDashNavigationLibStrings.`react-navigation/TABS` | reactDashNavigationLib.reactDashNavigationLibStrings.`react-navigation/DRAWER`
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type SafeAreaViewForceInsetValue = reactDashNavigationLib.reactDashNavigationLibStrings.always | reactDashNavigationLib.reactDashNavigationLibStrings.never
  type TransitionConfigurer = js.Function3[
    /* transitionProps */ NavigationTransitionProps, 
    /* prevTransitionProps */ NavigationTransitionProps, 
    /* isModal */ scala.Boolean, 
    TransitionConfig
  ]
  type _SwitchNavigatorConfig = NavigationSwitchRouterConfig
}
