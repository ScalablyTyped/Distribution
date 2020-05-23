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
  def apply(blockId: js.UndefOr[Null | Uint8Array] = js.undefined): IConsensusNotifyBlockCommit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockId)) __obj.updateDynamic("blockId")(blockId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyBlockCommit]
  }
}

