package typings.reactSortableTree

import typings.reactSortableTree.mod.FlatDataItem
import typings.reactSortableTree.mod.FullTree
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.mod.TreePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sortable-tree/utils/tree-data-utils", JSImport.Namespace)
@js.native
object treeDataUtilsMod extends js.Object {
  def addNodeUnderParent(data: FullTree with AnonAddAsFirstChild): FullTree with TreeIndex = js.native
  def changeNodeAtPath(data: FullTree with TreePath with AnonGetNodeKeyIgnoreCollapsed): js.Array[TreeItem] = js.native
  def find(data: FullTree with AnonData): AnonMatches with FullTree = js.native
  def getDepth(node: TreeItem): Double = js.native
  def getDepth(node: TreeItem, depth: Double): Double = js.native
  def getDescendantCount(data: TreeNode with AnonIgnoreCollapsed): Double = js.native
  def getFlatDataFromTree(data: FullTree with AnonGetNodeKeyIgnoreCollapsedBoolean): js.Array[FlatDataItem] = js.native
  def getNodeAtPath(data: FullTree with TreePath with AnonGetNodeKeyIgnoreCollapsedBoolean): (TreeNode with TreeIndex) | Null = js.native
  def getTreeFromFlatData[T, K /* <: String */, P /* <: String */, I /* <: String | Double */](data: AnonFlatData[T, I, K, P]): js.Array[TreeItem] = js.native
  def getVisibleNodeCount(data: FullTree): Double = js.native
  def getVisibleNodeInfoAtIndex(data: FullTree with AnonGetNodeKey): (TreeNode with TreePath with AnonLowerSiblingsCounts) | Null = js.native
  def insertNode(data: FullTree with AnonDepth): FullTree with TreeIndex with TreePath with AnonParentNode = js.native
  def isDescendant(older: TreeItem, younger: TreeItem): Boolean = js.native
  def map(data: WalkAndMapFunctionParameters): js.Array[TreeItem] = js.native
  def removeNode(data: FullTree with TreePath with AnonGetNodeKeyIgnoreCollapsedBoolean): (FullTree with TreeNode with TreeIndex) | Null = js.native
  def removeNodeAtPath(data: FullTree with TreePath with AnonGetNodeKeyIgnoreCollapsedBoolean): js.Array[TreeItem] = js.native
  def toggleExpandedForAll(data: FullTree with AnonExpanded): js.Array[TreeItem] = js.native
  def walk(data: WalkAndMapFunctionParameters): Unit = js.native
  type GetNodeKeyFunction = js.Function1[/* data */ TreeIndex with TreeNode, String | Double]
  type WalkAndMapFunctionParameters = FullTree with AnonCallback
}

