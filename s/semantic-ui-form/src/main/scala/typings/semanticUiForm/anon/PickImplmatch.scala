package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.PromptSettings._Impl, 'match'> */
trait PickImplmatch extends StObject {
  
  var `match`: String
}
object PickImplmatch {
  
  inline def apply(`match`: String): PickImplmatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmatch]
  }
  
  extension [Self <: PickImplmatch](x: Self) {
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
