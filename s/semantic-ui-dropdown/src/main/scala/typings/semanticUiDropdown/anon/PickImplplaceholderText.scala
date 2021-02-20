package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'placeholderText'> */
@js.native
trait PickImplplaceholderText extends StObject {
  
  var placeholderText: String = js.native
}
object PickImplplaceholderText {
  
  @scala.inline
  def apply(placeholderText: String): PickImplplaceholderText = {
    val __obj = js.Dynamic.literal(placeholderText = placeholderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderText]
  }
  
  @scala.inline
  implicit class PickImplplaceholderTextMutableBuilder[Self <: PickImplplaceholderText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
  }
}
