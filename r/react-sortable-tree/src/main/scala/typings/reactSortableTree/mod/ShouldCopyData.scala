package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShouldCopyData extends js.Object {
  var node: TreeNode
  var prevPath: NumberOrStringArray
  var prevTreeIndex: Double
}

object ShouldCopyData {
  @scala.inline
  def apply(node: TreeNode, prevPath: NumberOrStringArray, prevTreeIndex: Double): ShouldCopyData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldCopyData]
  }
}

