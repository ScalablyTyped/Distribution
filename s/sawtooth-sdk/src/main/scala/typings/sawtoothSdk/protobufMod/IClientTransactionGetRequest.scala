package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientTransactionGetRequest extends StObject {
  
  /** ClientTransactionGetRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}
object IClientTransactionGetRequest {
  
  inline def apply(): IClientTransactionGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientTransactionGetRequest]
  }
  
  extension [Self <: IClientTransactionGetRequest](x: Self) {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
