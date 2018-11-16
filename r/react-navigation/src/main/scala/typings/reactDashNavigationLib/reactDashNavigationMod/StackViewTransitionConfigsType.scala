package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackViewTransitionConfigsType extends js.Object {
  var FadeInFromBottomAndroid: TransitionConfig = js.native
  var FadeOutToBottomAndroid: TransitionConfig = js.native
  var ModalSlideFromBottomIOS: TransitionConfig = js.native
  var SlideFromRightIOS: TransitionConfig = js.native
  @JSName("defaultTransitionConfig")
  var defaultTransitionConfig_Original: TransitionConfigurer = js.native
  def defaultTransitionConfig(
    transitionProps: NavigationTransitionProps,
    prevTransitionProps: NavigationTransitionProps,
    isModal: scala.Boolean
  ): TransitionConfig = js.native
  def getTransitionConfig(
    transitionConfigurer: TransitionConfigurer,
    transitionProps: NavigationTransitionProps,
    prevTransitionProps: NavigationTransitionProps,
    isModal: scala.Boolean
  ): TransitionConfig = js.native
}

