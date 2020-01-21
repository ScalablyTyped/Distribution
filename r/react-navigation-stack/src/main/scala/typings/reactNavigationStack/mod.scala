package typings.reactNavigationStack

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.Ref
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationStack.headerBackButtonMod.default
import typings.reactNavigationStack.transitionerMod.Props
import typings.reactNavigationStack.typesMod.NavigationStackOptions
import typings.reactNavigationStack.typesMod.NavigationStackProp
import typings.reactNavigationStack.typesMod.NavigationStackState
import typings.reactNavigationStack.typesMod.Scene
import typings.reactNavigationStack.typesMod.SceneDescriptorMap
import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import typings.reactNavigationStack.typesMod.TransitionConfig
import typings.reactNavigationStack.typesMod.TransitionProps
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Header protected ()
    extends Component[PickPropsscenenavigationpositionlayoutPresetbackTi, js.Any, js.Any] {
    def this(props: PickPropsscenenavigationpositionlayoutPresetbackTi) = this()
    def this(props: PickPropsscenenavigationpositionlayoutPresetbackTi, context: js.Any) = this()
  }
  
  @js.native
  class HeaderBackButton () extends default
  
  @js.native
  class HeaderTitle ()
    extends typings.reactNavigationStack.headerTitleMod.default
  
  @js.native
  class StackView ()
    extends typings.reactNavigationStack.stackViewMod.StackView
  
  @js.native
  class StackViewCard protected ()
    extends Component[PickPropsstylechildrenscenenavigationrealPositiona, ComponentState, js.Any] {
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona) = this()
    def this(props: PickPropsstylechildrenscenenavigationrealPositiona, context: js.Any) = this()
  }
  
  @js.native
  class StackViewLayout protected ()
    extends Component[PickPropsmodeheaderModeheaderLayoutPresetheaderTra, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra) = this()
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra, context: js.Any) = this()
  }
  
  @js.native
  class Transitioner protected ()
    extends typings.reactNavigationStack.transitionerMod.default {
    def this(props: Props) = this()
  }
  
  val Assets: js.Array[js.Any] = js.native
  val StackGestureContext: Context[Ref[PanGestureHandler]] = js.native
  def ScenesReducer(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: Null,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def ScenesReducer(
    scenes: js.Array[Scene],
    nextState: NavigationStackState,
    prevState: NavigationStackState,
    descriptors: SceneDescriptorMap
  ): js.Array[Scene] = js.native
  def createPointerEventsContainer[Props /* <: InjectedPropsInputProps */](Component: ComponentType[Props]): ComponentType[Pick[Props, Exclude[String, String]]] = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _]]
  ): js.Any = js.native
  def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[NavigationStackOptions, NavigationStackProp[NavigationRoute[NavigationParams], _]],
    stackConfig: CreateNavigatorConfigNavigationStackConfigNavigati
  ): js.Any = js.native
  @js.native
  object Header extends TopLevel[
          ComponentClassPickPropsscenenavigationpositionlayo | FunctionComponentPickPropsscenenavigationpositionl
        ]
  
  /* static members */
  @js.native
  object HeaderBackButton extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
    var defaultProps: AnonBackImage = js.native
  }
  
  @js.native
  object HeaderStyleInterpolator extends js.Object {
    var forBackground: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, AnonOpacity] = js.native
    var forBackgroundWithFade: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forBackgroundWithInactiveHidden: js.Function1[/* hasNavigationScene */ SceneInterpolatorProps, AnonOpacity] = js.native
    var forBackgroundWithTranslation: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityTransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forCenter: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forCenterFromLeft: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolation
      ] = js.native
    var forLayout: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonTransform | AnonTransformAnonTranslateX | AnonTransformAnonTranslateXAnimatedInterpolation
      ] = js.native
    var forLeft: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forLeftButton: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
    var forLeftLabel: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolation
      ] = js.native
    var forRight: js.Function1[/* props */ SceneInterpolatorProps, AnonOpacity | AnonOpacityAnimatedInterpolation] = js.native
  }
  
  /* static members */
  @js.native
  object HeaderTitle extends js.Object {
    var contextType: Context[SupportedThemes] = js.native
  }
  
  @js.native
  object StackViewCard extends TopLevel[ComponentType[PickPropsstylechildrenscenenavigationrealPositiona]]
  
  @js.native
  object StackViewLayout extends TopLevel[ComponentType[PickPropsmodeheaderModeheaderLayoutPresetheaderTra]]
  
  @js.native
  object StackViewStyleInterpolator extends js.Object {
    var forFade: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacity | AnonOpacityAnimatedInterpolation
      ] = js.native
    var forFadeFromBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forFadeToBottomAndroid: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnimatedInterpolationAnonTranslateY
      ] = js.native
    var forHorizontal: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityOverlayOpacity | AnonOpacityOverlayOpacityShadowOpacity
      ] = js.native
    var forNoAnimation: js.Function0[js.Object] = js.native
    var forVertical: js.Function1[
        /* props */ SceneInterpolatorProps, 
        AnonOpacityTransformAnonTranslateXTranslateY | AnonOpacityTransform | AnonOpacityTransformAnonTranslateY
      ] = js.native
  }
  
  @js.native
  object StackViewTransitionConfigs extends js.Object {
    var FadeInFromBottomAndroid: AnonProps = js.native
    var FadeOutToBottomAndroid: AnonProps = js.native
    var ModalSlideFromBottomIOS: AnonContainerStyleDarkContainerStyleLight = js.native
    var NoAnimation: AnonContainerStyleDarkContainerStyleLightScreenInterpolator = js.native
    var SlideFromRightIOS: AnonContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: FnIsModal = js.native
  }
  
}

