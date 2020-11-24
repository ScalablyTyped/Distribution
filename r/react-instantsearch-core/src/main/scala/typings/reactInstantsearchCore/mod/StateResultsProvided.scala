package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateResultsProvided[TDoc] extends js.Object {
  
  /** In case of multiple indices you can retrieve all the results */
  var allSearchResults: AllSearchResults[TDoc] = js.native
  
  /** If the search failed, the error will be logged here. */
  var error: AlgoliaError = js.native
  
  /** Flag that indicates if React InstantSearch has detected that searches are stalled. */
  var isSearchStalled: js.Any = js.native
  
  /**
    * The search results.
    * In case of multiple indices: if used under <Index>, results will be those of the corresponding index
    * otherwise it’ll be those of the root index
    */
  var searchResults: SearchResults[TDoc] = js.native
  
  /** The search state of the instant search component.  */
  var searchState: SearchState = js.native
  
  /** If there is a search in progress. */
  var searching: Boolean = js.native
  
  /** If there is a search in a list in progress. */
  var searchingForFacetValues: js.Any = js.native
}
object StateResultsProvided {
  
  @scala.inline
  def apply[TDoc](
    allSearchResults: AllSearchResults[TDoc],
    error: AlgoliaError,
    isSearchStalled: js.Any,
    searchResults: SearchResults[TDoc],
    searchState: SearchState,
    searching: Boolean,
    searchingForFacetValues: js.Any
  ): StateResultsProvided[TDoc] = {
    val __obj = js.Dynamic.literal(allSearchResults = allSearchResults.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any], searchState = searchState.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], searchingForFacetValues = searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateResultsProvided[TDoc]]
  }
  
  @scala.inline
  implicit class StateResultsProvidedOps[Self <: StateResultsProvided[_], TDoc] (val x: Self with StateResultsProvided[TDoc]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllSearchResults(value: AllSearchResults[TDoc]): Self = this.set("allSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: AlgoliaError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalled(value: js.Any): Self = this.set("isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResults(value: SearchResults[TDoc]): Self = this.set("searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchState(value: SearchState): Self = this.set("searchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearching(value: Boolean): Self = this.set("searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchingForFacetValues(value: js.Any): Self = this.set("searchingForFacetValues", value.asInstanceOf[js.Any])
  }
}
