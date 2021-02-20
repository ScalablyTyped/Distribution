package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  newNode :react-sortable-tree.react-sortable-tree.TreeItem,   parentKey :number | string | undefined,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined,   expandParent :boolean | undefined,   addAsFirstChild :boolean | undefined} */
@js.native
trait FullTreenewNodeTreeItempa extends StObject {
  
  var addAsFirstChild: js.UndefOr[Boolean] = js.native
  
  var expandParent: js.UndefOr[Boolean] = js.native
  
  var getNodeKey: GetNodeKeyFunction = js.native
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.native
  
  var newNode: TreeItem = js.native
  
  var parentKey: js.UndefOr[Double | String] = js.native
  
  var treeData: js.Array[TreeItem] = js.native
}
object FullTreenewNodeTreeItempa {
  
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => String | Double,
    newNode: TreeItem,
    treeData: js.Array[TreeItem]
  ): FullTreenewNodeTreeItempa = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreenewNodeTreeItempa]
  }
  
  @scala.inline
  implicit class FullTreenewNodeTreeItempaMutableBuilder[Self <: FullTreenewNodeTreeItempa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAsFirstChild(value: Boolean): Self = StObject.set(x, "addAsFirstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAsFirstChildUndefined: Self = StObject.set(x, "addAsFirstChild", js.undefined)
    
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
    def setNewNode(value: TreeItem): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentKey(value: Double | String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
