package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusFinalizeBlockResponse extends js.Object {
  /** ConsensusFinalizeBlockResponse blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusFinalizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}

object IConsensusFinalizeBlockResponse {
  @scala.inline
  def apply(
    blockId: js.UndefOr[Null | Uint8Array] = js.undefined,
    status: js.UndefOr[Null | Status] = js.undefined
  ): IConsensusFinalizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusFinalizeBlockResponse]
  }
}

