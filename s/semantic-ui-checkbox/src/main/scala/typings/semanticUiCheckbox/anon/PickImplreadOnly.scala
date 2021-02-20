package typings.semanticUiCheckbox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ClassNameSettings._Impl, 'readOnly'> */
@js.native
trait PickImplreadOnly extends StObject {
  
  var readOnly: String = js.native
}
object PickImplreadOnly {
  
  @scala.inline
  def apply(readOnly: String): PickImplreadOnly = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreadOnly]
  }
  
  @scala.inline
  implicit class PickImplreadOnlyMutableBuilder[Self <: PickImplreadOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
