package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchSubmitResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchSubmitResponse extends js.Object {
  /** ClientBatchSubmitResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBatchSubmitResponse {
  @scala.inline
  def apply(status: Status = null): IClientBatchSubmitResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchSubmitResponse]
  }
}

