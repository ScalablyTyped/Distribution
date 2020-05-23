package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlock extends js.Object {
  /** Block batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
  /** Block header */
  var header: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Block headerSignature */
  var headerSignature: js.UndefOr[String | Null] = js.undefined
}

object IBlock {
  @scala.inline
  def apply(
    batches: js.UndefOr[Null | js.Array[IBatch]] = js.undefined,
    header: js.UndefOr[Null | Uint8Array] = js.undefined,
    headerSignature: js.UndefOr[Null | String] = js.undefined
  ): IBlock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batches)) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSignature)) __obj.updateDynamic("headerSignature")(headerSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlock]
  }
}

