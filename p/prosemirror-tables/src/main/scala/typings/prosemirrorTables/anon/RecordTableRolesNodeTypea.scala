package typings.prosemirrorTables.anon

import typings.prosemirrorModel.mod.NodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<prosemirror-tables.prosemirror-tables.TableRoles, prosemirror-model.prosemirror-model.NodeType<any>> */
trait RecordTableRolesNodeTypea extends js.Object {
  var cell: NodeType[_]
  var header_cell: NodeType[_]
  var row: NodeType[_]
  var table: NodeType[_]
}

object RecordTableRolesNodeTypea {
  @scala.inline
  def apply(cell: NodeType[_], header_cell: NodeType[_], row: NodeType[_], table: NodeType[_]): RecordTableRolesNodeTypea = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], header_cell = header_cell.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTableRolesNodeTypea]
  }
}

