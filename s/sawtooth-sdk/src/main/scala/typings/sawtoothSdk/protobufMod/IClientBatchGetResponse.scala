package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchGetResponse extends js.Object {
  /** ClientBatchGetResponse batch */
  var batch: js.UndefOr[IBatch | Null] = js.undefined
  /** ClientBatchGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IClientBatchGetResponse {
  @scala.inline
  def apply(batch: js.UndefOr[Null | IBatch] = js.undefined, status: js.UndefOr[Null | Status] = js.undefined): IClientBatchGetResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchGetResponse]
  }
}

