package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransactionReceipt extends js.Object {
  /** TransactionReceipt data */
  var data: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
  /** TransactionReceipt events */
  var events: js.UndefOr[js.Array[IEvent] | Null] = js.undefined
  /** TransactionReceipt stateChanges */
  var stateChanges: js.UndefOr[js.Array[IStateChange] | Null] = js.undefined
  /** TransactionReceipt transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}

object ITransactionReceipt {
  @scala.inline
  def apply(
    data: js.Array[Uint8Array] = null,
    events: js.Array[IEvent] = null,
    stateChanges: js.Array[IStateChange] = null,
    transactionId: String = null
  ): ITransactionReceipt = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (stateChanges != null) __obj.updateDynamic("stateChanges")(stateChanges.asInstanceOf[js.Any])
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionReceipt]
  }
}

