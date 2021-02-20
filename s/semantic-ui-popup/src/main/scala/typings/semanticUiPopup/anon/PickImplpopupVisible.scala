package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popupVisible'> */
@js.native
trait PickImplpopupVisible extends StObject {
  
  var popupVisible: String = js.native
}
object PickImplpopupVisible {
  
  @scala.inline
  def apply(popupVisible: String): PickImplpopupVisible = {
    val __obj = js.Dynamic.literal(popupVisible = popupVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupVisible]
  }
  
  @scala.inline
  implicit class PickImplpopupVisibleMutableBuilder[Self <: PickImplpopupVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
  }
}
