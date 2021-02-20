package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popup'> */
@js.native
trait PickImplpopupPopup extends StObject {
  
  var popup: String = js.native
}
object PickImplpopupPopup {
  
  @scala.inline
  def apply(popup: String): PickImplpopupPopup = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupPopup]
  }
  
  @scala.inline
  implicit class PickImplpopupPopupMutableBuilder[Self <: PickImplpopupPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
