package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.NumberOrStringArray
import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreePath & {  newNode :std.Function | any,   getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined} */
trait FullTreeTreePathnewNodeFu extends StObject {
  
  var getNodeKey: GetNodeKeyFunction
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var newNode: js.Function | js.Any
  
  var path: NumberOrStringArray
  
  var treeData: js.Array[TreeItem]
}
object FullTreeTreePathnewNodeFu {
  
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex & TreeNode => String | Double,
    newNode: js.Function | js.Any,
    path: NumberOrStringArray,
    treeData: js.Array[TreeItem]
  ): FullTreeTreePathnewNodeFu = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreePathnewNodeFu]
  }
  
  @scala.inline
  implicit class FullTreeTreePathnewNodeFuMutableBuilder[Self <: FullTreeTreePathnewNodeFu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex & TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    @scala.inline
    def setNewNode(value: js.Function | js.Any): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setTreeData(value: js.Array[TreeItem]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeDataVarargs(value: TreeItem*): Self = StObject.set(x, "treeData", js.Array(value :_*))
  }
}
