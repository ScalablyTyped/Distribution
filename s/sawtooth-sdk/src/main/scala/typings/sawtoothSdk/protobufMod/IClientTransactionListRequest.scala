package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientTransactionListRequest extends StObject {
  
  /** ClientTransactionListRequest headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientTransactionListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  
  /** ClientTransactionListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
  
  /** ClientTransactionListRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IClientTransactionListRequest {
  
  inline def apply(): IClientTransactionListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListRequest]
  }
  
  extension [Self <: IClientTransactionListRequest](x: Self) {
    
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
    
    inline def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdsNull: Self = StObject.set(x, "transactionIds", null)
    
    inline def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    inline def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value*))
  }
}
