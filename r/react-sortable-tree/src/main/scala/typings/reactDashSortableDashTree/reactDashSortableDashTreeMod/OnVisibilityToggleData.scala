package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnVisibilityToggleData
  extends FullTree
     with TreeNode {
  var expanded: Boolean
}

object OnVisibilityToggleData {
  @scala.inline
  def apply(expanded: Boolean, node: TreeItem, treeData: js.Array[TreeItem]): OnVisibilityToggleData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnVisibilityToggleData]
  }
}

