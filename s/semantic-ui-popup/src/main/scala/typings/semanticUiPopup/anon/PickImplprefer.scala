package typings.semanticUiPopup.anon

import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'prefer'> */
trait PickImplprefer extends StObject {
  
  var prefer: adjacent | opposite
}
object PickImplprefer {
  
  inline def apply(prefer: adjacent | opposite): PickImplprefer = {
    val __obj = js.Dynamic.literal(prefer = prefer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplprefer]
  }
  
  extension [Self <: PickImplprefer](x: Self) {
    
    inline def setPrefer(value: adjacent | opposite): Self = StObject.set(x, "prefer", value.asInstanceOf[js.Any])
  }
}
