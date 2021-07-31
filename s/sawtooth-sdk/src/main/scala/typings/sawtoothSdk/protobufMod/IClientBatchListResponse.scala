package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchListResponse extends StObject {
  
  /** ClientBatchListResponse batches */
  var batches: js.UndefOr[js.Array[IBatch] | Null] = js.undefined
  
  /** ClientBatchListResponse headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientBatchListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  
  /** ClientBatchListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBatchListResponse {
  
  @scala.inline
  def apply(): IClientBatchListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListResponse]
  }
  
  @scala.inline
  implicit class IClientBatchListResponseMutableBuilder[Self <: IClientBatchListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    @scala.inline
    def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    @scala.inline
    def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value :_*))
    
    @scala.inline
    def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    @scala.inline
    def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    @scala.inline
    def setPaging(value: IClientPagingResponse): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingNull: Self = StObject.set(x, "paging", null)
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
