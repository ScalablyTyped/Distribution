package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'minCount'> */
trait PickImplminCount extends StObject {
  
  var minCount: String
}
object PickImplminCount {
  
  inline def apply(minCount: String): PickImplminCount = {
    val __obj = js.Dynamic.literal(minCount = minCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminCount]
  }
  
  extension [Self <: PickImplminCount](x: Self) {
    
    inline def setMinCount(value: String): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
  }
}
