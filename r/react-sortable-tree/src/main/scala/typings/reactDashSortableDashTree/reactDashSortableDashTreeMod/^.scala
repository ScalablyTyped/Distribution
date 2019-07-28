package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.react.reactMod.ComponentType
import typings.reactDashSortableDashTree.Anon_AddAsFirstChild
import typings.reactDashSortableDashTree.Anon_Data
import typings.reactDashSortableDashTree.Anon_Depth
import typings.reactDashSortableDashTree.Anon_Expanded
import typings.reactDashSortableDashTree.Anon_FlatData
import typings.reactDashSortableDashTree.Anon_GetNodeKey
import typings.reactDashSortableDashTree.Anon_GetNodeKeyIgnoreCollapsed
import typings.reactDashSortableDashTree.Anon_GetNodeKeyIgnoreCollapsedBoolean
import typings.reactDashSortableDashTree.Anon_IgnoreCollapsed
import typings.reactDashSortableDashTree.Anon_LowerSiblingsCounts
import typings.reactDashSortableDashTree.Anon_Matches
import typings.reactDashSortableDashTree.Anon_ParentNode
import typings.reactDashSortableDashTree.utilsTreeDashDataDashUtilsMod.WalkAndMapFunctionParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SortableTreeWithoutDndContext: ComponentType[ReactSortableTreeProps] = js.native
  val default: ComponentType[ReactSortableTreeProps] = js.native
  def addNodeUnderParent(data: FullTree with Anon_AddAsFirstChild): FullTree with TreeIndex = js.native
  def changeNodeAtPath(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsed): js.Array[TreeItem] = js.native
  def defaultGetNodeKey(data: TreeIndex): Double = js.native
  def defaultSearchMethod(data: SearchData): Boolean = js.native
  def find(data: FullTree with Anon_Data): Anon_Matches with FullTree = js.native
  def getDepth(node: TreeItem): Double = js.native
  def getDepth(node: TreeItem, depth: Double): Double = js.native
  def getDescendantCount(data: TreeNode with Anon_IgnoreCollapsed): Double = js.native
  def getFlatDataFromTree(data: FullTree with Anon_GetNodeKeyIgnoreCollapsedBoolean): js.Array[FlatDataItem] = js.native
  def getNodeAtPath(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsedBoolean): (TreeNode with TreeIndex) | Null = js.native
  def getTreeFromFlatData(data: Anon_FlatData): js.Array[TreeItem] = js.native
  def getVisibleNodeCount(data: FullTree): Double = js.native
  def getVisibleNodeInfoAtIndex(data: FullTree with Anon_GetNodeKey): (TreeNode with TreePath with Anon_LowerSiblingsCounts) | Null = js.native
  def insertNode(data: FullTree with Anon_Depth): FullTree with TreeIndex with TreePath with Anon_ParentNode = js.native
  def isDescendant(older: TreeItem, younger: TreeItem): Boolean = js.native
  def map(data: WalkAndMapFunctionParameters): js.Array[TreeItem] = js.native
  def removeNode(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsedBoolean): (FullTree with TreeNode with TreeIndex) | Null = js.native
  def removeNodeAtPath(data: FullTree with TreePath with Anon_GetNodeKeyIgnoreCollapsedBoolean): js.Array[TreeItem] = js.native
  def toggleExpandedForAll(data: FullTree with Anon_Expanded): js.Array[TreeItem] = js.native
  def walk(data: WalkAndMapFunctionParameters): Unit = js.native
}

