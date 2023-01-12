package typings.reactMdTransition.typesTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionHookOptions[E /* <: HTMLElement */]
  extends StObject
     with TransitionOptions[E] {
  
  /**
    * Boolean if the DOM should forcefully be reflow each time a transition
    * change occurs. This is generally required for any CSS transition and is
    * set to `true` for the {@link useCSSTransition} hook.
    *
    * @defaultValue `false`
    */
  var reflow: js.UndefOr[Boolean] = js.undefined
}
object TransitionHookOptions {
  
  inline def apply[E /* <: HTMLElement */](timeout: TransitionTimeout, transitionIn: Boolean): TransitionHookOptions[E] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionHookOptions[E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionHookOptions[?], E /* <: HTMLElement */] (val x: Self & TransitionHookOptions[E]) extends AnyVal {
    
    inline def setReflow(value: Boolean): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
    
    inline def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
  }
}
