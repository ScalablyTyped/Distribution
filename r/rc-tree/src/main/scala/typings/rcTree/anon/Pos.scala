package typings.rcTree.anon

import typings.rcTree.interfaceMod.BasicDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pos[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var node: TreeDataType
  
  var pos: String
}
object Pos {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](node: TreeDataType, pos: String): Pos[TreeDataType] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos[TreeDataType]]
  }
  
  extension [Self <: Pos[?], TreeDataType /* <: BasicDataNode */](x: Self & Pos[TreeDataType]) {
    
    inline def setNode(value: TreeDataType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
