package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeIdSignature extends js.Object {
  var nodeId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  var signature: Buffer = js.native
}

object NodeIdSignature {
  @scala.inline
  def apply(nodeId: typings.stellarBase.xdrMod.xdr.NodeId, signature: Buffer): NodeIdSignature = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIdSignature]
  }
  @scala.inline
  implicit class NodeIdSignatureOps[Self <: NodeIdSignature] (val x: Self) extends AnyVal {
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
    def setSignature(value: Buffer): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

