package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SortableTreeWithoutDndContext: reactLib.reactMod.ComponentType[ReactSortableTreeProps] = js.native
  val default: reactLib.reactMod.ComponentType[ReactSortableTreeProps] = js.native
  def addNodeUnderParent(data: FullTree with reactDashSortableDashTreeLib.Anon_AddAsFirstChild): FullTree with TreeIndex = js.native
  def changeNodeAtPath(data: FullTree with TreePath with reactDashSortableDashTreeLib.Anon_GetNodeKeyIgnoreCollapsed): js.Array[TreeItem] = js.native
  def defaultGetNodeKey(data: TreeIndex): scala.Double = js.native
  def defaultSearchMethod(data: SearchData): scala.Boolean = js.native
  def find(data: FullTree with reactDashSortableDashTreeLib.Anon_Data): reactDashSortableDashTreeLib.Anon_Matches with FullTree = js.native
  def getDepth(node: TreeItem): scala.Double = js.native
  def getDepth(node: TreeItem, depth: scala.Double): scala.Double = js.native
  def getDescendantCount(data: TreeNode with reactDashSortableDashTreeLib.Anon_IgnoreCollapsed): scala.Double = js.native
  def getFlatDataFromTree(data: FullTree with reactDashSortableDashTreeLib.Anon_GetNodeKeyIgnoreCollapsedBoolean): js.Array[FlatDataItem] = js.native
  def getNodeAtPath(
    data: FullTree with TreePath with reactDashSortableDashTreeLib.Anon_GetNodeKeyIgnoreCollapsedBoolean
  ): (TreeNode with TreeIndex) | scala.Null = js.native
  def getTreeFromFlatData(data: reactDashSortableDashTreeLib.Anon_FlatData): js.Array[TreeItem] = js.native
  def getVisibleNodeCount(data: FullTree): scala.Double = js.native
  def getVisibleNodeInfoAtIndex(data: FullTree with reactDashSortableDashTreeLib.Anon_GetNodeKey): TreeNode with TreePath with (reactDashSortableDashTreeLib.Anon_LowerSiblingsCounts | scala.Null) = js.native
  def insertNode(data: FullTree with reactDashSortableDashTreeLib.Anon_Depth): FullTree with TreeIndex with TreePath with reactDashSortableDashTreeLib.Anon_ParentNode = js.native
  def isDescendant(older: TreeItem, younger: TreeItem): scala.Boolean = js.native
  def map(data: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.WalkAndMapFunctionParameters): js.Array[TreeItem] = js.native
  def removeNode(
    data: FullTree with TreePath with reactDashSortableDashTreeLib.Anon_GetNodeKeyIgnoreCollapsedBoolean
  ): (FullTree with TreeNode with TreeIndex) | scala.Null = js.native
  def removeNodeAtPath(
    data: FullTree with TreePath with reactDashSortableDashTreeLib.Anon_GetNodeKeyIgnoreCollapsedBoolean
  ): js.Array[TreeItem] = js.native
  def toggleExpandedForAll(data: FullTree with reactDashSortableDashTreeLib.Anon_Expanded): js.Array[TreeItem] = js.native
  def walk(data: reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod.WalkAndMapFunctionParameters): scala.Unit = js.native
}

