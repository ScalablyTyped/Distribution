package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateResultsProvided[TDoc] extends StObject {
  
  /** In case of multiple indices you can retrieve all the results */
  var allSearchResults: AllSearchResults[TDoc]
  
  /** If the search failed, the error will be logged here. */
  var error: js.UndefOr[AlgoliaError] = js.undefined
  
  /** Flag that indicates if React InstantSearch has detected that searches are stalled. */
  var isSearchStalled: Any
  
  /**
    * The search results.
    * In case of multiple indices: if used under <Index>, results will be those of the corresponding index
    * otherwise it’ll be those of the root index
    */
  var searchResults: SearchResults[TDoc]
  
  /** The search state of the instant search component.  */
  var searchState: SearchState
  
  /** If there is a search in progress. */
  var searching: Boolean
  
  /** If there is a search in a list in progress. */
  var searchingForFacetValues: Any
}
object StateResultsProvided {
  
  inline def apply[TDoc](
    allSearchResults: AllSearchResults[TDoc],
    isSearchStalled: Any,
    searchResults: SearchResults[TDoc],
    searchState: SearchState,
    searching: Boolean,
    searchingForFacetValues: Any
  ): StateResultsProvided[TDoc] = {
    val __obj = js.Dynamic.literal(allSearchResults = allSearchResults.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], searchResults = searchResults.asInstanceOf[js.Any], searchState = searchState.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], searchingForFacetValues = searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateResultsProvided[TDoc]]
  }
  
  extension [Self <: StateResultsProvided[?], TDoc](x: Self & StateResultsProvided[TDoc]) {
    
    inline def setAllSearchResults(value: AllSearchResults[TDoc]): Self = StObject.set(x, "allSearchResults", value.asInstanceOf[js.Any])
    
    inline def setError(value: AlgoliaError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsSearchStalled(value: Any): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    inline def setSearchResults(value: SearchResults[TDoc]): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
    
    inline def setSearchState(value: SearchState): Self = StObject.set(x, "searchState", value.asInstanceOf[js.Any])
    
    inline def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    inline def setSearchingForFacetValues(value: Any): Self = StObject.set(x, "searchingForFacetValues", value.asInstanceOf[js.Any])
  }
}
