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
  def apply(status: Status = null): INetworkAcknowledgement = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkAcknowledgement]
  }
}

