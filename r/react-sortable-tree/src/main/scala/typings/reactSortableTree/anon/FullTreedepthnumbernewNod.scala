package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  depth :number,   newNode :react-sortable-tree.react-sortable-tree.TreeItem,   minimumTreeIndex :number,   ignoreCollapsed :boolean | undefined,   expandParent :boolean | undefined,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
@js.native
trait FullTreedepthnumbernewNod extends StObject {
  
  var depth: Double = js.native
  
  var expandParent: js.UndefOr[Boolean] = js.native
  
  var getNodeKey: GetNodeKeyFunction = js.native
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  
  var minimumTreeIndex: Double = js.native
  
  var newNode: TreeItem = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object FullTreedepthnumbernewNod {
  
  @scala.inline
  def apply(
    depth: Double,
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    minimumTreeIndex: Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem]
  ): FullTreedepthnumbernewNod = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreedepthnumbernewNod]
  }
  
  @scala.inline
  implicit class FullTreedepthnumbernewNodMutableBuilder[Self <: FullTreedepthnumbernewNod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex with TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    @scala.inline
    def setMinimumTreeIndex(value: Double): Self = StObject.set(x, "minimumTreeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNode(value: TreeItem): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
