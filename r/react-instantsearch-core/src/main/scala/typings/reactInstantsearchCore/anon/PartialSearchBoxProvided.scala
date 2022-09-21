package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.SearchBoxProvided> */
trait PartialSearchBoxProvided extends StObject {
  
  var currentRefinement: js.UndefOr[String] = js.undefined
  
  var isSearchStalled: js.UndefOr[Boolean] = js.undefined
  
  var refine: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object PartialSearchBoxProvided {
  
  inline def apply(): PartialSearchBoxProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchBoxProvided]
  }
  
  extension [Self <: PartialSearchBoxProvided](x: Self) {
    
    inline def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinementUndefined: Self = StObject.set(x, "currentRefinement", js.undefined)
    
    inline def setIsSearchStalled(value: Boolean): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    inline def setIsSearchStalledUndefined: Self = StObject.set(x, "isSearchStalled", js.undefined)
    
    inline def setRefine(value: /* repeated */ Any => Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
  }
}
