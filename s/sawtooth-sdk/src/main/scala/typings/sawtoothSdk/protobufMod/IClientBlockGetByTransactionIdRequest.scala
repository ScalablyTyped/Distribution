package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientBlockGetByTransactionIdRequest extends js.Object {
  /** ClientBlockGetByTransactionIdRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}

object IClientBlockGetByTransactionIdRequest {
  @scala.inline
  def apply(transactionId: String = null): IClientBlockGetByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientBlockGetByTransactionIdRequest]
  }
}

