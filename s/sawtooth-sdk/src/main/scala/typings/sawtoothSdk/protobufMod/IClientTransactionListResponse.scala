package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientTransactionListResponse extends StObject {
  
  /** ClientTransactionListResponse headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientTransactionListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  
  /** ClientTransactionListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
  
  /** ClientTransactionListResponse transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.undefined
}
object IClientTransactionListResponse {
  
  inline def apply(): IClientTransactionListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListResponse]
  }
  
  extension [Self <: IClientTransactionListResponse](x: Self) {
    
    inline def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    inline def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    inline def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    inline def setPaging(value: IClientPagingResponse): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingNull: Self = StObject.set(x, "paging", null)
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
