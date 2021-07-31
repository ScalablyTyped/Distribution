package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'defaultValue'> */
trait PickImpldefaultValue extends StObject {
  
  var defaultValue: String
}
object PickImpldefaultValue {
  
  @scala.inline
  def apply(defaultValue: String): PickImpldefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultValue]
  }
  
  @scala.inline
  implicit class PickImpldefaultValueMutableBuilder[Self <: PickImpldefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
