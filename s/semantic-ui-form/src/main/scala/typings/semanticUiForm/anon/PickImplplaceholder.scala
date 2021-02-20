package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ClassNameSettings._Impl, 'placeholder'> */
@js.native
trait PickImplplaceholder extends StObject {
  
  var placeholder: String = js.native
}
object PickImplplaceholder {
  
  @scala.inline
  def apply(placeholder: String): PickImplplaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholder]
  }
  
  @scala.inline
  implicit class PickImplplaceholderMutableBuilder[Self <: PickImplplaceholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
