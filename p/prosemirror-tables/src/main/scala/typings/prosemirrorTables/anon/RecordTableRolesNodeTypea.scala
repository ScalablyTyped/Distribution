package typings.prosemirrorTables.anon

import typings.prosemirrorModel.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<prosemirror-tables.prosemirror-tables.TableRoles, prosemirror-model.prosemirror-model.NodeType<any>> */
@js.native
trait RecordTableRolesNodeTypea extends js.Object {
  var cell: NodeType[_] = js.native
  var header_cell: NodeType[_] = js.native
  var row: NodeType[_] = js.native
  var table: NodeType[_] = js.native
}

object RecordTableRolesNodeTypea {
  @scala.inline
  def apply(cell: NodeType[_], header_cell: NodeType[_], row: NodeType[_], table: NodeType[_]): RecordTableRolesNodeTypea = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], header_cell = header_cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTableRolesNodeTypea]
  }
  @scala.inline
  implicit class RecordTableRolesNodeTypeaOps[Self <: RecordTableRolesNodeTypea] (val x: Self) extends AnyVal {
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
    def setCell(value: NodeType[_]): Self = this.set("cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader_cell(value: NodeType[_]): Self = this.set("header_cell", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: NodeType[_]): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: NodeType[_]): Self = this.set("table", value.asInstanceOf[js.Any])
  }
  
}

