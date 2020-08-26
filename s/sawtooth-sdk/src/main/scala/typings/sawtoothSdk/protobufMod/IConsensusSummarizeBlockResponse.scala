package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSummarizeBlockResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConsensusSummarizeBlockResponse extends js.Object {
  /** ConsensusSummarizeBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  /** ConsensusSummarizeBlockResponse summary */
  var summary: js.UndefOr[Uint8Array | Null] = js.native
}

object IConsensusSummarizeBlockResponse {
  @scala.inline
  def apply(): IConsensusSummarizeBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSummarizeBlockResponse]
  }
  @scala.inline
  implicit class IConsensusSummarizeBlockResponseOps[Self <: IConsensusSummarizeBlockResponse] (val x: Self) extends AnyVal {
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
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    @scala.inline
    def setSummary(value: Uint8Array): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    @scala.inline
    def setSummaryNull: Self = this.set("summary", null)
  }
  
}

