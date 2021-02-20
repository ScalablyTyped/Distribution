package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'dropdown'> */
@js.native
trait PickImpldropdown extends StObject {
  
  var dropdown: String = js.native
}
object PickImpldropdown {
  
  @scala.inline
  def apply(dropdown: String): PickImpldropdown = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldropdown]
  }
  
  @scala.inline
  implicit class PickImpldropdownMutableBuilder[Self <: PickImpldropdown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropdown(value: String): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
  }
}
