package typings.semanticUiPopup.anon

import typings.semanticUiPopup.JQuery
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'popup'> */
trait PickImplpopup extends StObject {
  
  var popup: `false` | String | JQuery
}
object PickImplpopup {
  
  inline def apply(popup: `false` | String | JQuery): PickImplpopup = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpopup]
  }
  
  extension [Self <: PickImplpopup](x: Self) {
    
    inline def setPopup(value: `false` | String | JQuery): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
  }
}
