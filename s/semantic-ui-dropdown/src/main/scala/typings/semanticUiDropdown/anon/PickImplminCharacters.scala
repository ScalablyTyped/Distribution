package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'minCharacters'> */
trait PickImplminCharacters extends StObject {
  
  var minCharacters: Double
}
object PickImplminCharacters {
  
  inline def apply(minCharacters: Double): PickImplminCharacters = {
    val __obj = js.Dynamic.literal(minCharacters = minCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminCharacters]
  }
  
  extension [Self <: PickImplminCharacters](x: Self) {
    
    inline def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
  }
}
