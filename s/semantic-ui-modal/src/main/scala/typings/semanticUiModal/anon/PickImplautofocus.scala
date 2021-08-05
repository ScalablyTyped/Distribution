package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'autofocus'> */
trait PickImplautofocus extends StObject {
  
  var autofocus: Boolean
}
object PickImplautofocus {
  
  inline def apply(autofocus: Boolean): PickImplautofocus = {
    val __obj = js.Dynamic.literal(autofocus = autofocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplautofocus]
  }
  
  extension [Self <: PickImplautofocus](x: Self) {
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
  }
}
