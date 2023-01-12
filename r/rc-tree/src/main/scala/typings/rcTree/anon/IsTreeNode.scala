package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTreeNode extends StObject {
  
  var isTreeNode: Boolean
}
object IsTreeNode {
  
  inline def apply(isTreeNode: Boolean): IsTreeNode = {
    val __obj = js.Dynamic.literal(isTreeNode = isTreeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTreeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsTreeNode] (val x: Self) extends AnyVal {
    
    inline def setIsTreeNode(value: Boolean): Self = StObject.set(x, "isTreeNode", value.asInstanceOf[js.Any])
  }
}
