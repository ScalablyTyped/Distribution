package typings.reactMdTable.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableConfiguration
  extends TableRowConfiguration
     with TableCellConfiguration {
  
  /**
    * Boolean if the table should use the dense spec to reduce the height of each
    * cell.
    */
  var dense: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the `<table>` element should span the entire width of the
    * container `<div>` element instead of having its width be determined by the
    * table's contents.
    *
    * Note: There will always be horizontal overflow if the table is too wide.
    */
  var fullWidth: js.UndefOr[Boolean] = js.native
}
object TableConfiguration {
  
  @scala.inline
  def apply(): TableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConfiguration]
  }
  
  @scala.inline
  implicit class TableConfigurationOps[Self <: TableConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
  }
}
