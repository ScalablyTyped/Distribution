package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/contextTypes.NodeDragEventParams<std.HTMLDivElement> & {  expandedKeys :std.Array<rc-tree.rc-tree/es/interface.Key>} */
@js.native
trait NodeDragEventParamsHTMLDi extends js.Object {
  
  var event: MouseEvent[HTMLDivElement, NativeMouseEvent] = js.native
  
  var expandedKeys: js.Array[typings.rcTree.interfaceMod.Key] = js.native
  
  var node: EventDataNode = js.native
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
  implicit class NodeDragEventParamsHTMLDiOps[Self <: NodeDragEventParamsHTMLDi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: MouseEvent[HTMLDivElement, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
