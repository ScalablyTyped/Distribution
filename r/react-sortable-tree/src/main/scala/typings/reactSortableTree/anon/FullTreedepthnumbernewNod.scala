package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  depth :number,   newNode :react-sortable-tree.react-sortable-tree.TreeItem,   minimumTreeIndex :number,   ignoreCollapsed :boolean | undefined,   expandParent :boolean | undefined,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
trait FullTreedepthnumbernewNod extends StObject {
  
  var depth: Double
  
  var expandParent: js.UndefOr[Boolean] = js.undefined
  
  var getNodeKey: GetNodeKeyFunction
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var minimumTreeIndex: Double
  
  var newNode: TreeItem
  
  var treeData: js.Array[TreeItem]
}
object FullTreedepthnumbernewNod {
  
  inline def apply(
    depth: Double,
    getNodeKey: /* data */ TreeIndex & TreeNode => String | Double,
    minimumTreeIndex: Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem]
  ): FullTreedepthnumbernewNod = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreedepthnumbernewNod]
  }
  
  extension [Self <: FullTreedepthnumbernewNod](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    inline def setMinimumTreeIndex(value: Double): Self = StObject.set(x, "minimumTreeIndex", value.asInstanceOf[js.Any])
    
    inline def setNewNode(value: TreeItem): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    inline def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
