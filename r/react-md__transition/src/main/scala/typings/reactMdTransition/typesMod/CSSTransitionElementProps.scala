package typings.reactMdTransition.typesMod

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionElementProps[E /* <: HTMLElement */] extends StObject {
  
  /**
    * The current transition class name or `undefined`.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /** {@inheritDoc TransitionHookReturnValue.ref} */
  var ref: RefCallback[E]
}
object CSSTransitionElementProps {
  
  inline def apply[E /* <: HTMLElement */](ref: /* instance */ E | Null => Unit): CSSTransitionElementProps[E] = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[CSSTransitionElementProps[E]]
  }
  
  extension [Self <: CSSTransitionElementProps[?], E /* <: HTMLElement */](x: Self & CSSTransitionElementProps[E]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
  }
}
