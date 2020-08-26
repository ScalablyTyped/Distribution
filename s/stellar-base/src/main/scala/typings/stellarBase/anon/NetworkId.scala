package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkId extends js.Object {
  var networkId: Buffer = js.native
  var taggedTransaction: TransactionSignaturePayloadTaggedTransaction = js.native
}

object NetworkId {
  @scala.inline
  def apply(networkId: Buffer, taggedTransaction: TransactionSignaturePayloadTaggedTransaction): NetworkId = {
    val __obj = js.Dynamic.literal(networkId = networkId.asInstanceOf[js.Any], taggedTransaction = taggedTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkId]
  }
  @scala.inline
  implicit class NetworkIdOps[Self <: NetworkId] (val x: Self) extends AnyVal {
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
    def setNetworkId(value: Buffer): Self = this.set("networkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaggedTransaction(value: TransactionSignaturePayloadTaggedTransaction): Self = this.set("taggedTransaction", value.asInstanceOf[js.Any])
  }
  
}

