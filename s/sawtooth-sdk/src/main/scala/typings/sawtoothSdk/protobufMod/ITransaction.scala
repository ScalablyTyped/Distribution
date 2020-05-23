package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransaction extends js.Object {
  /** Transaction header */
  var header: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Transaction headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
  /** Transaction payload */
  var payload: js.UndefOr[Uint8Array | Null] = js.undefined
}

object ITransaction {
  @scala.inline
  def apply(
    header: js.UndefOr[Null | Uint8Array] = js.undefined,
    headerSignature: js.UndefOr[Null | String] = js.undefined,
    payload: js.UndefOr[Null | Uint8Array] = js.undefined
  ): ITransaction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSignature)) __obj.updateDynamic("headerSignature")(headerSignature.asInstanceOf[js.Any])
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransaction]
  }
}

