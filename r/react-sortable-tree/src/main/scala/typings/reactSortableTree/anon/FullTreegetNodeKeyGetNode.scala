package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed :boolean | undefined} */
trait FullTreegetNodeKeyGetNode extends StObject {
  
  var getNodeKey: GetNodeKeyFunction
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var treeData: js.Array[TreeItem]
}
object FullTreegetNodeKeyGetNode {
  
  @scala.inline
  def apply(getNodeKey: /* data */ TreeIndex & TreeNode => String | Double, treeData: js.Array[TreeItem]): FullTreegetNodeKeyGetNode = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNode]
  }
  
  @scala.inline
  implicit class FullTreegetNodeKeyGetNodeMutableBuilder[Self <: FullTreegetNodeKeyGetNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNodeKey(value: /* data */ TreeIndex & TreeNode => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
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
