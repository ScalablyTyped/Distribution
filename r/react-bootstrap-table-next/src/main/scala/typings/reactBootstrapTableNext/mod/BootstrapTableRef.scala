package typings.reactBootstrapTableNext.mod

import typings.reactBootstrapTableNext.anon.CurrFilters
import typings.reactBootstrapTableNext.anon.CurrPage
import typings.reactBootstrapTableNext.anon.Props
import typings.reactBootstrapTableNext.anon.Selected
import typings.reactBootstrapTableNext.anon.StartEditing
import typings.reactBootstrapTableNext.anon.State
import typings.reactBootstrapTableNext.anon.StateSortColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTableRef[T /* <: js.Object */] extends js.Object {
  
  var cellEditContext: js.UndefOr[StartEditing] = js.native
  
  var filterContext: js.UndefOr[CurrFilters] = js.native
  
  var paginationContext: js.UndefOr[CurrPage] = js.native
  
  var rowExpandContext: js.UndefOr[State] = js.native
  
  var selectionContext: js.UndefOr[Selected] = js.native
  
  var sortContext: js.UndefOr[StateSortColumn[T]] = js.native
  
  var table: Props[T] = js.native
}
object BootstrapTableRef {
  
  @scala.inline
  def apply[T /* <: js.Object */](table: Props[T]): BootstrapTableRef[T] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapTableRef[T]]
  }
  
  @scala.inline
  implicit class BootstrapTableRefOps[Self <: BootstrapTableRef[_], T /* <: js.Object */] (val x: Self with BootstrapTableRef[T]) extends AnyVal {
    
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
    def setTable(value: Props[T]): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellEditContext(value: StartEditing): Self = this.set("cellEditContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellEditContext: Self = this.set("cellEditContext", js.undefined)
    
    @scala.inline
    def setFilterContext(value: CurrFilters): Self = this.set("filterContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterContext: Self = this.set("filterContext", js.undefined)
    
    @scala.inline
    def setPaginationContext(value: CurrPage): Self = this.set("paginationContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaginationContext: Self = this.set("paginationContext", js.undefined)
    
    @scala.inline
    def setRowExpandContext(value: State): Self = this.set("rowExpandContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowExpandContext: Self = this.set("rowExpandContext", js.undefined)
    
    @scala.inline
    def setSelectionContext(value: Selected): Self = this.set("selectionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionContext: Self = this.set("selectionContext", js.undefined)
    
    @scala.inline
    def setSortContext(value: StateSortColumn[T]): Self = this.set("sortContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortContext: Self = this.set("sortContext", js.undefined)
  }
}
