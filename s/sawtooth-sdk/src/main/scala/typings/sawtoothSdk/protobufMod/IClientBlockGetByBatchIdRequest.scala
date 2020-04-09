package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockGetByBatchIdRequest extends js.Object {
  /** ClientBlockGetByBatchIdRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
}

object IClientBlockGetByBatchIdRequest {
  @scala.inline
  def apply(batchId: String = null): IClientBlockGetByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockGetByBatchIdRequest]
  }
}

