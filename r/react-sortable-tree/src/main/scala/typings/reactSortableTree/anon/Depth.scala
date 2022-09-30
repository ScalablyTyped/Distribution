package typings.reactSortableTree.anon

import typings.reactSortableTree.mod.TreeIndex
import typings.reactSortableTree.mod.TreeItem
import typings.reactSortableTree.mod.TreeNode
import typings.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Depth[T] extends StObject {
  
  var depth: Double
  
  var expandParent: js.UndefOr[Boolean] = js.undefined
  
  var getNodeKey: GetNodeKeyFunction[T]
  
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  
  var minimumTreeIndex: Double
  
  var newNode: TreeItem[T]
}
object Depth {
  
  inline def apply[T](
    depth: Double,
    getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double,
    minimumTreeIndex: Double,
    newNode: TreeItem[T]
  ): Depth[T] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), minimumTreeIndex = minimumTreeIndex.asInstanceOf[js.Any], newNode = newNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth[T]]
  }
  
  extension [Self <: Depth[?], T](x: Self & Depth[T]) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
    
    inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    
    inline def setMinimumTreeIndex(value: Double): Self = StObject.set(x, "minimumTreeIndex", value.asInstanceOf[js.Any])
    
    inline def setNewNode(value: TreeItem[T]): Self = StObject.set(x, "newNode", value.asInstanceOf[js.Any])
  }
}
