package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeNode extends StObject {
  
  var node: TreeItem = js.native
}
object TreeNode {
  
  @scala.inline
  def apply(node: TreeItem): TreeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
  
  @scala.inline
  implicit class TreeNodeMutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: TreeItem): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
