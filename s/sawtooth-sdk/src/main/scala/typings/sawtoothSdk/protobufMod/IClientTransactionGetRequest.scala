package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientTransactionGetRequest extends StObject {
  
  /** ClientTransactionGetRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}
object IClientTransactionGetRequest {
  
  @scala.inline
  def apply(): IClientTransactionGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionGetRequest]
  }
  
  @scala.inline
  implicit class IClientTransactionGetRequestMutableBuilder[Self <: IClientTransactionGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
