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
  def apply(blockId: Uint8Array = null, status: Status = null): IConsensusFinalizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusFinalizeBlockResponse]
  }
}

