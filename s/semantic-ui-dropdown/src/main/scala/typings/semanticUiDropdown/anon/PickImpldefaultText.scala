package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'defaultText'> */
@js.native
trait PickImpldefaultText extends StObject {
  
  var defaultText: String = js.native
}
object PickImpldefaultText {
  
  @scala.inline
  def apply(defaultText: String): PickImpldefaultText = {
    val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultText]
  }
  
  @scala.inline
  implicit class PickImpldefaultTextMutableBuilder[Self <: PickImpldefaultText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
  }
}
