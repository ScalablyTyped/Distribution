package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuProvided extends StObject {
  
  def createURL(args: js.Any*): js.Any
  
  var currentRefinement: String
  
  var isFromSearch: Boolean
  
  var items: js.Array[Count]
  
  def refine(args: js.Any*): js.Any
  
  def searchForItems(args: js.Any*): js.Any
}
object MenuProvided {
  
  @scala.inline
  def apply(
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: String,
    isFromSearch: Boolean,
    items: js.Array[Count],
    refine: /* repeated */ js.Any => js.Any,
    searchForItems: /* repeated */ js.Any => js.Any
  ): MenuProvided = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[MenuProvided]
  }
  
  @scala.inline
  implicit class MenuProvidedMutableBuilder[Self <: MenuProvided] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentRefinement(value: String): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFromSearch(value: Boolean): Self = StObject.set(x, "isFromSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Count]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Count*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setRefine(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSearchForItems(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
  }
}
