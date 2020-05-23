package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchStatusRequest extends js.Object {
  /** ClientBatchStatusRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** ClientBatchStatusRequest timeout */
  var timeout: js.UndefOr[Double | Null] = js.undefined
  /** ClientBatchStatusRequest wait */
  @JSName("wait")
  var wait_FIClientBatchStatusRequest: js.UndefOr[Boolean | Null] = js.undefined
}

object IClientBatchStatusRequest {
  @scala.inline
  def apply(
    batchIds: js.UndefOr[Null | js.Array[String]] = js.undefined,
    timeout: js.UndefOr[Null | Double] = js.undefined,
    wait: js.UndefOr[Null | Boolean] = js.undefined
  ): IClientBatchStatusRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchIds)) __obj.updateDynamic("batchIds")(batchIds.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchStatusRequest]
  }
}

