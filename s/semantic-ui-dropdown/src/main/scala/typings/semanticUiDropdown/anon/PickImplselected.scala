package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'selected'> */
trait PickImplselected extends StObject {
  
  var selected: String
}
object PickImplselected {
  
  @scala.inline
  def apply(selected: String): PickImplselected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselected]
  }
  
  @scala.inline
  implicit class PickImplselectedMutableBuilder[Self <: PickImplselected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
