package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.rcTreeStrings.load
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var event: load = js.native
  var node: EventDataNode = js.native
}

object Node {
  @scala.inline
  def apply(event: load, node: EventDataNode): Node = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setEvent(value: load): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

