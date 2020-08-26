package typings.rcTree.anon

import typings.rcTree.interfaceMod.EventDataNode
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandedKeys extends js.Object {
  var event: MouseEvent[Element, NativeMouseEvent] = js.native
  var expandedKeys: js.Array[typings.rcTree.interfaceMod.Key] = js.native
  var node: EventDataNode = js.native
}

object ExpandedKeys {
  @scala.inline
  def apply(
    event: MouseEvent[Element, NativeMouseEvent],
    expandedKeys: js.Array[typings.rcTree.interfaceMod.Key],
    node: EventDataNode
  ): ExpandedKeys = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedKeys]
  }
  @scala.inline
  implicit class ExpandedKeysOps[Self <: ExpandedKeys] (val x: Self) extends AnyVal {
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
    def setEvent(value: MouseEvent[Element, NativeMouseEvent]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = this.set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = this.set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

