package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectorSearchResults[TDoc] extends js.Object {
  
  var error: js.Any = js.native
  
  var isSearchStalled: Boolean = js.native
  
  var results: AllSearchResults[TDoc] = js.native
  
  var searching: Boolean = js.native
  
  var searchingForFacetValues: Boolean = js.native
}
object ConnectorSearchResults {
  
  @scala.inline
  def apply[TDoc](
    error: js.Any,
    isSearchStalled: Boolean,
    results: AllSearchResults[TDoc],
    searching: Boolean,
    searchingForFacetValues: Boolean
  ): ConnectorSearchResults[TDoc] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isSearchStalled = isSearchStalled.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searching = searching.asInstanceOf[js.Any], searchingForFacetValues = searchingForFacetValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorSearchResults[TDoc]]
  }
  
  @scala.inline
  implicit class ConnectorSearchResultsOps[Self <: ConnectorSearchResults[_], TDoc] (val x: Self with ConnectorSearchResults[TDoc]) extends AnyVal {
    
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSearchStalled(value: Boolean): Self = this.set("isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResults(value: AllSearchResults[TDoc]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearching(value: Boolean): Self = this.set("searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchingForFacetValues(value: Boolean): Self = this.set("searchingForFacetValues", value.asInstanceOf[js.Any])
  }
}
