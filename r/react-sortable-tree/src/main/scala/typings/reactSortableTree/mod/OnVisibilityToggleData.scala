package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnVisibilityToggleData
  extends StObject
     with FullTree
     with TreeNode {
  
  var expanded: Boolean
}
object OnVisibilityToggleData {
  
  inline def apply(expanded: Boolean, node: TreeItem, treeData: js.Array[TreeItem]): OnVisibilityToggleData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnVisibilityToggleData]
  }
  
  extension [Self <: OnVisibilityToggleData](x: Self) {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
