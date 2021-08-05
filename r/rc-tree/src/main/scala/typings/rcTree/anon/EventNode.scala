package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNode extends StObject {
  
  var event: MouseEvent[Element, NativeMouseEvent]
  
  var node: EventDataNode
}
object EventNode {
  
  inline def apply(event: MouseEvent[Element, NativeMouseEvent], node: EventDataNode): EventNode = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNode]
  }
  
  extension [Self <: EventNode](x: Self) {
    
    inline def setEvent(value: MouseEvent[Element, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
