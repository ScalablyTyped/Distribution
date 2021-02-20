package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'label'> */
@js.native
trait PickImpllabelLabel extends StObject {
  
  var label: String = js.native
}
object PickImpllabelLabel {
  
  @scala.inline
  def apply(label: String): PickImpllabelLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabelLabel]
  }
  
  @scala.inline
  implicit class PickImpllabelLabelMutableBuilder[Self <: PickImpllabelLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
