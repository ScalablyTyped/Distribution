package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalOptions extends StObject {
  
  /**
    * Control whether this modal should be dismiss using swipe gesture when the modalPresentationStyle = 'pageSheet'
    * #### (iOS specific)
    */
  var swipeToDismiss: js.UndefOr[Boolean] = js.undefined
}
object ModalOptions {
  
  inline def apply(): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModalOptions] (val x: Self) extends AnyVal {
    
    inline def setSwipeToDismiss(value: Boolean): Self = StObject.set(x, "swipeToDismiss", value.asInstanceOf[js.Any])
    
    inline def setSwipeToDismissUndefined: Self = StObject.set(x, "swipeToDismiss", js.undefined)
  }
}
