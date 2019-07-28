package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNodes extends js.Object {
  var table: NodeSpec
  var table_cell: NodeSpec
  var table_header: NodeSpec
  var table_row: NodeSpec
}

object TableNodes {
  @scala.inline
  def apply(table: NodeSpec, table_cell: NodeSpec, table_header: NodeSpec, table_row: NodeSpec): TableNodes = {
    val __obj = js.Dynamic.literal(table = table, table_cell = table_cell, table_header = table_header, table_row = table_row)
  
    __obj.asInstanceOf[TableNodes]
  }
}

