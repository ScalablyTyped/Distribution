package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.RefinementListProvided> */
trait PartialRefinementListProv extends StObject {
  
  var canRefine: js.UndefOr[Boolean] = js.undefined
  
  var createURL: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var currentRefinement: js.UndefOr[js.Array[String]] = js.undefined
  
  var isFromSearch: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[HitcountnumberisRefinedbo]] = js.undefined
  
  var refine: js.UndefOr[js.Function1[/* value */ js.Array[String], Any]] = js.undefined
  
  var searchForItems: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object PartialRefinementListProv {
  
  inline def apply(): PartialRefinementListProv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRefinementListProv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRefinementListProv] (val x: Self) extends AnyVal {
    
    inline def setCanRefine(value: Boolean): Self = StObject.set(x, "canRefine", value.asInstanceOf[js.Any])
    
    inline def setCanRefineUndefined: Self = StObject.set(x, "canRefine", js.undefined)
    
    inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
    
    inline def setCurrentRefinement(value: js.Array[String]): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinementUndefined: Self = StObject.set(x, "currentRefinement", js.undefined)
    
    inline def setCurrentRefinementVarargs(value: String*): Self = StObject.set(x, "currentRefinement", js.Array(value*))
    
    inline def setIsFromSearch(value: Boolean): Self = StObject.set(x, "isFromSearch", value.asInstanceOf[js.Any])
    
    inline def setIsFromSearchUndefined: Self = StObject.set(x, "isFromSearch", js.undefined)
    
    inline def setItems(value: js.Array[HitcountnumberisRefinedbo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: HitcountnumberisRefinedbo*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRefine(value: /* value */ js.Array[String] => Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
    
    inline def setSearchForItems(value: /* repeated */ Any => Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
    
    inline def setSearchForItemsUndefined: Self = StObject.set(x, "searchForItems", js.undefined)
  }
}
