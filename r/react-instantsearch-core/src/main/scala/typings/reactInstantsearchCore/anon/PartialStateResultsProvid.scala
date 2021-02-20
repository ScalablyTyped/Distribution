package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.AlgoliaError
import typings.reactInstantsearchCore.mod.AllSearchResults
import typings.reactInstantsearchCore.mod.SearchResults
import typings.reactInstantsearchCore.mod.SearchState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StateResultsProvided<any>> */
@js.native
trait PartialStateResultsProvid extends StObject {
  
  var allSearchResults: js.UndefOr[AllSearchResults[_]] = js.native
  
  var error: js.UndefOr[AlgoliaError] = js.native
  
  var isSearchStalled: js.UndefOr[js.Any] = js.native
  
  var searchResults: js.UndefOr[SearchResults[_]] = js.native
  
  var searchState: js.UndefOr[SearchState] = js.native
  
  var searching: js.UndefOr[Boolean] = js.native
  
  var searchingForFacetValues: js.UndefOr[js.Any] = js.native
}
object PartialStateResultsProvid {
  
  @scala.inline
  def apply(): PartialStateResultsProvid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateResultsProvid]
  }
  
  @scala.inline
  implicit class PartialStateResultsProvidMutableBuilder[Self <: PartialStateResultsProvid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllSearchResults(value: AllSearchResults[_]): Self = StObject.set(x, "allSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllSearchResultsUndefined: Self = StObject.set(x, "allSearchResults", js.undefined)
    
    @scala.inline
    def setError(value: AlgoliaError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIsSearchStalled(value: js.Any): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalledUndefined: Self = StObject.set(x, "isSearchStalled", js.undefined)
    
    @scala.inline
    def setSearchResults(value: SearchResults[_]): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultsUndefined: Self = StObject.set(x, "searchResults", js.undefined)
    
    @scala.inline
    def setSearchState(value: SearchState): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStateUndefined: Self = StObject.set(x, "searchState", js.undefined)
    
    @scala.inline
    def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchingForFacetValues(value: js.Any): Self = StObject.set(x, "searchingForFacetValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchingForFacetValuesUndefined: Self = StObject.set(x, "searchingForFacetValues", js.undefined)
    
    @scala.inline
    def setSearchingUndefined: Self = StObject.set(x, "searching", js.undefined)
  }
}
