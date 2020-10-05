package typings.rcTree.treeMod

import typings.rcTree.anon.Pos
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.EventDataNode
import typings.rcTree.interfaceMod.Key
import typings.rcTree.rcTreeStrings.check
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckInfo extends js.Object {
  var checked: Boolean = js.native
  var checkedNodes: js.Array[DataNode] = js.native
  var checkedNodesPositions: js.UndefOr[js.Array[Pos]] = js.native
  var event: check = js.native
  var halfCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
  var nativeEvent: MouseEvent = js.native
  var node: EventDataNode = js.native
}

object CheckInfo {
  @scala.inline
  def apply(
    checked: Boolean,
    checkedNodes: js.Array[DataNode],
    event: check,
    nativeEvent: MouseEvent,
    node: EventDataNode
  ): CheckInfo = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], checkedNodes = checkedNodes.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckInfo]
  }
  @scala.inline
  implicit class CheckInfoOps[Self <: CheckInfo] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckedNodesVarargs(value: DataNode*): Self = this.set("checkedNodes", js.Array(value :_*))
    @scala.inline
    def setCheckedNodes(value: js.Array[DataNode]): Self = this.set("checkedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: check): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeEvent(value: MouseEvent): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: EventDataNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckedNodesPositionsVarargs(value: Pos*): Self = this.set("checkedNodesPositions", js.Array(value :_*))
    @scala.inline
    def setCheckedNodesPositions(value: js.Array[Pos]): Self = this.set("checkedNodesPositions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckedNodesPositions: Self = this.set("checkedNodesPositions", js.undefined)
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalfCheckedKeys: Self = this.set("halfCheckedKeys", js.undefined)
  }
  
}

