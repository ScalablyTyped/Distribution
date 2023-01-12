package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalAnimationOptions extends StObject {
  
  /**
    * Animations to be applied on views in the appearing or disappearing screens
    */
  var elementTransitions: js.UndefOr[js.Array[ElementTransition]] = js.undefined
  
  /**
    * Animate opening modal
    */
  var enter: js.UndefOr[ViewAnimationOptions] = js.undefined
  
  /**
    * Animate closing modal
    */
  var exit: js.UndefOr[ViewAnimationOptions] = js.undefined
  
  /**
    * Animations to be applied on elements which are shared between the appearing and disappearing screens
    */
  var sharedElementTransitions: js.UndefOr[js.Array[SharedElementTransition]] = js.undefined
}
object ModalAnimationOptions {
  
  inline def apply(): ModalAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalAnimationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalAnimationOptions] (val x: Self) extends AnyVal {
    
    inline def setElementTransitions(value: js.Array[ElementTransition]): Self = StObject.set(x, "elementTransitions", value.asInstanceOf[js.Any])
    
    inline def setElementTransitionsUndefined: Self = StObject.set(x, "elementTransitions", js.undefined)
    
    inline def setElementTransitionsVarargs(value: ElementTransition*): Self = StObject.set(x, "elementTransitions", js.Array(value*))
    
    inline def setEnter(value: ViewAnimationOptions): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: ViewAnimationOptions): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    inline def setSharedElementTransitions(value: js.Array[SharedElementTransition]): Self = StObject.set(x, "sharedElementTransitions", value.asInstanceOf[js.Any])
    
    inline def setSharedElementTransitionsUndefined: Self = StObject.set(x, "sharedElementTransitions", js.undefined)
    
    inline def setSharedElementTransitionsVarargs(value: SharedElementTransition*): Self = StObject.set(x, "sharedElementTransitions", js.Array(value*))
  }
}
