package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'menu'> */
@js.native
trait PickImplmenu extends StObject {
  
  var menu: String = js.native
}
object PickImplmenu {
  
  @scala.inline
  def apply(menu: String): PickImplmenu = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmenu]
  }
  
  @scala.inline
  implicit class PickImplmenuMutableBuilder[Self <: PickImplmenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
  }
}
