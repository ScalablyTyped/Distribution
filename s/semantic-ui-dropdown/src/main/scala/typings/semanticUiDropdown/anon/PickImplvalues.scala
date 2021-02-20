package typings.semanticUiDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'values'> */
@js.native
trait PickImplvalues extends StObject {
  
  var values: js.Any = js.native
}
object PickImplvalues {
  
  @scala.inline
  def apply(values: js.Any): PickImplvalues = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvalues]
  }
  
  @scala.inline
  implicit class PickImplvaluesMutableBuilder[Self <: PickImplvalues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
