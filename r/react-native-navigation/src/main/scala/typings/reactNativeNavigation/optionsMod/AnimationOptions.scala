package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  /**
    * Configure what animates when modal is dismissed
    */
  var dismissModal: js.UndefOr[ModalAnimationOptions] = js.undefined
  
  /**
    * Configure what animates when a screen is popped
    */
  var pop: js.UndefOr[StackAnimationOptions] = js.undefined
  
  /**
    * Configure what animates when a screen is pushed
    */
  var push: js.UndefOr[StackAnimationOptions] = js.undefined
  
  /**
    * Configure the setRoot animation
    */
  var setRoot: js.UndefOr[ViewAnimationOptions] = js.undefined
  
  /**
    * Configure the setStackRoot animation
    */
  var setStackRoot: js.UndefOr[ViewAnimationOptions] = js.undefined
  
  /**
    * Configure what animates when modal is shown
    */
  var showModal: js.UndefOr[ModalAnimationOptions] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setDismissModal(value: ModalAnimationOptions): Self = StObject.set(x, "dismissModal", value.asInstanceOf[js.Any])
    
    inline def setDismissModalUndefined: Self = StObject.set(x, "dismissModal", js.undefined)
    
    inline def setPop(value: StackAnimationOptions): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
    
    inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
    
    inline def setPush(value: StackAnimationOptions): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setSetRoot(value: ViewAnimationOptions): Self = StObject.set(x, "setRoot", value.asInstanceOf[js.Any])
    
    inline def setSetRootUndefined: Self = StObject.set(x, "setRoot", js.undefined)
    
    inline def setSetStackRoot(value: ViewAnimationOptions): Self = StObject.set(x, "setStackRoot", value.asInstanceOf[js.Any])
    
    inline def setSetStackRootUndefined: Self = StObject.set(x, "setStackRoot", js.undefined)
    
    inline def setShowModal(value: ModalAnimationOptions): Self = StObject.set(x, "showModal", value.asInstanceOf[js.Any])
    
    inline def setShowModalUndefined: Self = StObject.set(x, "showModal", js.undefined)
  }
}
