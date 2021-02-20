package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'exactCount'> */
@js.native
trait PickImplexactCount extends StObject {
  
  var exactCount: String = js.native
}
object PickImplexactCount {
  
  @scala.inline
  def apply(exactCount: String): PickImplexactCount = {
    val __obj = js.Dynamic.literal(exactCount = exactCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplexactCount]
  }
  
  @scala.inline
  implicit class PickImplexactCountMutableBuilder[Self <: PickImplexactCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExactCount(value: String): Self = StObject.set(x, "exactCount", value.asInstanceOf[js.Any])
  }
}
