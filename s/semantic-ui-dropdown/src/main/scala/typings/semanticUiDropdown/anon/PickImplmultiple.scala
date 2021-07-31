package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'multiple'> */
trait PickImplmultiple extends StObject {
  
  var multiple: String
}
object PickImplmultiple {
  
  @scala.inline
  def apply(multiple: String): PickImplmultiple = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmultiple]
  }
  
  @scala.inline
  implicit class PickImplmultipleMutableBuilder[Self <: PickImplmultiple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
  }
}
