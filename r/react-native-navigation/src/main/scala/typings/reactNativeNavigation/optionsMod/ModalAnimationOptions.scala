package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalAnimationOptions
  extends StObject
     with ViewAnimationOptions {
  
  /**
    * Animations to be applied on views in the appearing or disappearing screens
    */
  var elementTransitions: js.UndefOr[js.Array[ElementTransition]] = js.undefined
  
  /**
    * Animations to be applied on elements which are shared between the appearing and disappearing screens
    */
  var sharedElementTransitions: js.UndefOr[js.Array[SharedElementTransition]] = js.undefined
}
object ModalAnimationOptions {
  
  @scala.inline
  def apply(): ModalAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalAnimationOptions]
  }
  
  @scala.inline
  implicit class ModalAnimationOptionsMutableBuilder[Self <: ModalAnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementTransitions(value: js.Array[ElementTransition]): Self = StObject.set(x, "elementTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementTransitionsUndefined: Self = StObject.set(x, "elementTransitions", js.undefined)
    
    @scala.inline
    def setElementTransitionsVarargs(value: ElementTransition*): Self = StObject.set(x, "elementTransitions", js.Array(value :_*))
    
    @scala.inline
    def setSharedElementTransitions(value: js.Array[SharedElementTransition]): Self = StObject.set(x, "sharedElementTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedElementTransitionsUndefined: Self = StObject.set(x, "sharedElementTransitions", js.undefined)
    
    @scala.inline
    def setSharedElementTransitionsVarargs(value: SharedElementTransition*): Self = StObject.set(x, "sharedElementTransitions", js.Array(value :_*))
  }
}
