package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'preserve'> */
trait PickImplpreserve extends StObject {
  
  var preserve: Boolean
}
object PickImplpreserve {
  
  inline def apply(preserve: Boolean): PickImplpreserve = {
    val __obj = js.Dynamic.literal(preserve = preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpreserve]
  }
  
  extension [Self <: PickImplpreserve](x: Self) {
    
    inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
  }
}
