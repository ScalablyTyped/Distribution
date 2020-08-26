package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusRegisterResponse extends js.Object {
  /** ConsensusRegisterResponse chainHead */
  var chainHead: js.UndefOr[IConsensusBlock | Null] = js.native
  /** ConsensusRegisterResponse peers */
  var peers: js.UndefOr[js.Array[IConsensusPeerInfo] | Null] = js.native
  /** ConsensusRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusRegisterResponse {
  @scala.inline
  def apply(): IConsensusRegisterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusRegisterResponse]
  }
  @scala.inline
  implicit class IConsensusRegisterResponseOps[Self <: IConsensusRegisterResponse] (val x: Self) extends AnyVal {
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
    def setChainHead(value: IConsensusBlock): Self = this.set("chainHead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChainHead: Self = this.set("chainHead", js.undefined)
    @scala.inline
    def setChainHeadNull: Self = this.set("chainHead", null)
    @scala.inline
    def setPeersVarargs(value: IConsensusPeerInfo*): Self = this.set("peers", js.Array(value :_*))
    @scala.inline
    def setPeers(value: js.Array[IConsensusPeerInfo]): Self = this.set("peers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeers: Self = this.set("peers", js.undefined)
    @scala.inline
    def setPeersNull: Self = this.set("peers", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

