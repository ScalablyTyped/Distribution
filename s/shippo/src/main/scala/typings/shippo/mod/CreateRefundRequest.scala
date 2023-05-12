package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRefundRequest
  extends StObject
     with Asyncable {
  
  var transaction: String
}
object CreateRefundRequest {
  
  inline def apply(transaction: String): CreateRefundRequest = {
    val __obj = js.Dynamic.literal(transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRefundRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRefundRequest] (val x: Self) extends AnyVal {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
  }
}
