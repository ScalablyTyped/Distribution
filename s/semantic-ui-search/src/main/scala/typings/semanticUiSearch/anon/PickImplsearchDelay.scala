package typings.semanticUiSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'searchDelay'> */
trait PickImplsearchDelay extends StObject {
  
  var searchDelay: Double
}
object PickImplsearchDelay {
  
  inline def apply(searchDelay: Double): PickImplsearchDelay = {
    val __obj = js.Dynamic.literal(searchDelay = searchDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchDelay]
  }
  
  extension [Self <: PickImplsearchDelay](x: Self) {
    
    inline def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
  }
}
