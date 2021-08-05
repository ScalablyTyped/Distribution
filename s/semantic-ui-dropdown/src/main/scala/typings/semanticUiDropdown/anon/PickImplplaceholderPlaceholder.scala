package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'placeholder'> */
trait PickImplplaceholderPlaceholder extends StObject {
  
  var placeholder: String
}
object PickImplplaceholderPlaceholder {
  
  inline def apply(placeholder: String): PickImplplaceholderPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderPlaceholder]
  }
  
  extension [Self <: PickImplplaceholderPlaceholder](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
