package typings.reactMdTransition.typesTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionHookOptions[E /* <: HTMLElement */]
  extends StObject
     with PreconfiguredCSSTransitionOptions[E] {
  
  /** {@inheritDoc CSSTransitionClassNames} */
  var classNames: CSSTransitionClassNames
  
  /** {@inheritDoc TransitionTimeout} */
  @JSName("timeout")
  var timeout_CSSTransitionHookOptions: TransitionTimeout
}
object CSSTransitionHookOptions {
  
  inline def apply[E /* <: HTMLElement */](classNames: CSSTransitionClassNames, timeout: TransitionTimeout, transitionIn: Boolean): CSSTransitionHookOptions[E] = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSTransitionHookOptions[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSTransitionHookOptions[?], E /* <: HTMLElement */] (val x: Self & CSSTransitionHookOptions[E]) extends AnyVal {
    
    inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
