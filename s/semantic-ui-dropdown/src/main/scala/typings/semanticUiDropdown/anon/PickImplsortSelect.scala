package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'sortSelect'> */
trait PickImplsortSelect extends StObject {
  
  var sortSelect: Boolean
}
object PickImplsortSelect {
  
  @scala.inline
  def apply(sortSelect: Boolean): PickImplsortSelect = {
    val __obj = js.Dynamic.literal(sortSelect = sortSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsortSelect]
  }
  
  @scala.inline
  implicit class PickImplsortSelectMutableBuilder[Self <: PickImplsortSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSortSelect(value: Boolean): Self = StObject.set(x, "sortSelect", value.asInstanceOf[js.Any])
  }
}
