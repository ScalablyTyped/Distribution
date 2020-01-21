package typings.reactSortableTree

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetNodeKey extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var index: Double
}

object AnonGetNodeKey {
  @scala.inline
  def apply(getNodeKey: /* data */ TreeIndex with TreeNode => String | Double, index: Double): AnonGetNodeKey = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGetNodeKey]
  }
}

