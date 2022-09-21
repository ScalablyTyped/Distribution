package typings.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorSearchResults[TDoc] extends StObject {
  
  var error: Any
  
  var isSearchStalled: Boolean
  
  var results: AllSearchResults[TDoc]
  
  var searching: Boolean
  
  var searchingForFacetValues: Boolean
}
object ConnectorSearchResults {
  
  inline def apply[TDoc](
    error: Any,
    isSearchStalled: Boolean,
    results: AllSearchResults[TDoc],
    searching: Boolean,
    searchingForFacetValues: Boolean
  ): ConnectorSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], searchingForFacetValues = searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorSearchResults[TDoc]]
  }
  
  extension [Self <: ConnectorSearchResults[?], TDoc](x: Self & ConnectorSearchResults[TDoc]) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsSearchStalled(value: Boolean): Self = StObject.set(x, "isSearchStalled", value.asInstanceOf[js.Any])
    
    inline def setResults(value: AllSearchResults[TDoc]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setSearching(value: Boolean): Self = StObject.set(x, "searching", value.asInstanceOf[js.Any])
    
    inline def setSearchingForFacetValues(value: Boolean): Self = StObject.set(x, "searchingForFacetValues", value.asInstanceOf[js.Any])
  }
}
