package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNode extends js.Object {
  var node: TreeItem
}

object TreeNode {
  @scala.inline
  def apply(node: TreeItem): TreeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TreeNode]
  }
}

