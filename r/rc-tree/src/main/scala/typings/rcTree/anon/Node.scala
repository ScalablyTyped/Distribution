package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.rcTreeStrings.load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var event: load
  
  var node: EventDataNode
}
object Node {
  
  @scala.inline
  def apply(node: EventDataNode): Node = {
    val __obj = js.Dynamic.literal(event = "load", node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: load): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
