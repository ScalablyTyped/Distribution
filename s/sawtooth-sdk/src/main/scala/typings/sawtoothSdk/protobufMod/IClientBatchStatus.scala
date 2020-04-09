package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchStatus extends js.Object {
  /** ClientBatchStatus batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
  /** ClientBatchStatus invalidTransactions */
  var invalidTransactions: js.UndefOr[js.Array[IInvalidTransaction] | Null] = js.undefined
  /** ClientBatchStatus status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBatchStatus {
  @scala.inline
  def apply(
    batchId: String = null,
    invalidTransactions: js.Array[IInvalidTransaction] = null,
    status: Status = null
  ): IClientBatchStatus = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (invalidTransactions != null) __obj.updateDynamic("invalidTransactions")(invalidTransactions.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchStatus]
  }
}

