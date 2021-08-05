package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientReceiptGetRequest extends StObject {
  
  /** ClientReceiptGetRequest transactionIds */
  var transactionIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IClientReceiptGetRequest {
  
  inline def apply(): IClientReceiptGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientReceiptGetRequest]
  }
  
  extension [Self <: IClientReceiptGetRequest](x: Self) {
    
    inline def setTransactionIds(value: js.Array[String]): Self = StObject.set(x, "transactionIds", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdsNull: Self = StObject.set(x, "transactionIds", null)
    
    inline def setTransactionIdsUndefined: Self = StObject.set(x, "transactionIds", js.undefined)
    
    inline def setTransactionIdsVarargs(value: String*): Self = StObject.set(x, "transactionIds", js.Array(value :_*))
  }
}
