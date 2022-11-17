package typings.rcTree.anon

import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.EventDataNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var event: "select"
  
  var nativeEvent: MouseEvent
  
  var node: EventDataNode[TreeDataType]
  
  var selected: Boolean
  
  var selectedNodes: js.Array[TreeDataType]
}
object Event {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](
    nativeEvent: MouseEvent,
    node: EventDataNode[TreeDataType],
    selected: Boolean,
    selectedNodes: js.Array[TreeDataType]
  ): Event[TreeDataType] = {
    val __obj = js.Dynamic.literal(event = "select", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TreeDataType]]
  }
  
  extension [Self <: Event[?], TreeDataType /* <: BasicDataNode */](x: Self & Event[TreeDataType]) {
    
    inline def setEvent(value: "select"): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedNodes(value: js.Array[TreeDataType]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
    
    inline def setSelectedNodesVarargs(value: TreeDataType*): Self = StObject.set(x, "selectedNodes", js.Array(value*))
  }
}
