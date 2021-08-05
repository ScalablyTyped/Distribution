package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowCategorySelection'> */
trait PickImplallowCategorySele extends StObject {
  
  var allowCategorySelection: Boolean
}
object PickImplallowCategorySele {
  
  inline def apply(allowCategorySelection: Boolean): PickImplallowCategorySele = {
    val __obj = js.Dynamic.literal(allowCategorySelection = allowCategorySelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowCategorySele]
  }
  
  extension [Self <: PickImplallowCategorySele](x: Self) {
    
    inline def setAllowCategorySelection(value: Boolean): Self = StObject.set(x, "allowCategorySelection", value.asInstanceOf[js.Any])
  }
}
