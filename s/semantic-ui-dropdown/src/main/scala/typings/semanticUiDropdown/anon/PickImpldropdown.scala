package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'dropdown'> */
trait PickImpldropdown extends StObject {
  
  var dropdown: String
}
object PickImpldropdown {
  
  inline def apply(dropdown: String): PickImpldropdown = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldropdown]
  }
  
  extension [Self <: PickImpldropdown](x: Self) {
    
    inline def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
  }
}
