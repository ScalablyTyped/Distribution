package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'maxSelections'> */
trait PickImplmaxSelectionsMaxSelections extends StObject {
  
  var maxSelections: String
}
object PickImplmaxSelectionsMaxSelections {
  
  inline def apply(maxSelections: String): PickImplmaxSelectionsMaxSelections = {
    val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSelectionsMaxSelections]
  }
  
  extension [Self <: PickImplmaxSelectionsMaxSelections](x: Self) {
    
    inline def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
  }
}
