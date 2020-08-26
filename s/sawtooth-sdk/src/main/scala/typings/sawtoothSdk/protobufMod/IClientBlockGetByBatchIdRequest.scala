package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientBlockGetByBatchIdRequest extends js.Object {
  /** ClientBlockGetByBatchIdRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.native
}

object IClientBlockGetByBatchIdRequest {
  @scala.inline
  def apply(): IClientBlockGetByBatchIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByBatchIdRequest]
  }
  @scala.inline
  implicit class IClientBlockGetByBatchIdRequestOps[Self <: IClientBlockGetByBatchIdRequest] (val x: Self) extends AnyVal {
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
    def setBatchId(value: String): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setBatchIdNull: Self = this.set("batchId", null)
  }
  
}

