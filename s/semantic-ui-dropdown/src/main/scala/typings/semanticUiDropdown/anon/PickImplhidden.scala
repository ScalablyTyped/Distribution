package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'hidden'> */
trait PickImplhidden extends StObject {
  
  var hidden: String
}
object PickImplhidden {
  
  inline def apply(hidden: String): PickImplhidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhidden]
  }
  
  extension [Self <: PickImplhidden](x: Self) {
    
    inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
