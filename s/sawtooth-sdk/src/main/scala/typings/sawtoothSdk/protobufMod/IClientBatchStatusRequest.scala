package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBatchStatusRequest extends js.Object {
  /** ClientBatchStatusRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  /** ClientBatchStatusRequest timeout */
  var timeout: js.UndefOr[Double | Null] = js.native
  /** ClientBatchStatusRequest wait */
  @JSName("wait")
  var wait_FIClientBatchStatusRequest: js.UndefOr[Boolean | Null] = js.native
}

object IClientBatchStatusRequest {
  @scala.inline
  def apply(): IClientBatchStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatusRequest]
  }
  @scala.inline
  implicit class IClientBatchStatusRequestOps[Self <: IClientBatchStatusRequest] (val x: Self) extends AnyVal {
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
    def setBatchIdsVarargs(value: String*): Self = this.set("batchIds", js.Array(value :_*))
    @scala.inline
    def setBatchIds(value: js.Array[String]): Self = this.set("batchIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchIds: Self = this.set("batchIds", js.undefined)
    @scala.inline
    def setBatchIdsNull: Self = this.set("batchIds", null)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimeoutNull: Self = this.set("timeout", null)
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
    @scala.inline
    def setWaitNull: Self = this.set("wait", null)
  }
  
}

