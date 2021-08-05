package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'menu'> */
trait PickImplmenu extends StObject {
  
  var menu: String
}
object PickImplmenu {
  
  inline def apply(menu: String): PickImplmenu = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmenu]
  }
  
  extension [Self <: PickImplmenu](x: Self) {
    
    inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
  }
}
