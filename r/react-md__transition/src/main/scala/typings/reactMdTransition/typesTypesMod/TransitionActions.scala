package typings.reactMdTransition.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionActions extends StObject {
  
  /**
    * Boolean if the transition should occur immediately once the component
    * mounts if the {@link TransitionOptions.transitionIn} is `true`
    *
    * @defaultValue `false`
    */
  var appear: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the transition should occur whenever the
    * {@link TransitionOptions.transitionIn} is switch to `true` after the
    * component has been rendered in the DOM.
    *
    * @defaultValue `true`
    */
  var enter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the transition should occur whenever the
    * {@link TransitionOptions.transitionIn} is switch to `false` after the
    * component has been rendered in the DOM.
    *
    * @defaultValue `true`
    */
  var exit: js.UndefOr[Boolean] = js.undefined
}
object TransitionActions {
  
  inline def apply(): TransitionActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionActions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionActions] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
