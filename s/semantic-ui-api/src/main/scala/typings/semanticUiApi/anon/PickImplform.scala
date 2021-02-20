package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.SelectorSettings._Impl, 'form'> */
@js.native
trait PickImplform extends StObject {
  
  var form: String = js.native
}
object PickImplform {
  
  @scala.inline
  def apply(form: String): PickImplform = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplform]
  }
  
  @scala.inline
  implicit class PickImplformMutableBuilder[Self <: PickImplform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
