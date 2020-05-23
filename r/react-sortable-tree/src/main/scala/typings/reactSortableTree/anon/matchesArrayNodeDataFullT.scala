package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NodeData
import typings.reactSortableTree.mod.TreeItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  matches  :std.Array<react-sortable-tree.react-sortable-tree.NodeData>} & react-sortable-tree.react-sortable-tree.FullTree */
trait matchesArrayNodeDataFullT extends js.Object {
  var matches: js.Array[NodeData]
  var treeData: js.Array[TreeItem]
}

object matchesArrayNodeDataFullT {
  @scala.inline
  def apply(matches: js.Array[NodeData], treeData: js.Array[TreeItem]): matchesArrayNodeDataFullT = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[matchesArrayNodeDataFullT]
  }
}

