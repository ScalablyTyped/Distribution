package typings.reactMdTransition

import typings.reactMdTransition.typesMod.TransitionHookOptions
import typings.reactMdTransition.typesMod.TransitionHookReturnValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTransitionMod {
  
  @JSImport("@react-md/transition/types/useTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTransition[E /* <: HTMLElement */](
    hasNodeRefTimeoutTransitionInReflowTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: TransitionHookOptions[E]
  ): TransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(hasNodeRefTimeoutTransitionInReflowTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[TransitionHookReturnValue[E]]
}
