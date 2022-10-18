package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.EventDataNode
import typings.rcTree.rcTreeStrings.load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNode[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var event: load
  
  var node: EventDataNode[TreeDataType]
}
object EventNode {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](node: EventDataNode[TreeDataType]): EventNode[TreeDataType] = {
    val __obj = js.Dynamic.literal(event = "load", node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNode[TreeDataType]]
  }
  
  extension [Self <: EventNode[?], TreeDataType /* <: BasicDataNode */](x: Self & EventNode[TreeDataType]) {
    
    inline def setEvent(value: load): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
