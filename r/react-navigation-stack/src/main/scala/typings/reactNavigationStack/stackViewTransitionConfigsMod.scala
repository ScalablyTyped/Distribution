package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.TransitionConfig
import typings.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewTransitionConfigs", JSImport.Namespace)
@js.native
object stackViewTransitionConfigsMod extends js.Object {
  @js.native
  object default extends js.Object {
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

