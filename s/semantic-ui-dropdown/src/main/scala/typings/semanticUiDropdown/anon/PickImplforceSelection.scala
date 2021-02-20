package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'forceSelection'> */
@js.native
trait PickImplforceSelection extends StObject {
  
  var forceSelection: Boolean = js.native
}
object PickImplforceSelection {
  
  @scala.inline
  def apply(forceSelection: Boolean): PickImplforceSelection = {
    val __obj = js.Dynamic.literal(forceSelection = forceSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplforceSelection]
  }
  
  @scala.inline
  implicit class PickImplforceSelectionMutableBuilder[Self <: PickImplforceSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceSelection(value: Boolean): Self = StObject.set(x, "forceSelection", value.asInstanceOf[js.Any])
  }
}
