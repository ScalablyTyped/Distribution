package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.CSSTransitionComponentImplementation
import typings.reactMdTransition.typesTypesMod.CSSTransitionHookOptions
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCsstransitionMod {
  
  @JSImport("@react-md/transition/types/CSSTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CSSTransition[E /* <: HTMLElement */](param0: CSSTransitionProps[E]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CSSTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait CSSTransitionProps[E /* <: HTMLElement */]
    extends StObject
       with CSSTransitionHookOptions[E]
       with CSSTransitionComponentImplementation[E]
  object CSSTransitionProps {
    
    inline def apply[E /* <: HTMLElement */](
      children: ReactElement,
      classNames: CSSTransitionClassNames,
      timeout: TransitionTimeout,
      transitionIn: Boolean
    ): CSSTransitionProps[E] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], classNames = classNames.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSTransitionProps[E]]
    }
  }
}
