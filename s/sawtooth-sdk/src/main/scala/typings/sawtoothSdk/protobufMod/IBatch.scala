package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatch extends js.Object {
  /** Batch header */
  var header: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Batch headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
  /** Batch trace */
  var trace: js.UndefOr[Boolean | Null] = js.undefined
  /** Batch transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.undefined
}

object IBatch {
  @scala.inline
  def apply(
    header: js.UndefOr[Null | Uint8Array] = js.undefined,
    headerSignature: js.UndefOr[Null | String] = js.undefined,
    trace: js.UndefOr[Null | Boolean] = js.undefined,
    transactions: js.UndefOr[Null | js.Array[ITransaction]] = js.undefined
  ): IBatch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSignature)) __obj.updateDynamic("headerSignature")(headerSignature.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (!js.isUndefined(transactions)) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatch]
  }
}

