package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusIgnoreBlockRequest extends js.Object {
  /** ConsensusIgnoreBlockRequest blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusIgnoreBlockRequest {
  @scala.inline
  def apply(blockId: Uint8Array = null): IConsensusIgnoreBlockRequest = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusIgnoreBlockRequest]
  }
}

