package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchGetRequest extends js.Object {
  
  /** ClientBatchGetRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.native
}
object IClientBatchGetRequest {
  
  @scala.inline
  def apply(): IClientBatchGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchGetRequest]
  }
  
  @scala.inline
  implicit class IClientBatchGetRequestOps[Self <: IClientBatchGetRequest] (val x: Self) extends AnyVal {
    
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
