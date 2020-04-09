package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBatchSubmitRequest extends js.Object {
  /** ClientBatchSubmitRequest batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
}

object IClientBatchSubmitRequest {
  @scala.inline
  def apply(batches: js.Array[IBatch] = null): IClientBatchSubmitRequest = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBatchSubmitRequest]
  }
}

