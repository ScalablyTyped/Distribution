package typings.sawtoothSdk.protobufMod.ClientBatchStatus

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an InvalidTransaction. */
trait IInvalidTransaction extends js.Object {
  /** InvalidTransaction extendedData */
  var extendedData: js.UndefOr[Uint8Array | Null] = js.undefined
  /** InvalidTransaction message */
  var message: js.UndefOr[String | Null] = js.undefined
  /** InvalidTransaction transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}

object IInvalidTransaction {
  @scala.inline
  def apply(extendedData: Uint8Array = null, message: String = null, transactionId: String = null): IInvalidTransaction = {
    val __obj = js.Dynamic.literal()
    if (extendedData != null) __obj.updateDynamic("extendedData")(extendedData.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInvalidTransaction]
  }
}

