package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusFailBlockRequest extends js.Object {
  /** ConsensusFailBlockRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusFailBlockRequest {
  @scala.inline
  def apply(blockId: Uint8Array = null): IConsensusFailBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusFailBlockRequest]
  }
}

