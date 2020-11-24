package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.AlgoliaError
import typings.reactInstantsearchCore.mod.AllSearchResults
import typings.reactInstantsearchCore.mod.SearchResults
import typings.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-instantsearch-core.react-instantsearch-core.StateResultsProvided<any>> */
@js.native
trait PartialStateResultsProvid extends js.Object {
  
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
  implicit class PartialStateResultsProvidOps[Self <: PartialStateResultsProvid] (val x: Self) extends AnyVal {
    
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
    def setAllSearchResults(value: AllSearchResults[_]): Self = this.set("allSearchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllSearchResults: Self = this.set("allSearchResults", js.undefined)
    
    @scala.inline
    def setError(value: AlgoliaError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIsSearchStalled(value: js.Any): Self = this.set("isSearchStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSearchStalled: Self = this.set("isSearchStalled", js.undefined)
    
    @scala.inline
    def setSearchResults(value: SearchResults[_]): Self = this.set("searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchResults: Self = this.set("searchResults", js.undefined)
    
    @scala.inline
    def setSearchState(value: SearchState): Self = this.set("searchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchState: Self = this.set("searchState", js.undefined)
    
    @scala.inline
    def setSearching(value: Boolean): Self = this.set("searching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearching: Self = this.set("searching", js.undefined)
    
    @scala.inline
    def setSearchingForFacetValues(value: js.Any): Self = this.set("searchingForFacetValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchingForFacetValues: Self = this.set("searchingForFacetValues", js.undefined)
  }
}
