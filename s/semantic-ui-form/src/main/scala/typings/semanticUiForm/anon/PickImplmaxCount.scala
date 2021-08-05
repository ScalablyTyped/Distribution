package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'maxCount'> */
trait PickImplmaxCount extends StObject {
  
  var maxCount: String
}
object PickImplmaxCount {
  
  inline def apply(maxCount: String): PickImplmaxCount = {
    val __obj = js.Dynamic.literal(maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxCount]
  }
  
  extension [Self <: PickImplmaxCount](x: Self) {
    
    inline def setMaxCount(value: String): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
  }
}
