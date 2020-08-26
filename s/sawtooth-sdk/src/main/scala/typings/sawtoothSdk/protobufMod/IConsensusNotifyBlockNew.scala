package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusNotifyBlockNew extends js.Object {
  /** ConsensusNotifyBlockNew block */
  var block: js.UndefOr[IConsensusBlock | Null] = js.native
}

object IConsensusNotifyBlockNew {
  @scala.inline
  def apply(): IConsensusNotifyBlockNew = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusNotifyBlockNew]
  }
  @scala.inline
  implicit class IConsensusNotifyBlockNewOps[Self <: IConsensusNotifyBlockNew] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlock(value: IConsensusBlock): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setBlockNull: Self = this.set("block", null)
  }
  
}

