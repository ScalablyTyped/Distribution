package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/contextTypes.NodeDragEventParams<std.HTMLDivElement> & {  expandedKeys :std.Array<rc-tree.rc-tree/es/interface.Key>} */
trait NodeDragEventParamsHTMLDi extends StObject {
  
  var event: MouseEvent[HTMLDivElement, NativeMouseEvent]
  
  var expandedKeys: js.Array[typings.rcTree.interfaceMod.Key]
  
  var node: EventDataNode
}
object NodeDragEventParamsHTMLDi {
  
  @scala.inline
  def apply(
    event: MouseEvent[HTMLDivElement, NativeMouseEvent],
    expandedKeys: js.Array[typings.rcTree.interfaceMod.Key],
    node: EventDataNode
  ): NodeDragEventParamsHTMLDi = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDragEventParamsHTMLDi]
  }
  
  @scala.inline
  implicit class NodeDragEventParamsHTMLDiMutableBuilder[Self <: NodeDragEventParamsHTMLDi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: MouseEvent[HTMLDivElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: EventDataNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
