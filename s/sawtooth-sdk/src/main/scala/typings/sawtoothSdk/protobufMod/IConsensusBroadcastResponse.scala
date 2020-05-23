package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusBroadcastResponse extends js.Object {
  /** ConsensusBroadcastResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusBroadcastResponse {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): IConsensusBroadcastResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBroadcastResponse]
  }
}

