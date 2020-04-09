package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyBlockCommit extends js.Object {
  /** ConsensusNotifyBlockCommit blockId */
  var blockId: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IConsensusNotifyBlockCommit {
  @scala.inline
  def apply(blockId: Uint8Array = null): IConsensusNotifyBlockCommit = {
    val __obj = js.Dynamic.literal()
    if (blockId != null) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyBlockCommit]
  }
}

