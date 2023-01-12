package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnVisibilityToggleData[T]
  extends StObject
     with FullTree[T]
     with TreeNode[T] {
  
  var expanded: Boolean
}
object OnVisibilityToggleData {
  
  inline def apply[T](expanded: Boolean, node: TreeItem[T], treeData: js.Array[TreeItem[T]]): OnVisibilityToggleData[T] = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVisibilityToggleData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnVisibilityToggleData[?], T] (val x: Self & OnVisibilityToggleData[T]) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
