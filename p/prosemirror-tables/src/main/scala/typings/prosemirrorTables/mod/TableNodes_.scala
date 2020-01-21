package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.NodeSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNodes_ extends js.Object {
  var table: NodeSpec
  var table_cell: NodeSpec
  var table_header: NodeSpec
  var table_row: NodeSpec
}

object TableNodes_ {
  @scala.inline
  def apply(table: NodeSpec, table_cell: NodeSpec, table_header: NodeSpec, table_row: NodeSpec): TableNodes_ = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], table_cell = table_cell.asInstanceOf[js.Any], table_header = table_header.asInstanceOf[js.Any], table_row = table_row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableNodes_]
  }
}

