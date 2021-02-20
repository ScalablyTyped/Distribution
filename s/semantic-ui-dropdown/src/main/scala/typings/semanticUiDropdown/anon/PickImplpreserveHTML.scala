package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'preserveHTML'> */
@js.native
trait PickImplpreserveHTML extends StObject {
  
  var preserveHTML: Boolean = js.native
}
object PickImplpreserveHTML {
  
  @scala.inline
  def apply(preserveHTML: Boolean): PickImplpreserveHTML = {
    val __obj = js.Dynamic.literal(preserveHTML = preserveHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpreserveHTML]
  }
  
  @scala.inline
  implicit class PickImplpreserveHTMLMutableBuilder[Self <: PickImplpreserveHTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreserveHTML(value: Boolean): Self = StObject.set(x, "preserveHTML", value.asInstanceOf[js.Any])
  }
}
