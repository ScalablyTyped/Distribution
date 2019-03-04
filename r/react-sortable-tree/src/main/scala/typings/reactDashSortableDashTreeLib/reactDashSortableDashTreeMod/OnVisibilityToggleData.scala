package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnVisibilityToggleData
  extends FullTree
     with TreeNode {
  var expanded: scala.Boolean
}

object OnVisibilityToggleData {
  @scala.inline
  def apply(expanded: scala.Boolean, node: TreeItem, treeData: js.Array[TreeItem]): OnVisibilityToggleData = {
    val __obj = js.Dynamic.literal(expanded = expanded, node = node, treeData = treeData)
  
    __obj.asInstanceOf[OnVisibilityToggleData]
  }
}

