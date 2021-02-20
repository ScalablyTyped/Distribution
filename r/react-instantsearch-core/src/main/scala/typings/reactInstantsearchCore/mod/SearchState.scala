package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactInstantsearchCore.anon.Dictkey
import typings.reactInstantsearchCore.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchState
  extends /* widgetId */ StringDictionary[js.Any] {
  
  var configure: js.UndefOr[Dictkey] = js.native
  
  var hierarchicalMenu: js.UndefOr[StringDictionary[String]] = js.native
  
  var hitsPerPage: js.UndefOr[Double] = js.native
  
  var indices: js.UndefOr[StringDictionary[typings.reactInstantsearchCore.anon.Configure]] = js.native
  
  var menu: js.UndefOr[StringDictionary[String]] = js.native
  
  var multiRange: js.UndefOr[StringDictionary[String]] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var range: js.UndefOr[StringDictionary[Max]] = js.native
  
  var refinementList: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  var sortBy: js.UndefOr[String] = js.native
  
  var toggle: js.UndefOr[StringDictionary[Boolean]] = js.native
}
object SearchState {
  
  @scala.inline
  def apply(): SearchState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchState]
  }
  
  @scala.inline
  implicit class SearchStateMutableBuilder[Self <: SearchState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigure(value: Dictkey): Self = StObject.set(x, "configure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureUndefined: Self = StObject.set(x, "configure", js.undefined)
    
    @scala.inline
    def setHierarchicalMenu(value: StringDictionary[String]): Self = StObject.set(x, "hierarchicalMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchicalMenuUndefined: Self = StObject.set(x, "hierarchicalMenu", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    @scala.inline
    def setIndices(value: StringDictionary[typings.reactInstantsearchCore.anon.Configure]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    @scala.inline
    def setMenu(value: StringDictionary[String]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
    
    @scala.inline
    def setMultiRange(value: StringDictionary[String]): Self = StObject.set(x, "multiRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiRangeUndefined: Self = StObject.set(x, "multiRange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRange(value: StringDictionary[Max]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRefinementList(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "refinementList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementListUndefined: Self = StObject.set(x, "refinementList", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setToggle(value: StringDictionary[Boolean]): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
  }
}
