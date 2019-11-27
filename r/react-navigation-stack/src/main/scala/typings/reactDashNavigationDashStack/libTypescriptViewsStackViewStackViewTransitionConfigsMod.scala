package typings.reactDashNavigationDashStack

import typings.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionConfig
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewTransitionConfigs", JSImport.Namespace)
@js.native
object libTypescriptViewsStackViewStackViewTransitionConfigsMod extends js.Object {
  @js.native
  object default extends js.Object {
    var FadeInFromBottomAndroid: Anon_Props = js.native
    var FadeOutToBottomAndroid: Anon_Props = js.native
    var ModalSlideFromBottomIOS: Anon_ContainerStyleDarkContainerStyleLight = js.native
    var NoAnimation: Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator = js.native
    var SlideFromRightIOS: Anon_ContainerStyleDark = js.native
    var defaultTransitionConfig: js.Function3[
        /* transitionProps */ TransitionProps, 
        /* prevTransitionProps */ js.UndefOr[TransitionProps], 
        /* isModal */ js.UndefOr[Boolean], 
        TransitionConfig
      ] = js.native
    var getTransitionConfig: Fn_IsModal = js.native
  }
  
}

