package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'backspace'> */
trait PickImplbackspace extends StObject {
  
  var backspace: Double
}
object PickImplbackspace {
  
  inline def apply(backspace: Double): PickImplbackspace = {
    val __obj = js.Dynamic.literal(backspace = backspace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbackspace]
  }
  
  extension [Self <: PickImplbackspace](x: Self) {
    
    inline def setBackspace(value: Double): Self = StObject.set(x, "backspace", value.asInstanceOf[js.Any])
  }
}
