package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popupVisible'> */
trait PickImplpopupVisible extends StObject {
  
  var popupVisible: String
}
object PickImplpopupVisible {
  
  inline def apply(popupVisible: String): PickImplpopupVisible = {
    val __obj = js.Dynamic.literal(popupVisible = popupVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupVisible]
  }
  
  extension [Self <: PickImplpopupVisible](x: Self) {
    
    inline def setPopupVisible(value: String): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
  }
}
