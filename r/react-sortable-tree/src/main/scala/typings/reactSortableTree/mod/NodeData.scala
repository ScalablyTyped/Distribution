package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeData
  extends TreeNode
     with TreePath
     with TreeIndex
object NodeData {
  
  @scala.inline
  def apply(node: TreeItem, path: NumberOrStringArray, treeIndex: Double): NodeData = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeData]
  }
}
