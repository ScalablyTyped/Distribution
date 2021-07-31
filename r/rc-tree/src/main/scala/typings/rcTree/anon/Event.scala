package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.rcTreeStrings.select
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: select
  
  var nativeEvent: MouseEvent
  
  var node: EventDataNode
  
  var selected: Boolean
  
  var selectedNodes: js.Array[DataNode]
}
object Event {
  
  @scala.inline
  def apply(nativeEvent: MouseEvent, node: EventDataNode, selected: Boolean, selectedNodes: js.Array[DataNode]): Event = {
    val __obj = js.Dynamic.literal(event = "select", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: select): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodes(value: js.Array[DataNode]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodesVarargs(value: DataNode*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
  }
}
