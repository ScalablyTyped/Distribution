package typings.semanticUiPopup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'invalidPosition'> */
trait PickImplinvalidPosition extends StObject {
  
  var invalidPosition: String
}
object PickImplinvalidPosition {
  
  inline def apply(invalidPosition: String): PickImplinvalidPosition = {
    val __obj = js.Dynamic.literal(invalidPosition = invalidPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidPosition]
  }
  
  extension [Self <: PickImplinvalidPosition](x: Self) {
    
    inline def setInvalidPosition(value: String): Self = StObject.set(x, "invalidPosition", value.asInstanceOf[js.Any])
  }
}
