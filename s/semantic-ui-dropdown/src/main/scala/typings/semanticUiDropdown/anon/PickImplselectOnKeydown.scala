package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'selectOnKeydown'> */
@js.native
trait PickImplselectOnKeydown extends StObject {
  
  var selectOnKeydown: Boolean = js.native
}
object PickImplselectOnKeydown {
  
  @scala.inline
  def apply(selectOnKeydown: Boolean): PickImplselectOnKeydown = {
    val __obj = js.Dynamic.literal(selectOnKeydown = selectOnKeydown.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselectOnKeydown]
  }
  
  @scala.inline
  implicit class PickImplselectOnKeydownMutableBuilder[Self <: PickImplselectOnKeydown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectOnKeydown(value: Boolean): Self = StObject.set(x, "selectOnKeydown", value.asInstanceOf[js.Any])
  }
}
