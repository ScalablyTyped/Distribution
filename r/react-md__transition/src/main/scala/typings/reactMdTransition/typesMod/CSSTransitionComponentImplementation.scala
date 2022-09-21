package typings.reactMdTransition.typesMod

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionComponentImplementation[E /* <: HTMLElement */] extends StObject {
  
  /**
    * The child element that should have a `ref` and `className` cloned into
    * using the `cloneElement` API. If the child is a custom component, you
    * **must** use `React.forwardRef` and pass both of these to a DOM element for
    * the transition to work.
    */
  var children: ReactElement
}
object CSSTransitionComponentImplementation {
  
  inline def apply[E /* <: HTMLElement */](children: ReactElement): CSSTransitionComponentImplementation[E] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionComponentImplementation[E]]
  }
  
  extension [Self <: CSSTransitionComponentImplementation[?], E /* <: HTMLElement */](x: Self & CSSTransitionComponentImplementation[E]) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
