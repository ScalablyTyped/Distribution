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
  
  inline def apply(): IClientBatchListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBatchListResponse] (val x: Self) extends AnyVal {
    
    inline def setBatches(value: js.Array[IBatch]): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesNull: Self = StObject.set(x, "batches", null)
    
    inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
    
    inline def setBatchesVarargs(value: IBatch*): Self = StObject.set(x, "batches", js.Array(value*))
    
    inline def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    inline def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    inline def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    inline def setPaging(value: IClientPagingResponse): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingNull: Self = StObject.set(x, "paging", null)
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
