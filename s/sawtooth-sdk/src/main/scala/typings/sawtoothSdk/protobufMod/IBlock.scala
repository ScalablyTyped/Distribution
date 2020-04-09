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
  def apply(batches: js.Array[IBatch] = null, header: Uint8Array = null, headerSignature: String = null): IBlock = {
    val __obj = js.Dynamic.literal()
    if (batches != null) __obj.updateDynamic("batches")(batches.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerSignature != null) __obj.updateDynamic("headerSignature")(headerSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBlock]
  }
}

