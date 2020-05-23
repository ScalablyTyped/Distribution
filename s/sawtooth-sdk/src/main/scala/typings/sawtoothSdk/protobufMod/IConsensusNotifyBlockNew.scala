package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusNotifyBlockNew extends js.Object {
  /** ConsensusNotifyBlockNew block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.undefined
}

object IConsensusNotifyBlockNew {
  @scala.inline
  def apply(block: js.UndefOr[Null | IConsensusBlock] = js.undefined): IConsensusNotifyBlockNew = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusNotifyBlockNew]
  }
}

