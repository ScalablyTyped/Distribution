package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRect extends Rect {
  var map: TableMap
  var table: Node[_]
  var tableStart: Double
}

object TableRect {
  @scala.inline
  def apply(
    bottom: Double,
    left: Double,
    map: TableMap,
    right: Double,
    table: Node[_],
    tableStart: Double,
    top: Double
  ): TableRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableStart = tableStart.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TableRect]
  }
}

