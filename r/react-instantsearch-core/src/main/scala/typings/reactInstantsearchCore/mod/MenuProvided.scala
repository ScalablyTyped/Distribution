package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProvided extends StObject {
  
  def createURL(args: Any*): Any
  
  var currentRefinement: String
  
  var isFromSearch: Boolean
  
  var items: js.Array[Count]
  
  def refine(args: Any*): Any
  
  def searchForItems(args: Any*): Any
}
object MenuProvided {
  
  inline def apply(
    createURL: /* repeated */ Any => Any,
    currentRefinement: String,
    isFromSearch: Boolean,
    items: js.Array[Count],
    refine: /* repeated */ Any => Any,
    searchForItems: /* repeated */ Any => Any
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[MenuProvided]
  }
  
  extension [Self <: MenuProvided](x: Self) {
    
    inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setIsFromSearch(value: Boolean): Self = StObject.set(x, "isFromSearch", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Count]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Count*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRefine(value: /* repeated */ Any => Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setSearchForItems(value: /* repeated */ Any => Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
  }
}
