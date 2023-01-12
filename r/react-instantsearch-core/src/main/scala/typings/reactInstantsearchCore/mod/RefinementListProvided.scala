package typings.reactInstantsearchCore.mod

import typings.reactInstantsearchCore.anon.HitcountnumberisRefinedbo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinementListProvided extends StObject {
  
  /** a boolean that says whether you can currently refine */
  var canRefine: Boolean
  
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: Any*): Any
  
  /** the refinement currently applied */
  var currentRefinement: js.Array[String]
  
  /** a boolean that says if the items props contains facet values from the global search or from the search inside items. */
  var isFromSearch: Boolean
  
  /**
    * The list of items the RefinementList can display.
    * If isFromSearch is false, the hit properties like _highlightResult are undefined
    */
  var items: js.Array[HitcountnumberisRefinedbo]
  
  /** a function to toggle a refinement */
  def refine(value: js.Array[String]): Any
  
  /** a function to toggle a search inside items values */
  def searchForItems(args: Any*): Any
}
object RefinementListProvided {
  
  inline def apply(
    canRefine: Boolean,
    createURL: /* repeated */ Any => Any,
    currentRefinement: js.Array[String],
    isFromSearch: Boolean,
    items: js.Array[HitcountnumberisRefinedbo],
    refine: js.Array[String] => Any,
    searchForItems: /* repeated */ Any => Any
  ): RefinementListProvided = {
    val __obj = js.Dynamic.literal(canRefine = canRefine.asInstanceOf[js.Any], createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement.asInstanceOf[js.Any], isFromSearch = isFromSearch.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], refine = js.Any.fromFunction1(refine), searchForItems = js.Any.fromFunction1(searchForItems))
    __obj.asInstanceOf[RefinementListProvided]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefinementListProvided] (val x: Self) extends AnyVal {
    
    inline def setCanRefine(value: Boolean): Self = StObject.set(x, "canRefine", value.asInstanceOf[js.Any])
    
    inline def setCreateURL(value: /* repeated */ Any => Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    inline def setCurrentRefinement(value: js.Array[String]): Self = StObject.set(x, "currentRefinement", value.asInstanceOf[js.Any])
    
    inline def setCurrentRefinementVarargs(value: String*): Self = StObject.set(x, "currentRefinement", js.Array(value*))
    
    inline def setIsFromSearch(value: Boolean): Self = StObject.set(x, "isFromSearch", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[HitcountnumberisRefinedbo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: HitcountnumberisRefinedbo*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRefine(value: js.Array[String] => Any): Self = StObject.set(x, "refine", js.Any.fromFunction1(value))
    
    inline def setSearchForItems(value: /* repeated */ Any => Any): Self = StObject.set(x, "searchForItems", js.Any.fromFunction1(value))
  }
}
