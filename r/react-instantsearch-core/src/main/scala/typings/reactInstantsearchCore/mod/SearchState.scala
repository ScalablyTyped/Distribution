package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactInstantsearchCore.anon.Dictkey
import typings.reactInstantsearchCore.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchState
  extends StObject
     with /* widgetId */ StringDictionary[Any] {
  
  var configure: js.UndefOr[Dictkey] = js.undefined
  
  var hierarchicalMenu: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  
  var indices: js.UndefOr[StringDictionary[typings.reactInstantsearchCore.anon.Configure]] = js.undefined
  
  var menu: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var multiRange: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var range: js.UndefOr[StringDictionary[Max]] = js.undefined
  
  var refinementList: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  var relevancyStrictness: js.UndefOr[Double] = js.undefined
  
  var sortBy: js.UndefOr[String] = js.undefined
  
  var toggle: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}
object SearchState {
  
  inline def apply(): SearchState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchState]
  }
  
  extension [Self <: SearchState](x: Self) {
    
    inline def setConfigure(value: Dictkey): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    inline def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    inline def setHierarchicalMenu(value: StringDictionary[String]): Self = StObject.set(x, "hierarchicalMenu", value.asInstanceOf[js.Any])
    
    inline def setHierarchicalMenuUndefined: Self = StObject.set(x, "hierarchicalMenu", js.undefined)
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    inline def setIndices(value: StringDictionary[typings.reactInstantsearchCore.anon.Configure]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setMenu(value: StringDictionary[String]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    inline def setMultiRange(value: StringDictionary[String]): Self = StObject.set(x, "multiRange", value.asInstanceOf[js.Any])
    
    inline def setMultiRangeUndefined: Self = StObject.set(x, "multiRange", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRange(value: StringDictionary[Max]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRefinementList(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "refinementList", value.asInstanceOf[js.Any])
    
    inline def setRefinementListUndefined: Self = StObject.set(x, "refinementList", js.undefined)
    
    inline def setRelevancyStrictness(value: Double): Self = StObject.set(x, "relevancyStrictness", value.asInstanceOf[js.Any])
    
    inline def setRelevancyStrictnessUndefined: Self = StObject.set(x, "relevancyStrictness", js.undefined)
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setToggle(value: StringDictionary[Boolean]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
