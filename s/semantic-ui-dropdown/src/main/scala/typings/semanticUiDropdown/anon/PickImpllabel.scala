package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.LabelSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'label'> */
@js.native
trait PickImpllabel extends StObject {
  
  var label: LabelSettings = js.native
}
object PickImpllabel {
  
  @scala.inline
  def apply(label: LabelSettings): PickImpllabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabel]
  }
  
  @scala.inline
  implicit class PickImpllabelMutableBuilder[Self <: PickImpllabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: LabelSettings): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
