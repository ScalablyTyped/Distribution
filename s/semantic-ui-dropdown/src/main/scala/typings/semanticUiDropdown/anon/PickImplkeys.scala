package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'keys'> */
trait PickImplkeys extends StObject {
  
  var keys: KeySettings
}
object PickImplkeys {
  
  inline def apply(keys: KeySettings): PickImplkeys = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeys]
  }
  
  extension [Self <: PickImplkeys](x: Self) {
    
    inline def setKeys(value: KeySettings): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
