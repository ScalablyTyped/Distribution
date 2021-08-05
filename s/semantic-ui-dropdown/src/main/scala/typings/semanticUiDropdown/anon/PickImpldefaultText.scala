package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MetadataSettings._Impl, 'defaultText'> */
trait PickImpldefaultText extends StObject {
  
  var defaultText: String
}
object PickImpldefaultText {
  
  inline def apply(defaultText: String): PickImpldefaultText = {
    val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultText]
  }
  
  extension [Self <: PickImpldefaultText](x: Self) {
    
    inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
  }
}
