package typings.reactNavigationStack

import typings.reactNavigationStack.typesMod.TransitionConfig
import typings.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnIsModal extends js.Object {
  def apply[T](transitionConfigurer: js.UndefOr[scala.Nothing], transitionProps: TransitionProps): TransitionConfig with T = js.native
  def apply[T](
    transitionConfigurer: js.UndefOr[scala.Nothing],
    transitionProps: TransitionProps,
    prevTransitionProps: TransitionProps
  ): TransitionConfig with T = js.native
  def apply[T](
    transitionConfigurer: js.UndefOr[scala.Nothing],
    transitionProps: TransitionProps,
    prevTransitionProps: TransitionProps,
    isModal: Boolean
  ): TransitionConfig with T = js.native
  def apply[T](
    transitionConfigurer: js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      T
    ],
    transitionProps: TransitionProps
  ): TransitionConfig with T = js.native
  def apply[T](
    transitionConfigurer: js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      T
    ],
    transitionProps: TransitionProps,
    prevTransitionProps: TransitionProps
  ): TransitionConfig with T = js.native
  def apply[T](
    transitionConfigurer: js.Function3[
      /* transitionProps */ TransitionProps, 
      /* prevTransitionProps */ js.UndefOr[TransitionProps], 
      /* isModal */ js.UndefOr[Boolean], 
      T
    ],
    transitionProps: TransitionProps,
    prevTransitionProps: TransitionProps,
    isModal: Boolean
  ): TransitionConfig with T = js.native
}

