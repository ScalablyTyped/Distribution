package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.BasicDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var node: TreeDataType
  
  var pos: String
}
object Node {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](node: TreeDataType, pos: String): Node[TreeDataType] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[TreeDataType]]
  }
  
  extension [Self <: Node[?], TreeDataType /* <: BasicDataNode */](x: Self & Node[TreeDataType]) {
    
    inline def setNode(value: TreeDataType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
