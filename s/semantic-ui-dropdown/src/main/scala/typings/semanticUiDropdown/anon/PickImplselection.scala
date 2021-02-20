package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'selection'> */
@js.native
trait PickImplselection extends StObject {
  
  var selection: String = js.native
}
object PickImplselection {
  
  @scala.inline
  def apply(selection: String): PickImplselection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselection]
  }
  
  @scala.inline
  implicit class PickImplselectionMutableBuilder[Self <: PickImplselection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
