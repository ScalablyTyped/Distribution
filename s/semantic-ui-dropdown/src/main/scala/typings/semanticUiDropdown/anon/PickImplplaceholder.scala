package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'placeholder'> */
@js.native
trait PickImplplaceholder extends StObject {
  
  var placeholder: auto | value | `false` = js.native
}
object PickImplplaceholder {
  
  @scala.inline
  def apply(placeholder: auto | value | `false`): PickImplplaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholder]
  }
  
  @scala.inline
  implicit class PickImplplaceholderMutableBuilder[Self <: PickImplplaceholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: auto | value | `false`): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
