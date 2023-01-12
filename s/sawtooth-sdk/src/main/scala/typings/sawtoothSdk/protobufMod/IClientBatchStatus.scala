package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBatchStatus.IInvalidTransaction
import typings.sawtoothSdk.protobufMod.ClientBatchStatus.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchStatus extends StObject {
  
  /** ClientBatchStatus batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientBatchStatus invalidTransactions */
  var invalidTransactions: js.UndefOr[js.Array[IInvalidTransaction] | Null] = js.undefined
  
  /** ClientBatchStatus status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBatchStatus {
  
  inline def apply(): IClientBatchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBatchStatus] (val x: Self) extends AnyVal {
    
    inline def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setInvalidTransactions(value: js.Array[IInvalidTransaction]): Self = StObject.set(x, "invalidTransactions", value.asInstanceOf[js.Any])
    
    inline def setInvalidTransactionsNull: Self = StObject.set(x, "invalidTransactions", null)
    
    inline def setInvalidTransactionsUndefined: Self = StObject.set(x, "invalidTransactions", js.undefined)
    
    inline def setInvalidTransactionsVarargs(value: IInvalidTransaction*): Self = StObject.set(x, "invalidTransactions", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
