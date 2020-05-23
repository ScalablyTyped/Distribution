package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.NetworkAcknowledgement.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkAcknowledgement extends js.Object {
  /** NetworkAcknowledgement status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object INetworkAcknowledgement {
  @scala.inline
  def apply(status: js.UndefOr[Null | Status] = js.undefined): INetworkAcknowledgement = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkAcknowledgement]
  }
}

