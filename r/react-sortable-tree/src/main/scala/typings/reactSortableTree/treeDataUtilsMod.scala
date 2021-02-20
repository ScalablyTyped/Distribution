package typings.reactSortableTree

import typings.reactSortableTree.anon.FlatData
import typings.reactSortableTree.anon.FullTreeTreeIndexTreePath
import typings.reactSortableTree.anon.FullTreeTreePathgetNodeKe
import typings.reactSortableTree.anon.FullTreeTreePathnewNodeFu
import typings.reactSortableTree.anon.FullTreedepthnumbernewNod
import typings.reactSortableTree.anon.FullTreeexpandedbooleanun
import typings.reactSortableTree.anon.FullTreegetNodeKeyGetNode
import typings.reactSortableTree.anon.FullTreegetNodeKeyGetNodeExpandAllMatchPaths
import typings.reactSortableTree.anon.FullTreeindexnumbergetNod
import typings.reactSortableTree.anon.FullTreenewNodeTreeItempa
import typings.reactSortableTree.anon.TreeNodeTreePathlowerSibl
import typings.reactSortableTree.anon.TreeNodeignoreCollapsedbo
import typings.reactSortableTree.anon.matchesArrayNodeDataFullT
import typings.reactSortableTree.mod.FlatDataItem
import typings.reactSortableTree.mod.FullTree
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeDataUtilsMod {
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "addNodeUnderParent")
  @js.native
  def addNodeUnderParent(data: FullTreenewNodeTreeItempa): FullTree with TreeIndex = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "changeNodeAtPath")
  @js.native
  def changeNodeAtPath(data: FullTreeTreePathnewNodeFu): js.Array[TreeItem] = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "find")
  @js.native
  def find(data: FullTreegetNodeKeyGetNodeExpandAllMatchPaths): matchesArrayNodeDataFullT = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getDepth")
  @js.native
  def getDepth(node: TreeItem): Double = js.native
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getDepth")
  @js.native
  def getDepth(node: TreeItem, depth: Double): Double = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getDescendantCount")
  @js.native
  def getDescendantCount(data: TreeNodeignoreCollapsedbo): Double = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getFlatDataFromTree")
  @js.native
  def getFlatDataFromTree(data: FullTreegetNodeKeyGetNode): js.Array[FlatDataItem] = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getNodeAtPath")
  @js.native
  def getNodeAtPath(data: FullTreeTreePathgetNodeKe): (TreeNode with TreeIndex) | Null = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getTreeFromFlatData")
  @js.native
  def getTreeFromFlatData[T, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */, I /* <: String | Double */](data: FlatData[T, I, K, P]): js.Array[TreeItem] = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getVisibleNodeCount")
  @js.native
  def getVisibleNodeCount(data: FullTree): Double = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "getVisibleNodeInfoAtIndex")
  @js.native
  def getVisibleNodeInfoAtIndex(data: FullTreeindexnumbergetNod): TreeNodeTreePathlowerSibl | Null = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "insertNode")
  @js.native
  def insertNode(data: FullTreedepthnumbernewNod): FullTreeTreeIndexTreePath = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "isDescendant")
  @js.native
  def isDescendant(older: TreeItem, younger: TreeItem): Boolean = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "map")
  @js.native
  def map(data: WalkAndMapFunctionParameters): js.Array[TreeItem] = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "removeNode")
  @js.native
  def removeNode(data: FullTreeTreePathgetNodeKe): (FullTree with TreeNode with TreeIndex) | Null = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "removeNodeAtPath")
  @js.native
  def removeNodeAtPath(data: FullTreeTreePathgetNodeKe): js.Array[TreeItem] = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "toggleExpandedForAll")
  @js.native
  def toggleExpandedForAll(data: FullTreeexpandedbooleanun): js.Array[TreeItem] = js.native
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", "walk")
  @js.native
  def walk(data: WalkAndMapFunctionParameters): Unit = js.native
  
  type GetNodeKeyFunction = js.Function1[/* data */ TreeIndex with TreeNode, String | Double]
  
  /* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   callback :std.Function,   ignoreCollapsed :boolean | undefined} */
  @js.native
  trait WalkAndMapFunctionParameters extends StObject {
    
    var callback: js.Function = js.native
    
    var getNodeKey: GetNodeKeyFunction = js.native
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.native
    
    var treeData: js.Array[TreeItem] = js.native
  }
  object WalkAndMapFunctionParameters {
    
    @scala.inline
    def apply(
      callback: js.Function,
      getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
      treeData: js.Array[TreeItem]
    ): WalkAndMapFunctionParameters = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkAndMapFunctionParameters]
    }
    
    @scala.inline
    implicit class WalkAndMapFunctionParametersMutableBuilder[Self <: WalkAndMapFunctionParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
    }
  }
}
