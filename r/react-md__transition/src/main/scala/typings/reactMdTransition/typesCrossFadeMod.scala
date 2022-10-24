package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.reactMdTransition.typesTypesMod.CSSTransitionComponentImplementation
import typings.reactMdTransition.typesUseCrossFadeTransitionMod.CrossFadeTransitionHookOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCrossFadeMod {
  
  @JSImport("@react-md/transition/types/CrossFade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CrossFade[E /* <: HTMLElement */](param0: CrossFadeProps[E]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossFade")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
  trait CrossFadeProps[E /* <: HTMLElement */]
    extends StObject
       with CrossFadeTransitionHookOptions[E]
       with CSSTransitionComponentImplementation[E]
  object CrossFadeProps {
    
    inline def apply[E /* <: HTMLElement */](children: ReactElement): CrossFadeProps[E] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrossFadeProps[E]]
    }
  }
}
