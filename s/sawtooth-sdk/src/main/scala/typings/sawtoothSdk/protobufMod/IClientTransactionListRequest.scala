package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientTransactionListRequest extends StObject {
  
  /** ClientTransactionListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientTransactionListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  
  /** ClientTransactionListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
  
  /** ClientTransactionListRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}
object IClientTransactionListRequest {
  
  @scala.inline
  def apply(): IClientTransactionListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionListRequest]
  }
  
  @scala.inline
  implicit class IClientTransactionListRequestMutableBuilder[Self <: IClientTransactionListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    @scala.inline
    def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    @scala.inline
    def setPaging(value: IClientPagingControls): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingNull: Self = StObject.set(x, "paging", null)
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setSorting(value: js.Array[IClientSortControls]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingNull: Self = StObject.set(x, "sorting", null)
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    @scala.inline
    def setSortingVarargs(value: IClientSortControls*): Self = StObject.set(x, "sorting", js.Array(value :_*))
    
    @scala.inline
    def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdsNull: Self = StObject.set(x, "transactionIds", null)
    
    @scala.inline
    def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    @scala.inline
    def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value :_*))
  }
}
