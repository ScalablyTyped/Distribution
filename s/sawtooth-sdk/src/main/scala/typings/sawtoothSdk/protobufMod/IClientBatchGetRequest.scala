package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchGetRequest extends js.Object {
  /** ClientBatchGetRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
}

object IClientBatchGetRequest {
  @scala.inline
  def apply(batchId: js.UndefOr[Null | String] = js.undefined): IClientBatchGetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchGetRequest]
  }
}

