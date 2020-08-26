package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusChainHeadGetResponse extends js.Object {
  /** ConsensusChainHeadGetResponse block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.native
  /** ConsensusChainHeadGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusChainHeadGetResponse {
  @scala.inline
  def apply(): IConsensusChainHeadGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusChainHeadGetResponse]
  }
  @scala.inline
  implicit class IConsensusChainHeadGetResponseOps[Self <: IConsensusChainHeadGetResponse] (val x: Self) extends AnyVal {
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
    def setBlock(value: IConsensusBlock): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setBlockNull: Self = this.set("block", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

