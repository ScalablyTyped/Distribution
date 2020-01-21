package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCellTypeOptions extends js.Object {
  var col: Double
  var node: Node[_]
  var row: Double
}

object GetCellTypeOptions {
  @scala.inline
  def apply(col: Double, node: Node[_], row: Double): GetCellTypeOptions = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCellTypeOptions]
  }
}

