package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'delimiter'> */
trait PickImpldelimiter extends StObject {
  
  var delimiter: Double | `false`
}
object PickImpldelimiter {
  
  inline def apply(delimiter: Double | `false`): PickImpldelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelimiter]
  }
  
  extension [Self <: PickImpldelimiter](x: Self) {
    
    inline def setDelimiter(value: Double | `false`): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
  }
}
