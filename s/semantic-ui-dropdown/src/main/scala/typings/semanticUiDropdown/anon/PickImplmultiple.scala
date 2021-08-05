package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'multiple'> */
trait PickImplmultiple extends StObject {
  
  var multiple: String
}
object PickImplmultiple {
  
  inline def apply(multiple: String): PickImplmultiple = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmultiple]
  }
  
  extension [Self <: PickImplmultiple](x: Self) {
    
    inline def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
  }
}
