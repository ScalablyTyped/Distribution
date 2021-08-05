package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/contextTypes.NodeDragEventParams<std.HTMLDivElement> & {  dragNode :rc-tree.rc-tree/es/interface.EventDataNode,   dragNodesKeys :std.Array<rc-tree.rc-tree/es/interface.Key>,   dropPosition :number,   dropToGap :boolean} */
trait NodeDragEventParamsHTMLDiDragNode extends StObject {
  
  var dragNode: EventDataNode
  
  var dragNodesKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var dropPosition: Double
  
  var dropToGap: Boolean
  
  var event: MouseEvent[HTMLDivElement, NativeMouseEvent]
  
  var node: EventDataNode
}
object NodeDragEventParamsHTMLDiDragNode {
  
  inline def apply(
    dragNode: EventDataNode,
    dragNodesKeys: js.Array[typings.rcTree.interfaceMod.Key],
    dropPosition: Double,
    dropToGap: Boolean,
    event: MouseEvent[HTMLDivElement, NativeMouseEvent],
    node: EventDataNode
  ): NodeDragEventParamsHTMLDiDragNode = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropToGap = dropToGap.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDragEventParamsHTMLDiDragNode]
  }
  
  extension [Self <: NodeDragEventParamsHTMLDiDragNode](x: Self) {
    
    inline def setDragNode(value: EventDataNode): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
    
    inline def setDragNodesKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
    
    inline def setDragNodesKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
    
    inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent[HTMLDivElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
