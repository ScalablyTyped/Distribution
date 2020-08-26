package typings.rcTree.anon

import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.rcTreeStrings.select
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var event: select = js.native
  var nativeEvent: MouseEvent = js.native
  var node: EventDataNode = js.native
  var selected: Boolean = js.native
  var selectedNodes: js.Array[DataNode] = js.native
}

object Event {
  @scala.inline
  def apply(
    event: select,
    nativeEvent: MouseEvent,
    node: EventDataNode,
    selected: Boolean,
    selectedNodes: js.Array[DataNode]
  ): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
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
    def setEvent(value: select): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedNodesVarargs(value: DataNode*): Self = this.set("selectedNodes", js.Array(value :_*))
    @scala.inline
    def setSelectedNodes(value: js.Array[DataNode]): Self = this.set("selectedNodes", value.asInstanceOf[js.Any])
  }
  
}

