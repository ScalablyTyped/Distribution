package typings.reactVirtualized.esTableMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeaderProps extends js.Object {
  
  var columnData: js.UndefOr[js.Any] = js.native
  
  var dataKey: String = js.native
  
  var disableSort: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[ReactNode] = js.native
  
  var sortBy: js.UndefOr[String] = js.native
  
  var sortDirection: js.UndefOr[SortDirectionType] = js.native
}
object TableHeaderProps {
  
  @scala.inline
  def apply(dataKey: String): TableHeaderProps = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderProps]
  }
  
  @scala.inline
  implicit class TableHeaderPropsOps[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
    
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
    def setDataKey(value: String): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnData(value: js.Any): Self = this.set("columnData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnData: Self = this.set("columnData", js.undefined)
    
    @scala.inline
    def setDisableSort(value: Boolean): Self = this.set("disableSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSort: Self = this.set("disableSort", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setSortBy(value: String): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDirection: Self = this.set("sortDirection", js.undefined)
  }
}
