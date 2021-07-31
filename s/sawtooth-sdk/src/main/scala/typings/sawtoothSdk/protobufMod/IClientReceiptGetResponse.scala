package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientReceiptGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientReceiptGetResponse extends StObject {
  
  /** ClientReceiptGetResponse receipts */
  var receipts: js.UndefOr[js.Array[ITransactionReceipt] | Null] = js.undefined
  
  /** ClientReceiptGetResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientReceiptGetResponse {
  
  @scala.inline
  def apply(): IClientReceiptGetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetResponse]
  }
  
  @scala.inline
  implicit class IClientReceiptGetResponseMutableBuilder[Self <: IClientReceiptGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceipts(value: js.Array[ITransactionReceipt]): Self = StObject.set(x, "receipts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptsNull: Self = StObject.set(x, "receipts", null)
    
    @scala.inline
    def setReceiptsUndefined: Self = StObject.set(x, "receipts", js.undefined)
    
    @scala.inline
    def setReceiptsVarargs(value: ITransactionReceipt*): Self = StObject.set(x, "receipts", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
