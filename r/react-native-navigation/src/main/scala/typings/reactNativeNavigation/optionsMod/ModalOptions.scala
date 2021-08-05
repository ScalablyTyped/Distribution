package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalOptions extends StObject {
  
  /**
    * Control wether this modal should be dismiss using swipe gesture when the modalPresentationStyle = 'pageSheet'
    * #### (iOS specific)
    */
  var swipeToDismiss: js.UndefOr[Boolean] = js.undefined
}
object ModalOptions {
  
  inline def apply(): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptions]
  }
  
  extension [Self <: ModalOptions](x: Self) {
    
    inline def setSwipeToDismiss(value: Boolean): Self = StObject.set(x, "swipeToDismiss", value.asInstanceOf[js.Any])
    
    inline def setSwipeToDismissUndefined: Self = StObject.set(x, "swipeToDismiss", js.undefined)
  }
}
