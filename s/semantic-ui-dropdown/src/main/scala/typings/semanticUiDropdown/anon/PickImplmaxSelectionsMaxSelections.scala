package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'maxSelections'> */
@js.native
trait PickImplmaxSelectionsMaxSelections extends StObject {
  
  var maxSelections: String = js.native
}
object PickImplmaxSelectionsMaxSelections {
  
  @scala.inline
  def apply(maxSelections: String): PickImplmaxSelectionsMaxSelections = {
    val __obj = js.Dynamic.literal(maxSelections = maxSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxSelectionsMaxSelections]
  }
  
  @scala.inline
  implicit class PickImplmaxSelectionsMaxSelectionsMutableBuilder[Self <: PickImplmaxSelectionsMaxSelections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxSelections(value: String): Self = StObject.set(x, "maxSelections", value.asInstanceOf[js.Any])
  }
}
