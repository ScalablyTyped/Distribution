package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBlockGetByTransactionIdRequest extends StObject {
  
  /** ClientBlockGetByTransactionIdRequest transactionId */
  var transactionId: js.UndefOr[String | Null] = js.native
}
object IClientBlockGetByTransactionIdRequest {
  
  @scala.inline
  def apply(): IClientBlockGetByTransactionIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockGetByTransactionIdRequest]
  }
  
  @scala.inline
  implicit class IClientBlockGetByTransactionIdRequestMutableBuilder[Self <: IClientBlockGetByTransactionIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
