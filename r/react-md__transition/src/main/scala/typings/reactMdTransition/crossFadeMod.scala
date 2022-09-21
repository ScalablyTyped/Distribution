package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.reactMdTransition.typesMod.CSSTransitionComponentImplementation
import typings.reactMdTransition.useCrossFadeTransitionMod.CrossFadeTransitionHookOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crossFadeMod {
  
  @JSImport("@react-md/transition/types/CrossFade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CrossFade[E /* <: HTMLElement */](hasAppearTransitionInChildrenClassNameOptions: CrossFadeProps[E]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("CrossFade")(hasAppearTransitionInChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  
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
