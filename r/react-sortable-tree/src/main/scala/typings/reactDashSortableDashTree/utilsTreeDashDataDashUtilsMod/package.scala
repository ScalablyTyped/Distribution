package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.Anon_Callback
import typings.reactDashSortableDashTree.Anon_LowerSiblingsCounts
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.FullTree
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsTreeDashDataDashUtilsMod {
  type FlattenedData = js.Array[TreeNode with TreePath with Anon_LowerSiblingsCounts]
  type GetNodeKeyFunction = js.Function1[/* data */ TreeIndex with TreeNode, String | Double]
  type WalkAndMapFunctionParameters = FullTree with Anon_Callback
}
