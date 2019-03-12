package typings
package reactDashSortableDashTreeLib.utilsTreeDashDataDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree/utils/tree-data-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addNodeUnderParent(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_AddAsFirstChild
  ): reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex = js.native
  def changeNodeAtPath(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with reactDashSortableDashTreeLib.Anon_DataGetNodeKey
  ): js.Array[reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem] = js.native
  def find(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_DataExpandAllMatchPaths
  ): reactDashSortableDashTreeLib.Anon_Matches with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree = js.native
  def getDepth(node: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem): scala.Double = js.native
  def getDepth(node: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem, depth: scala.Double): scala.Double = js.native
  def getDescendantCount(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode with reactDashSortableDashTreeLib.Anon_IgnoreCollapsed
  ): scala.Double = js.native
  def getFlatDataFromTree(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_DataGetNodeKeyIgnoreCollapsed
  ): js.Array[reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FlatDataItem] = js.native
  def getNodeAtPath(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with reactDashSortableDashTreeLib.Anon_DataGetNodeKeyIgnoreCollapsed
  ): (reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex) | scala.Null = js.native
  def getTreeFromFlatData(data: reactDashSortableDashTreeLib.Anon_FlatData): js.Array[reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem] = js.native
  def getVisibleNodeCount(data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree): scala.Double = js.native
  def getVisibleNodeInfoAtIndex(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_Data
  ): reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with (reactDashSortableDashTreeLib.Anon_LowerSiblingsCounts | scala.Null) = js.native
  def insertNode(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_DataDepth
  ): reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with reactDashSortableDashTreeLib.Anon_ParentNode = js.native
  def isDescendant(
    older: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem,
    younger: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem
  ): scala.Boolean = js.native
  def map(data: WalkAndMapFunctionParameters): js.Array[reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem] = js.native
  def removeNode(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with reactDashSortableDashTreeLib.Anon_DataGetNodeKeyIgnoreCollapsed
  ): (reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeNode with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeIndex) | scala.Null = js.native
  def removeNodeAtPath(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreePath with reactDashSortableDashTreeLib.Anon_DataGetNodeKeyIgnoreCollapsed
  ): js.Array[reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem] = js.native
  def toggleExpandedForAll(
    data: reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.FullTree with reactDashSortableDashTreeLib.Anon_Expanded
  ): js.Array[reactDashSortableDashTreeLib.reactDashSortableDashTreeMod.TreeItem] = js.native
  def walk(data: WalkAndMapFunctionParameters): scala.Unit = js.native
}

