package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusRegisterResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusRegisterResponse extends js.Object {
  /** ConsensusRegisterResponse chainHead */
  var chainHead: js.UndefOr[IConsensusBlock | Null] = js.undefined
  /** ConsensusRegisterResponse peers */
  var peers: js.UndefOr[js.Array[IConsensusPeerInfo] | Null] = js.undefined
  /** ConsensusRegisterResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusRegisterResponse {
  @scala.inline
  def apply(
    chainHead: IConsensusBlock = null,
    peers: js.Array[IConsensusPeerInfo] = null,
    status: Status = null
  ): IConsensusRegisterResponse = {
    val __obj = js.Dynamic.literal()
    if (chainHead != null) __obj.updateDynamic("chainHead")(chainHead.asInstanceOf[js.Any])
    if (peers != null) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusRegisterResponse]
  }
}

