package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullTree extends js.Object {
  var treeData: js.Array[TreeItem]
}

object FullTree {
  @scala.inline
  def apply(treeData: js.Array[TreeItem]): FullTree = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FullTree]
  }
}

