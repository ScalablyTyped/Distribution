package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'hideAdditions'> */
trait PickImplhideAdditions extends StObject {
  
  var hideAdditions: Boolean
}
object PickImplhideAdditions {
  
  @scala.inline
  def apply(hideAdditions: Boolean): PickImplhideAdditions = {
    val __obj = js.Dynamic.literal(hideAdditions = hideAdditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideAdditions]
  }
  
  @scala.inline
  implicit class PickImplhideAdditionsMutableBuilder[Self <: PickImplhideAdditions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideAdditions(value: Boolean): Self = StObject.set(x, "hideAdditions", value.asInstanceOf[js.Any])
  }
}
