package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBlocksGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusBlocksGetResponse extends js.Object {
  /** ConsensusBlocksGetResponse blocks */
  var blocks: js.UndefOr[js.Array[IConsensusBlock] | Null] = js.native
  /** ConsensusBlocksGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusBlocksGetResponse {
  @scala.inline
  def apply(): IConsensusBlocksGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBlocksGetResponse]
  }
  @scala.inline
  implicit class IConsensusBlocksGetResponseOps[Self <: IConsensusBlocksGetResponse] (val x: Self) extends AnyVal {
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
    def setBlocksVarargs(value: IConsensusBlock*): Self = this.set("blocks", js.Array(value :_*))
    @scala.inline
    def setBlocks(value: js.Array[IConsensusBlock]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    @scala.inline
    def setBlocksNull: Self = this.set("blocks", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

