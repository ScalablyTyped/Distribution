package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientTransactionListResponse extends StObject {
  
  /** ClientTransactionListResponse headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientTransactionListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.native
  
  /** ClientTransactionListResponse status */
  var status: js.UndefOr[Status | Null] = js.native
  
  /** ClientTransactionListResponse transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}
object IClientTransactionListResponse {
  
  @scala.inline
  def apply(): IClientTransactionListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListResponse]
  }
  
  @scala.inline
  implicit class IClientTransactionListResponseMutableBuilder[Self <: IClientTransactionListResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    @scala.inline
    def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
