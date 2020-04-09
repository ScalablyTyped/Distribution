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
  def apply(batchId: String = null): IClientBatchGetRequest = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchGetRequest]
  }
}

