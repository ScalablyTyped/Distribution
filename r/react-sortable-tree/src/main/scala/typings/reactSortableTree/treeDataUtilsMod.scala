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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeDataUtilsMod {
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addNodeUnderParent(data: FullTreenewNodeTreeItempa): FullTree & TreeIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("addNodeUnderParent")(data.asInstanceOf[js.Any]).asInstanceOf[FullTree & TreeIndex]
  
  inline def changeNodeAtPath(data: FullTreeTreePathnewNodeFu): js.Array[TreeItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem]]
  
  inline def find(data: FullTreegetNodeKeyGetNodeExpandAllMatchPaths): matchesArrayNodeDataFullT = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(data.asInstanceOf[js.Any]).asInstanceOf[matchesArrayNodeDataFullT]
  
  inline def getDepth(node: TreeItem): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDepth(node: TreeItem, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDescendantCount(data: TreeNodeignoreCollapsedbo): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescendantCount")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFlatDataFromTree(data: FullTreegetNodeKeyGetNode): js.Array[FlatDataItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatDataFromTree")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatDataItem]]
  
  inline def getNodeAtPath(data: FullTreeTreePathgetNodeKe): (TreeNode & TreeIndex) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[(TreeNode & TreeIndex) | Null]
  
  inline def getTreeFromFlatData[T, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */, I /* <: String | Double */](data: FlatData[T, I, K, P]): js.Array[TreeItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeFromFlatData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem]]
  
  inline def getVisibleNodeCount(data: FullTree): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeCount")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getVisibleNodeInfoAtIndex(data: FullTreeindexnumbergetNod): TreeNodeTreePathlowerSibl | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeInfoAtIndex")(data.asInstanceOf[js.Any]).asInstanceOf[TreeNodeTreePathlowerSibl | Null]
  
  inline def insertNode(data: FullTreedepthnumbernewNod): FullTreeTreeIndexTreePath = ^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(data.asInstanceOf[js.Any]).asInstanceOf[FullTreeTreeIndexTreePath]
  
  inline def isDescendant(older: TreeItem, younger: TreeItem): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDescendant")(older.asInstanceOf[js.Any], younger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def map(data: WalkAndMapFunctionParameters): js.Array[TreeItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem]]
  
  inline def removeNode(data: FullTreeTreePathgetNodeKe): (FullTree & TreeNode & TreeIndex) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(data.asInstanceOf[js.Any]).asInstanceOf[(FullTree & TreeNode & TreeIndex) | Null]
  
  inline def removeNodeAtPath(data: FullTreeTreePathgetNodeKe): js.Array[TreeItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem]]
  
  inline def toggleExpandedForAll(data: FullTreeexpandedbooleanun): js.Array[TreeItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleExpandedForAll")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem]]
  
  inline def walk(data: WalkAndMapFunctionParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type GetNodeKeyFunction = js.Function1[/* data */ TreeIndex & TreeNode, String | Double]
  
  trait WalkAndMapFunctionParameters
    extends StObject
       with FullTree {
    
    var callback: js.Function
    
    var getNodeKey: GetNodeKeyFunction
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object WalkAndMapFunctionParameters {
    
    inline def apply(
      callback: js.Function,
      getNodeKey: /* data */ TreeIndex & TreeNode => String | Double,
      treeData: js.Array[TreeItem]
    ): WalkAndMapFunctionParameters = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkAndMapFunctionParameters]
    }
    
    extension [Self <: WalkAndMapFunctionParameters](x: Self) {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    }
  }
}
