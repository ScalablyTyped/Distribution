package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeNode extends StObject {
  
  var node: TreeItem
}
object TreeNode {
  
  inline def apply(node: TreeItem): TreeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
  
  extension [Self <: TreeNode](x: Self) {
    
    inline def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
