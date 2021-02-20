package typings.semanticUiForm.anon

import typings.semanticUiForm.SemanticUI.Form.TextSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'text'> */
@js.native
trait PickImpltext extends StObject {
  
  var text: TextSettings = js.native
}
object PickImpltext {
  
  @scala.inline
  def apply(text: TextSettings): PickImpltext = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltext]
  }
  
  @scala.inline
  implicit class PickImpltextMutableBuilder[Self <: PickImpltext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
