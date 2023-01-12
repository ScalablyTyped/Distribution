package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchListRequest extends StObject {
  
  /** ClientBatchListRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientBatchListRequest headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientBatchListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  
  /** ClientBatchListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
}
object IClientBatchListRequest {
  
  inline def apply(): IClientBatchListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBatchListRequest] (val x: Self) extends AnyVal {
    
    inline def setBatchIds(value: js.Array[String]): Self = StObject.set(x, "batchIds", value.asInstanceOf[js.Any])
    
    inline def setBatchIdsNull: Self = StObject.set(x, "batchIds", null)
    
    inline def setBatchIdsUndefined: Self = StObject.set(x, "batchIds", js.undefined)
    
    inline def setBatchIdsVarargs(value: String*): Self = StObject.set(x, "batchIds", js.Array(value*))
    
    inline def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    inline def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    inline def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    inline def setPaging(value: IClientPagingControls): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingNull: Self = StObject.set(x, "paging", null)
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setSorting(value: js.Array[IClientSortControls]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingNull: Self = StObject.set(x, "sorting", null)
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSortingVarargs(value: IClientSortControls*): Self = StObject.set(x, "sorting", js.Array(value*))
  }
}
