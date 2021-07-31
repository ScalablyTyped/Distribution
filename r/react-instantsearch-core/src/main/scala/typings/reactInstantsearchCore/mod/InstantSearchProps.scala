package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantSearchProps extends StObject {
  
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var indexName: String
  
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  
  var refresh: js.UndefOr[Boolean] = js.undefined
  
  var resultsState: js.UndefOr[js.Any] = js.undefined
  
  var searchClient: js.Any
  
  var searchState: js.UndefOr[js.Any] = js.undefined
  
  var stalledSearchDelay: js.UndefOr[Double] = js.undefined
}
object InstantSearchProps {
  
  @scala.inline
  def apply(indexName: String, searchClient: js.Any): InstantSearchProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
  
  @scala.inline
  implicit class InstantSearchPropsMutableBuilder[Self <: InstantSearchProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateURLUndefined: Self = StObject.set(x, "createURL", js.undefined)
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSearchParameters(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onSearchParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchParametersUndefined: Self = StObject.set(x, "onSearchParameters", js.undefined)
    
    @scala.inline
    def setOnSearchStateChange(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onSearchStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchStateChangeUndefined: Self = StObject.set(x, "onSearchStateChange", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setResultsState(value: js.Any): Self = StObject.set(x, "resultsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsStateUndefined: Self = StObject.set(x, "resultsState", js.undefined)
    
    @scala.inline
    def setSearchClient(value: js.Any): Self = StObject.set(x, "searchClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchState(value: js.Any): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
    
    @scala.inline
    def setStalledSearchDelay(value: Double): Self = StObject.set(x, "stalledSearchDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStalledSearchDelayUndefined: Self = StObject.set(x, "stalledSearchDelay", js.undefined)
  }
}
