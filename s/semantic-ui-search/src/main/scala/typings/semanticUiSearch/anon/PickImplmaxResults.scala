package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'maxResults'> */
trait PickImplmaxResults extends StObject {
  
  var maxResults: Double
}
object PickImplmaxResults {
  
  inline def apply(maxResults: Double): PickImplmaxResults = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmaxResults]
  }
  
  extension [Self <: PickImplmaxResults](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
  }
}
