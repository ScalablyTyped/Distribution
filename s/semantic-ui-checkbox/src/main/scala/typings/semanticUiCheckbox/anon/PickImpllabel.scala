package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.SelectorSettings._Impl, 'label'> */
trait PickImpllabel extends StObject {
  
  var label: String
}
object PickImpllabel {
  
  @scala.inline
  def apply(label: String): PickImpllabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllabel]
  }
  
  @scala.inline
  implicit class PickImpllabelMutableBuilder[Self <: PickImpllabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
