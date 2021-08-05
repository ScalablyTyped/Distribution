package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ErrorSettings._Impl, 'noResults'> */
trait PickImplnoResults extends StObject {
  
  var noResults: String
}
object PickImplnoResults {
  
  inline def apply(noResults: String): PickImplnoResults = {
    val __obj = js.Dynamic.literal(noResults = noResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoResults]
  }
  
  extension [Self <: PickImplnoResults](x: Self) {
    
    inline def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
  }
}
