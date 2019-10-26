package typings.reactDashSortableDashTree

import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.FlatDataItem
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.FullTree
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeIndex
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeItem
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreeNode
import typings.reactDashSortableDashTree.reactDashSortableDashTreeMod.TreePath
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.WalkAndMapFunctionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree/utils/tree-data-utils", JSImport.Namespace)
@js.native
object utilsTreeDashDataDashUtilsMod extends js.Object {
  def addNodeUnderParent(data: FullTree with Anon_AddAsFirstChild): FullTree with TreeIndex = js.native
  def changeNodeAtPath(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsed): js.Array[TreeItem] = js.native
  def find(data: FullTree with Anon_Data): Anon_Matches with FullTree = js.native
  def getDepth(node: TreeItem): Double = js.native
  def getDepth(node: TreeItem, depth: Double): Double = js.native
  def getDescendantCount(data: TreeNode with Anon_IgnoreCollapsed): Double = js.native
  def getFlatDataFromTree(data: FullTree with Anon_GetNodeKeyIgnoreCollapsedBoolean): js.Array[FlatDataItem] = js.native
  def getNodeAtPath(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsedBoolean): (TreeNode with TreeIndex) | Null = js.native
  def getTreeFromFlatData[T, K /* <: String */, P /* <: String */, I /* <: String | Double */](data: Anon_FlatData[T, I, K, P]): js.Array[TreeItem] = js.native
  def getVisibleNodeCount(data: FullTree): Double = js.native
  def getVisibleNodeInfoAtIndex(data: FullTree with Anon_GetNodeKey): (TreeNode with TreePath with Anon_LowerSiblingsCounts) | Null = js.native
  def insertNode(data: FullTree with Anon_Depth): FullTree with TreeIndex with TreePath with Anon_ParentNode = js.native
  def isDescendant(older: TreeItem, younger: TreeItem): Boolean = js.native
  def map(data: WalkAndMapFunctionParameters): js.Array[TreeItem] = js.native
  def removeNode(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsedBoolean): (FullTree with TreeNode with TreeIndex) | Null = js.native
  def removeNodeAtPath(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsedBoolean): js.Array[TreeItem] = js.native
  def toggleExpandedForAll(data: FullTree with Anon_Expanded): js.Array[TreeItem] = js.native
  def walk(data: WalkAndMapFunctionParameters): Unit = js.native
  type GetNodeKeyFunction = js.Function1[/* data */ TreeIndex with TreeNode, String | Double]
  type WalkAndMapFunctionParameters = FullTree with Anon_Callback
}

