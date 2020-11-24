package typings.reactLazylog.searchBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBarProps extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var filterActive: js.UndefOr[Boolean] = js.native
  
  var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.native
  
  var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.native
  
  var resultsCount: js.UndefOr[Double] = js.native
}
object SearchBarProps {
  
  @scala.inline
  def apply(): SearchBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarProps]
  }
  
  @scala.inline
  implicit class SearchBarPropsOps[Self <: SearchBarProps] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFilterActive(value: Boolean): Self = this.set("filterActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterActive: Self = this.set("filterActive", js.undefined)
    
    @scala.inline
    def setOnClearSearch(value: () => Unit): Self = this.set("onClearSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClearSearch: Self = this.set("onClearSearch", js.undefined)
    
    @scala.inline
    def setOnFilterLinesWithMatches(value: /* isFiltered */ Boolean => Unit): Self = this.set("onFilterLinesWithMatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilterLinesWithMatches: Self = this.set("onFilterLinesWithMatches", js.undefined)
    
    @scala.inline
    def setOnSearch(value: /* keyword */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    
    @scala.inline
    def setResultsCount(value: Double): Self = this.set("resultsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsCount: Self = this.set("resultsCount", js.undefined)
  }
}
