package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'isExactly'> */
@js.native
trait PickImplisExactly extends StObject {
  
  var isExactly: String = js.native
}
object PickImplisExactly {
  
  @scala.inline
  def apply(isExactly: String): PickImplisExactly = {
    val __obj = js.Dynamic.literal(isExactly = isExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplisExactly]
  }
  
  @scala.inline
  implicit class PickImplisExactlyMutableBuilder[Self <: PickImplisExactly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExactly(value: String): Self = StObject.set(x, "isExactly", value.asInstanceOf[js.Any])
  }
}
