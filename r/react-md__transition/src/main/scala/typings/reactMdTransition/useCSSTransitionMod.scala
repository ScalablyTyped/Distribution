package typings.reactMdTransition

import typings.reactMdTransition.typesMod.CSSTransitionHookOptions
import typings.reactMdTransition.typesMod.CSSTransitionHookReturnValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCSSTransitionMod {
  
  @JSImport("@react-md/transition/types/useCSSTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCSSTransition[E /* <: HTMLElement */](hasClassNameClassNamesAppearEnterExitTimeoutOptions: CSSTransitionHookOptions[E]): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCSSTransition")(hasClassNameClassNamesAppearEnterExitTimeoutOptions.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionHookReturnValue[E]]
}
