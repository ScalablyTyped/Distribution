package typings.reactMdTransition.typesTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreconfiguredTransitionOptions[E /* <: HTMLElement */]
  extends StObject
     with PreconfiguredTransitionInDefaultedOptions[E] {
  
  /** {@inheritDoc PreconfiguredTransitionInDefaultedOptions.transitionIn} */
  @JSName("transitionIn")
  var transitionIn_PreconfiguredTransitionOptions: Boolean
}
object PreconfiguredTransitionOptions {
  
  inline def apply[E /* <: HTMLElement */](transitionIn: Boolean): PreconfiguredTransitionOptions[E] = {
    val __obj = js.Dynamic.literal(transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconfiguredTransitionOptions[E]]
  }
  
  extension [Self <: PreconfiguredTransitionOptions[?], E /* <: HTMLElement */](x: Self & PreconfiguredTransitionOptions[E]) {
    
    inline def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
  }
}
