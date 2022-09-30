package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAsFirstChild[T] extends StObject {
  
  var addAsFirstChild: js.UndefOr[Boolean] = js.undefined
  
  var expandParent: js.UndefOr[Boolean] = js.undefined
  
  var getNodeKey: GetNodeKeyFunction[T]
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var newNode: TreeItem[T]
  
  var parentKey: js.UndefOr[Double | String] = js.undefined
}
object AddAsFirstChild {
  
  inline def apply[T](getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double, newNode: TreeItem[T]): AddAsFirstChild[T] = {
    val __obj = js.Dynamic.literal(getNodeKey = js.Any.fromFunction1(getNodeKey), newNode = newNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAsFirstChild[T]]
  }
  
  extension [Self <: AddAsFirstChild[?], T](x: Self & AddAsFirstChild[T]) {
    
    inline def setAddAsFirstChild(value: Boolean): Self = StObject.set(x, "addAsFirstChild", value.asInstanceOf[js.Any])
    
    inline def setAddAsFirstChildUndefined: Self = StObject.set(x, "addAsFirstChild", js.undefined)
    
    inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    inline def setNewNode(value: TreeItem[T]): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
    
    inline def setParentKey(value: Double | String): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
    
    inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
  }
}
