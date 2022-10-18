package typings.reactMdTransition.typesTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionOptions[E /* <: HTMLElement */]
  extends StObject
     with PreconfiguredTransitionOptions[E] {
  
  /** {@inheritDoc TransitionTimeout} */
  @JSName("timeout")
  var timeout_TransitionOptions: TransitionTimeout
}
object TransitionOptions {
  
  inline def apply[E /* <: HTMLElement */](timeout: TransitionTimeout, transitionIn: Boolean): TransitionOptions[E] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions[E]]
  }
  
  extension [Self <: TransitionOptions[?], E /* <: HTMLElement */](x: Self & TransitionOptions[E]) {
    
    inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
