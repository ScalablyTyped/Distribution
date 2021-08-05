package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  newNode :react-sortable-tree.react-sortable-tree.TreeItem,   parentKey :number | string | undefined,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined,   expandParent :boolean | undefined,   addAsFirstChild :boolean | undefined} */
trait FullTreenewNodeTreeItempa extends StObject {
  
  var addAsFirstChild: js.UndefOr[Boolean] = js.undefined
  
  var expandParent: js.UndefOr[Boolean] = js.undefined
  
  var getNodeKey: GetNodeKeyFunction
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var newNode: TreeItem
  
  var parentKey: js.UndefOr[Double | String] = js.undefined
  
  var treeData: js.Array[TreeItem]
}
object FullTreenewNodeTreeItempa {
  
  inline def apply(
    getNodeKey: /* data */ TreeIndex & TreeNode => String | Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem]
  ): FullTreenewNodeTreeItempa = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreenewNodeTreeItempa]
  }
  
  extension [Self <: FullTreenewNodeTreeItempa](x: Self) {
    
    inline def setAddAsFirstChild(value: Boolean): Self = StObject.set(x, "addAsFirstChild", value.asInstanceOf[js.Any])
    
    inline def setAddAsFirstChildUndefined: Self = StObject.set(x, "addAsFirstChild", js.undefined)
    
    inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    inline def setNewNode(value: TreeItem): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    inline def setParentKey(value: Double | String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
    
    inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
    
    inline def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    inline def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
