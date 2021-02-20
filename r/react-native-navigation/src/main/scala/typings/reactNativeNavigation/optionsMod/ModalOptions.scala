package typings.reactNativeNavigation.optionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalOptions extends StObject {
  
  /**
    * Control wether this modal should be dismiss using swipe gesture when the modalPresentationStyle = 'pageSheet'
    * #### (iOS specific)
    */
  var swipeToDismiss: js.UndefOr[Boolean] = js.native
}
object ModalOptions {
  
  @scala.inline
  def apply(): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptions]
  }
  
  @scala.inline
  implicit class ModalOptionsMutableBuilder[Self <: ModalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSwipeToDismiss(value: Boolean): Self = StObject.set(x, "swipeToDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeToDismissUndefined: Self = StObject.set(x, "swipeToDismiss", js.undefined)
  }
}
