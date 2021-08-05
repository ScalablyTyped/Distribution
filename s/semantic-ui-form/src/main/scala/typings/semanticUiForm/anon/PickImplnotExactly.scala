package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'notExactly'> */
trait PickImplnotExactly extends StObject {
  
  var notExactly: String
}
object PickImplnotExactly {
  
  inline def apply(notExactly: String): PickImplnotExactly = {
    val __obj = js.Dynamic.literal(notExactly = notExactly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnotExactly]
  }
  
  extension [Self <: PickImplnotExactly](x: Self) {
    
    inline def setNotExactly(value: String): Self = StObject.set(x, "notExactly", value.asInstanceOf[js.Any])
  }
}
