package typings.rcTree.contextTypesMod

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMouseEventParams[T] extends js.Object {
  
  var event: MouseEvent[T, NativeMouseEvent] = js.native
  
  var node: EventDataNode = js.native
}
object NodeMouseEventParams {
  
  @scala.inline
  def apply[T](event: MouseEvent[T, NativeMouseEvent], node: EventDataNode): NodeMouseEventParams[T] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMouseEventParams[T]]
  }
  
  @scala.inline
  implicit class NodeMouseEventParamsOps[Self <: NodeMouseEventParams[_], T] (val x: Self with NodeMouseEventParams[T]) extends AnyVal {
    
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
    def setEvent(value: MouseEvent[T, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
