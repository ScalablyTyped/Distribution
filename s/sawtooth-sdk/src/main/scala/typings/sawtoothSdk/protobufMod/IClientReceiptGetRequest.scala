package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientReceiptGetRequest extends StObject {
  
  /** ClientReceiptGetRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.native
}
object IClientReceiptGetRequest {
  
  @scala.inline
  def apply(): IClientReceiptGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetRequest]
  }
  
  @scala.inline
  implicit class IClientReceiptGetRequestMutableBuilder[Self <: IClientReceiptGetRequest] (val x: Self) extends AnyVal {
    
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
