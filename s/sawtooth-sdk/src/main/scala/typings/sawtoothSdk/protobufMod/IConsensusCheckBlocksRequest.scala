package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusCheckBlocksRequest extends js.Object {
  /** ConsensusCheckBlocksRequest blockIds */
  var blockIds: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
}

object IConsensusCheckBlocksRequest {
  @scala.inline
  def apply(): IConsensusCheckBlocksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCheckBlocksRequest]
  }
  @scala.inline
  implicit class IConsensusCheckBlocksRequestOps[Self <: IConsensusCheckBlocksRequest] (val x: Self) extends AnyVal {
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
    def setBlockIdsVarargs(value: Uint8Array*): Self = this.set("blockIds", js.Array(value :_*))
    @scala.inline
    def setBlockIds(value: js.Array[Uint8Array]): Self = this.set("blockIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockIds: Self = this.set("blockIds", js.undefined)
    @scala.inline
    def setBlockIdsNull: Self = this.set("blockIds", null)
  }
  
}

