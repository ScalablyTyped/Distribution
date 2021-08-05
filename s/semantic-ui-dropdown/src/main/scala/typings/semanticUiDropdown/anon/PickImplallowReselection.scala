package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowReselection'> */
trait PickImplallowReselection extends StObject {
  
  var allowReselection: Boolean
}
object PickImplallowReselection {
  
  inline def apply(allowReselection: Boolean): PickImplallowReselection = {
    val __obj = js.Dynamic.literal(allowReselection = allowReselection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowReselection]
  }
  
  extension [Self <: PickImplallowReselection](x: Self) {
    
    inline def setAllowReselection(value: Boolean): Self = StObject.set(x, "allowReselection", value.asInstanceOf[js.Any])
  }
}
