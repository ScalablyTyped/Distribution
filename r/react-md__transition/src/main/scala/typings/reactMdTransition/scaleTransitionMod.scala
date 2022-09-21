package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import typings.reactMdTransition.typesMod.CSSTransitionComponentImplementation
import typings.reactMdTransition.useScaleTransitionMod.ScaleTransitionHookOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleTransitionMod {
  
  @JSImport("@react-md/transition/types/ScaleTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ScaleTransition[E /* <: HTMLElement */](hasPortalPortalIntoPortalIntoIdChildrenClassNameOptions: ScaleTransitionProps[E]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleTransition")(hasPortalPortalIntoPortalIntoIdChildrenClassNameOptions.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ScaleTransitionProps[E /* <: HTMLElement */]
    extends StObject
       with CSSTransitionComponentImplementation[E]
       with RenderConditionalPortalProps
       with ScaleTransitionHookOptions[E]
  object ScaleTransitionProps {
    
    inline def apply[E /* <: HTMLElement */](children: ReactElement, transitionIn: Boolean): ScaleTransitionProps[E] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleTransitionProps[E]]
    }
  }
}
