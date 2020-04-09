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
    header: Uint8Array = null,
    headerSignature: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    transactions: js.Array[ITransaction] = null
  ): IBatch = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerSignature != null) __obj.updateDynamic("headerSignature")(headerSignature.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (transactions != null) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatch]
  }
}

