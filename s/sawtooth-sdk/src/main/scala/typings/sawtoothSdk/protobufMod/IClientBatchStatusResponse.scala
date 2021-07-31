package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchStatusResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchStatusResponse extends StObject {
  
  /** ClientBatchStatusResponse batchStatuses */
  var batchStatuses: js.UndefOr[js.Array[IClientBatchStatus] | Null] = js.undefined
  
  /** ClientBatchStatusResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBatchStatusResponse {
  
  @scala.inline
  def apply(): IClientBatchStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatusResponse]
  }
  
  @scala.inline
  implicit class IClientBatchStatusResponseMutableBuilder[Self <: IClientBatchStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchStatuses(value: js.Array[IClientBatchStatus]): Self = StObject.set(x, "batchStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchStatusesNull: Self = StObject.set(x, "batchStatuses", null)
    
    @scala.inline
    def setBatchStatusesUndefined: Self = StObject.set(x, "batchStatuses", js.undefined)
    
    @scala.inline
    def setBatchStatusesVarargs(value: IClientBatchStatus*): Self = StObject.set(x, "batchStatuses", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
