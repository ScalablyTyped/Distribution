package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, 'menuIcon'> */
trait PickImplmenuIcon extends StObject {
  
  var menuIcon: String
}
object PickImplmenuIcon {
  
  inline def apply(menuIcon: String): PickImplmenuIcon = {
    val __obj = js.Dynamic.literal(menuIcon = menuIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmenuIcon]
  }
  
  extension [Self <: PickImplmenuIcon](x: Self) {
    
    inline def setMenuIcon(value: String): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
  }
}
