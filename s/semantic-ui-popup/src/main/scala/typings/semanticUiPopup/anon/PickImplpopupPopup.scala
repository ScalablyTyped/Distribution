package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ClassNameSettings._Impl, 'popup'> */
trait PickImplpopupPopup extends StObject {
  
  var popup: String
}
object PickImplpopupPopup {
  
  inline def apply(popup: String): PickImplpopupPopup = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopupPopup]
  }
  
  extension [Self <: PickImplpopupPopup](x: Self) {
    
    inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
