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
    data: js.UndefOr[Null | js.Array[Uint8Array]] = js.undefined,
    events: js.UndefOr[Null | js.Array[IEvent]] = js.undefined,
    stateChanges: js.UndefOr[Null | js.Array[IStateChange]] = js.undefined,
    transactionId: js.UndefOr[Null | String] = js.undefined
  ): ITransactionReceipt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(stateChanges)) __obj.updateDynamic("stateChanges")(stateChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionId)) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionReceipt]
  }
}

