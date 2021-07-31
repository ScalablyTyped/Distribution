package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.MenuProvided> */
trait PartialMenuProvided extends StObject {
  
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var currentRefinement: js.UndefOr[String] = js.undefined
  
  var isFromSearch: js.UndefOr[Boolean] = js.undefined
  
  var items: js.UndefOr[js.Array[Count]] = js.undefined
  
  var refine: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var searchForItems: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
}
object PartialMenuProvided {
  
  @scala.inline
  def apply(): PartialMenuProvided = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMenuProvided]
  }
  
  @scala.inline
  implicit class PartialMenuProvidedMutableBuilder[Self <: PartialMenuProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRefinementUndefined: Self = StObject.set(x, "currentRefinement", js.undefined)
    
    @scala.inline
    def setIsFromSearch(value: Boolean): Self = StObject.set(x, "isFromSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFromSearchUndefined: Self = StObject.set(x, "isFromSearch", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Count]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Count*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefineUndefined: Self = StObject.set(x, "refine", js.undefined)
    
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchForItemsUndefined: Self = StObject.set(x, "searchForItems", js.undefined)
  }
}
