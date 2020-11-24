package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantSearchProps extends js.Object {
  
  var createURL: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var indexName: String = js.native
  
  var onSearchParameters: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onSearchStateChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var refresh: js.UndefOr[Boolean] = js.native
  
  var resultsState: js.UndefOr[js.Any] = js.native
  
  var searchClient: js.Any = js.native
  
  var searchState: js.UndefOr[js.Any] = js.native
  
  var stalledSearchDelay: js.UndefOr[Double] = js.native
}
object InstantSearchProps {
  
  @scala.inline
  def apply(indexName: String, searchClient: js.Any): InstantSearchProps = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], searchClient = searchClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantSearchProps]
  }
  
  @scala.inline
  implicit class InstantSearchPropsOps[Self <: InstantSearchProps] (val x: Self) extends AnyVal {
    
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
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchClient(value: js.Any): Self = this.set("searchClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateURL(value: /* repeated */ js.Any => _): Self = this.set("createURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateURL: Self = this.set("createURL", js.undefined)
    
    @scala.inline
    def setOnSearchParameters(value: /* repeated */ js.Any => _): Self = this.set("onSearchParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearchParameters: Self = this.set("onSearchParameters", js.undefined)
    
    @scala.inline
    def setOnSearchStateChange(value: /* repeated */ js.Any => _): Self = this.set("onSearchStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearchStateChange: Self = this.set("onSearchStateChange", js.undefined)
    
    @scala.inline
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setResultsState(value: js.Any): Self = this.set("resultsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsState: Self = this.set("resultsState", js.undefined)
    
    @scala.inline
    def setSearchState(value: js.Any): Self = this.set("searchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchState: Self = this.set("searchState", js.undefined)
    
    @scala.inline
    def setStalledSearchDelay(value: Double): Self = this.set("stalledSearchDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStalledSearchDelay: Self = this.set("stalledSearchDelay", js.undefined)
  }
}
