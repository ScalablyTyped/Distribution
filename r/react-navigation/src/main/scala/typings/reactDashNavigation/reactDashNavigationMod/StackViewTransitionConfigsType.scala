package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackViewTransitionConfigsType extends js.Object {
  var FadeInFromBottomAndroid: TransitionConfig
  var FadeOutToBottomAndroid: TransitionConfig
  var ModalSlideFromBottomIOS: TransitionConfig
  var SlideFromRightIOS: TransitionConfig
  var defaultTransitionConfig: TransitionConfigurer
  def getTransitionConfig(
    transitionConfigurer: TransitionConfigurer,
    transitionProps: NavigationTransitionProps,
    prevTransitionProps: NavigationTransitionProps,
    isModal: Boolean
  ): TransitionConfig
}

object StackViewTransitionConfigsType {
  @scala.inline
  def apply(
    FadeInFromBottomAndroid: TransitionConfig,
    FadeOutToBottomAndroid: TransitionConfig,
    ModalSlideFromBottomIOS: TransitionConfig,
    SlideFromRightIOS: TransitionConfig,
    defaultTransitionConfig: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ NavigationTransitionProps, /* isModal */ Boolean) => TransitionConfig,
    getTransitionConfig: (TransitionConfigurer, NavigationTransitionProps, NavigationTransitionProps, Boolean) => TransitionConfig
  ): StackViewTransitionConfigsType = {
    val __obj = js.Dynamic.literal(FadeInFromBottomAndroid = FadeInFromBottomAndroid, FadeOutToBottomAndroid = FadeOutToBottomAndroid, ModalSlideFromBottomIOS = ModalSlideFromBottomIOS, SlideFromRightIOS = SlideFromRightIOS, defaultTransitionConfig = js.Any.fromFunction3(defaultTransitionConfig), getTransitionConfig = js.Any.fromFunction4(getTransitionConfig))
  
    __obj.asInstanceOf[StackViewTransitionConfigsType]
  }
}

