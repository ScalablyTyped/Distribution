package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchStatusResponse extends js.Object {
  /** ClientBatchStatusResponse batchStatuses */
  var batchStatuses: js.UndefOr[js.Array[IClientBatchStatus] | Null] = js.undefined
  /** ClientBatchStatusResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBatchStatusResponse {
  @scala.inline
  def apply(
    batchStatuses: js.UndefOr[Null | js.Array[IClientBatchStatus]] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IClientBatchStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchStatuses)) __obj.updateDynamic("batchStatuses")(batchStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchStatusResponse]
  }
}

