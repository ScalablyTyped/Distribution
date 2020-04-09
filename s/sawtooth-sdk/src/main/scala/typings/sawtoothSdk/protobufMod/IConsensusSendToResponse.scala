package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusSendToResponse extends js.Object {
  /** ConsensusSendToResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusSendToResponse {
  @scala.inline
  def apply(status: Status = null): IConsensusSendToResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusSendToResponse]
  }
}

