package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowAdditions'> */
trait PickImplallowAdditions extends StObject {
  
  var allowAdditions: Boolean
}
object PickImplallowAdditions {
  
  inline def apply(allowAdditions: Boolean): PickImplallowAdditions = {
    val __obj = js.Dynamic.literal(allowAdditions = allowAdditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowAdditions]
  }
  
  extension [Self <: PickImplallowAdditions](x: Self) {
    
    inline def setAllowAdditions(value: Boolean): Self = StObject.set(x, "allowAdditions", value.asInstanceOf[js.Any])
  }
}
