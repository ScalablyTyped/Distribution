package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyBlockValid extends js.Object {
  /** ConsensusNotifyBlockValid blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusNotifyBlockValid {
  @scala.inline
  def apply(blockId: Uint8Array = null): IConsensusNotifyBlockValid = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyBlockValid]
  }
}

