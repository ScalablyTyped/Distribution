package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRect extends Rect {
  var map: TableMap = js.native
  var table: Node[_] = js.native
  var tableStart: Double = js.native
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
  @scala.inline
  implicit class TableRectOps[Self <: TableRect] (val x: Self) extends AnyVal {
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
    def setMap(value: TableMap): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: Node[_]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableStart(value: Double): Self = this.set("tableStart", value.asInstanceOf[js.Any])
  }
  
}

