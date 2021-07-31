package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.SelectorSettings._Impl, 'siblingLabel'> */
trait PickImplsiblingLabel extends StObject {
  
  var siblingLabel: String
}
object PickImplsiblingLabel {
  
  @scala.inline
  def apply(siblingLabel: String): PickImplsiblingLabel = {
    val __obj = js.Dynamic.literal(siblingLabel = siblingLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsiblingLabel]
  }
  
  @scala.inline
  implicit class PickImplsiblingLabelMutableBuilder[Self <: PickImplsiblingLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSiblingLabel(value: String): Self = StObject.set(x, "siblingLabel", value.asInstanceOf[js.Any])
  }
}
