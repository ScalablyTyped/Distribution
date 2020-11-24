package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  defaultCanSort :boolean,   disableSortBy :boolean,   sortDescFirst :boolean,   sortInverted :boolean,   sortType :react-table.react-table.SortByFn<D> | react-table.react-table.DefaultSortTypes | string}> */
@js.native
trait UseSortByColumnOptions[D /* <: js.Object */] extends js.Object {
  
  var defaultCanSort: js.UndefOr[Boolean] = js.native
  
  var disableSortBy: js.UndefOr[Boolean] = js.native
  
  var sortDescFirst: js.UndefOr[Boolean] = js.native
  
  var sortInverted: js.UndefOr[Boolean] = js.native
  
  var sortType: js.UndefOr[SortByFn[D] | DefaultSortTypes | String] = js.native
}
object UseSortByColumnOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseSortByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSortByColumnOptions[D]]
  }
  
  @scala.inline
  implicit class UseSortByColumnOptionsOps[Self <: UseSortByColumnOptions[_], D /* <: js.Object */] (val x: Self with UseSortByColumnOptions[D]) extends AnyVal {
    
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
    def setDefaultCanSort(value: Boolean): Self = this.set("defaultCanSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCanSort: Self = this.set("defaultCanSort", js.undefined)
    
    @scala.inline
    def setDisableSortBy(value: Boolean): Self = this.set("disableSortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSortBy: Self = this.set("disableSortBy", js.undefined)
    
    @scala.inline
    def setSortDescFirst(value: Boolean): Self = this.set("sortDescFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDescFirst: Self = this.set("sortDescFirst", js.undefined)
    
    @scala.inline
    def setSortInverted(value: Boolean): Self = this.set("sortInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortInverted: Self = this.set("sortInverted", js.undefined)
    
    @scala.inline
    def setSortTypeFunction4(
      value: (/* rowA */ Row[D], /* rowB */ Row[D], /* columnId */ IdType[D], /* desc */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("sortType", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSortType(value: SortByFn[D] | DefaultSortTypes | String): Self = this.set("sortType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortType: Self = this.set("sortType", js.undefined)
  }
}
