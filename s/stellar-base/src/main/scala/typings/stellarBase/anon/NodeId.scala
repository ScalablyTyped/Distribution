package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ScpStatementPledges
import typings.stellarBase.xdrMod.xdr.Uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeId extends js.Object {
  var nodeId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  var pledges: ScpStatementPledges = js.native
  var slotIndex: Uint64 = js.native
}

object NodeId {
  @scala.inline
  def apply(nodeId: typings.stellarBase.xdrMod.xdr.NodeId, pledges: ScpStatementPledges, slotIndex: Uint64): NodeId = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], pledges = pledges.asInstanceOf[js.Any], slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeId]
  }
  @scala.inline
  implicit class NodeIdOps[Self <: NodeId] (val x: Self) extends AnyVal {
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
    def setNodeId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPledges(value: ScpStatementPledges): Self = this.set("pledges", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlotIndex(value: Uint64): Self = this.set("slotIndex", value.asInstanceOf[js.Any])
  }
  
}

