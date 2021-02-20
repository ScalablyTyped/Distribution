package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsTreeNode extends StObject {
  
  var isTreeNode: Boolean = js.native
}
object IsTreeNode {
  
  @scala.inline
  def apply(isTreeNode: Boolean): IsTreeNode = {
    val __obj = js.Dynamic.literal(isTreeNode = isTreeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTreeNode]
  }
  
  @scala.inline
  implicit class IsTreeNodeMutableBuilder[Self <: IsTreeNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTreeNode(value: Boolean): Self = StObject.set(x, "isTreeNode", value.asInstanceOf[js.Any])
  }
}
