package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'preserveHTML'> */
trait PickImplpreserveHTML extends StObject {
  
  var preserveHTML: Boolean
}
object PickImplpreserveHTML {
  
  inline def apply(preserveHTML: Boolean): PickImplpreserveHTML = {
    val __obj = js.Dynamic.literal(preserveHTML = preserveHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpreserveHTML]
  }
  
  extension [Self <: PickImplpreserveHTML](x: Self) {
    
    inline def setPreserveHTML(value: Boolean): Self = StObject.set(x, "preserveHTML", value.asInstanceOf[js.Any])
  }
}
