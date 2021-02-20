package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowCategorySelection'> */
@js.native
trait PickImplallowCategorySele extends StObject {
  
  var allowCategorySelection: Boolean = js.native
}
object PickImplallowCategorySele {
  
  @scala.inline
  def apply(allowCategorySelection: Boolean): PickImplallowCategorySele = {
    val __obj = js.Dynamic.literal(allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowCategorySele]
  }
  
  @scala.inline
  implicit class PickImplallowCategorySeleMutableBuilder[Self <: PickImplallowCategorySele] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCategorySelection(value: Boolean): Self = StObject.set(x, "allowCategorySelection", value.asInstanceOf[js.Any])
  }
}
