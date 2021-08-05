package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'isExactly'> */
trait PickImplisExactly extends StObject {
  
  var isExactly: String
}
object PickImplisExactly {
  
  inline def apply(isExactly: String): PickImplisExactly = {
    val __obj = js.Dynamic.literal(isExactly = isExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplisExactly]
  }
  
  extension [Self <: PickImplisExactly](x: Self) {
    
    inline def setIsExactly(value: String): Self = StObject.set(x, "isExactly", value.asInstanceOf[js.Any])
  }
}
