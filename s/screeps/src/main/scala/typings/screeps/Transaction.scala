package typings.screeps

import typings.screeps.anon.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// No static is available
trait Transaction extends StObject {
  
  var amount: Double
  
  var description: String
  
  var from: String
  
  var order: js.UndefOr[TransactionOrder] = js.undefined
  
  var recipient: js.UndefOr[Username] = js.undefined
  
  var resourceType: MarketResourceConstant
  
  var sender: js.UndefOr[Username] = js.undefined
  
  var time: Double
  
  var to: String
  
  var transactionId: String
}
object Transaction {
  
  inline def apply(
    amount: Double,
    description: String,
    from: String,
    resourceType: MarketResourceConstant,
    time: Double,
    to: String,
    transactionId: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: TransactionOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setRecipient(value: Username): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setResourceType(value: MarketResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Username): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
