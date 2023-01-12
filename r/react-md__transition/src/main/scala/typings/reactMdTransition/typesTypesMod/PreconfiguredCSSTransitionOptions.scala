package typings.reactMdTransition.typesTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreconfiguredCSSTransitionOptions[E /* <: HTMLElement */]
  extends StObject
     with PreconfiguredCSSTransitionInDefaultedOptions[E] {
  
  /** {@inheritDoc PreconfiguredTransitionInDefaultedOptions.transitionIn} */
  @JSName("transitionIn")
  var transitionIn_PreconfiguredCSSTransitionOptions: Boolean
}
object PreconfiguredCSSTransitionOptions {
  
  inline def apply[E /* <: HTMLElement */](transitionIn: Boolean): PreconfiguredCSSTransitionOptions[E] = {
    val __obj = js.Dynamic.literal(transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconfiguredCSSTransitionOptions[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreconfiguredCSSTransitionOptions[?], E /* <: HTMLElement */] (val x: Self & PreconfiguredCSSTransitionOptions[E]) extends AnyVal {
    
    inline def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
  }
}
