package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusStateGetResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusStateGetResponse extends js.Object {
  /** ConsensusStateGetResponse entries */
  var entries: js.UndefOr[js.Array[IConsensusStateEntry] | Null] = js.native
  /** ConsensusStateGetResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IConsensusStateGetResponse {
  @scala.inline
  def apply(): IConsensusStateGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusStateGetResponse]
  }
  @scala.inline
  implicit class IConsensusStateGetResponseOps[Self <: IConsensusStateGetResponse] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: IConsensusStateEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[IConsensusStateEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setEntriesNull: Self = this.set("entries", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

