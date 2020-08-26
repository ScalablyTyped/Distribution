package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.NodeSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableNodes_ extends js.Object {
  var table: NodeSpec = js.native
  var table_cell: NodeSpec = js.native
  var table_header: NodeSpec = js.native
  var table_row: NodeSpec = js.native
}

object TableNodes_ {
  @scala.inline
  def apply(table: NodeSpec, table_cell: NodeSpec, table_header: NodeSpec, table_row: NodeSpec): TableNodes_ = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], table_cell = table_cell.asInstanceOf[js.Any], table_header = table_header.asInstanceOf[js.Any], table_row = table_row.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNodes_]
  }
  @scala.inline
  implicit class TableNodes_Ops[Self <: TableNodes_] (val x: Self) extends AnyVal {
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
    def setTable(value: NodeSpec): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable_cell(value: NodeSpec): Self = this.set("table_cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable_header(value: NodeSpec): Self = this.set("table_header", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable_row(value: NodeSpec): Self = this.set("table_row", value.asInstanceOf[js.Any])
  }
  
}

