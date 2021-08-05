package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.SelectorSettings._Impl, 'result'> */
trait PickImplresult extends StObject {
  
  var result: String
}
object PickImplresult {
  
  inline def apply(result: String): PickImplresult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresult]
  }
  
  extension [Self <: PickImplresult](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
