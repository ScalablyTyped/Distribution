package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockGetByTransactionIdRequest extends StObject {
  
  /** ClientBlockGetByTransactionIdRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}
object IClientBlockGetByTransactionIdRequest {
  
  inline def apply(): IClientBlockGetByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByTransactionIdRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientBlockGetByTransactionIdRequest] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
