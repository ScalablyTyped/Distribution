package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'showNoResults'> */
trait PickImplshowNoResults extends StObject {
  
  var showNoResults: Boolean
}
object PickImplshowNoResults {
  
  inline def apply(showNoResults: Boolean): PickImplshowNoResults = {
    val __obj = js.Dynamic.literal(showNoResults = showNoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowNoResults]
  }
  
  extension [Self <: PickImplshowNoResults](x: Self) {
    
    inline def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
  }
}
