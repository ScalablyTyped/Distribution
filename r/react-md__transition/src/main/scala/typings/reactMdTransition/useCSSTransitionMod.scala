package typings.reactMdTransition

import typings.react.mod.Dispatch
import typings.reactMdTransition.constantsMod.TransitionAction
import typings.reactMdTransition.constantsMod.TransitionStage
import typings.reactMdTransition.typesMod.CSSTransitionOptions
import typings.reactMdTransition.typesMod.CSSTransitionProvidedProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/transition/types/useCSSTransition", JSImport.Namespace)
@js.native
object useCSSTransitionMod extends js.Object {
  def default[E /* <: HTMLElement */](
    hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNameClassNamesRef: CSSTransitionOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  type CSSTransitionReturnValue[E /* <: HTMLElement */] = js.Tuple4[Rendered, CSSTransitionProvidedProps[E], Dispatch[TransitionAction], TransitionStage]
  type Rendered = Boolean
}

