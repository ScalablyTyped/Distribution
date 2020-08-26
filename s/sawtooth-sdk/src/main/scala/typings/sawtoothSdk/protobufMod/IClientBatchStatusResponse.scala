package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBatchStatusResponse extends js.Object {
  /** ClientBatchStatusResponse batchStatuses */
  var batchStatuses: js.UndefOr[js.Array[IClientBatchStatus] | Null] = js.native
  /** ClientBatchStatusResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}

object IClientBatchStatusResponse {
  @scala.inline
  def apply(): IClientBatchStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatusResponse]
  }
  @scala.inline
  implicit class IClientBatchStatusResponseOps[Self <: IClientBatchStatusResponse] (val x: Self) extends AnyVal {
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
    def setBatchStatusesVarargs(value: IClientBatchStatus*): Self = this.set("batchStatuses", js.Array(value :_*))
    @scala.inline
    def setBatchStatuses(value: js.Array[IClientBatchStatus]): Self = this.set("batchStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchStatuses: Self = this.set("batchStatuses", js.undefined)
    @scala.inline
    def setBatchStatusesNull: Self = this.set("batchStatuses", null)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
  
}

