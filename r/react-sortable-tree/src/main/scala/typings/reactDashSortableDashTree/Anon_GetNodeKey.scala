package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetNodeKey extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var index: Double
}

object Anon_GetNodeKey {
  @scala.inline
  def apply(getNodeKey: /* data */ TreeIndex with TreeNode => String | Double, index: Double): Anon_GetNodeKey = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GetNodeKey]
  }
}

