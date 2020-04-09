package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusBlocksGetRequest extends js.Object {
  /** ConsensusBlocksGetRequest blockIds */
  var blockIds: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
}

object IConsensusBlocksGetRequest {
  @scala.inline
  def apply(blockIds: js.Array[Uint8Array] = null): IConsensusBlocksGetRequest = {
    val __obj = js.Dynamic.literal()
    if (blockIds != null) __obj.updateDynamic("blockIds")(blockIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusBlocksGetRequest]
  }
}

