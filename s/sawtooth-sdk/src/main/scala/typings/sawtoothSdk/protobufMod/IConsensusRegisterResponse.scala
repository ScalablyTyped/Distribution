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
    chainHead: js.UndefOr[Null | IConsensusBlock] = js.undefined,
    peers: js.UndefOr[Null | js.Array[IConsensusPeerInfo]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IConsensusRegisterResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chainHead)) __obj.updateDynamic("chainHead")(chainHead.asInstanceOf[js.Any])
    if (!js.isUndefined(peers)) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusRegisterResponse]
  }
}

