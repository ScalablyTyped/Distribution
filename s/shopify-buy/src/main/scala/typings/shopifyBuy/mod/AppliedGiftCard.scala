package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// end GraphQL Types - Input Objects
/**
  * Checkout
  */
trait AppliedGiftCard
  extends StObject
     with Node {
  
  var amountUsed: MoneyV2
  
  /**
    * @deprecated
    */
  var amountUsedV2: MoneyV2
  
  var balance: MoneyV2
  
  /**
    * @deprecated
    */
  var balanceV2: MoneyV2
  
  var lastCharacters: String
  
  var presentmentAmountUsed: MoneyV2
}
object AppliedGiftCard {
  
  inline def apply(
    amountUsed: MoneyV2,
    amountUsedV2: MoneyV2,
    balance: MoneyV2,
    balanceV2: MoneyV2,
    id: ID,
    lastCharacters: String,
    presentmentAmountUsed: MoneyV2
  ): AppliedGiftCard = {
    val __obj = js.Dynamic.literal(amountUsed = amountUsed.asInstanceOf[js.Any], amountUsedV2 = amountUsedV2.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], balanceV2 = balanceV2.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastCharacters = lastCharacters.asInstanceOf[js.Any], presentmentAmountUsed = presentmentAmountUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppliedGiftCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppliedGiftCard] (val x: Self) extends AnyVal {
    
    inline def setAmountUsed(value: MoneyV2): Self = StObject.set(x, "amountUsed", value.asInstanceOf[js.Any])
    
    inline def setAmountUsedV2(value: MoneyV2): Self = StObject.set(x, "amountUsedV2", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: MoneyV2): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceV2(value: MoneyV2): Self = StObject.set(x, "balanceV2", value.asInstanceOf[js.Any])
    
    inline def setLastCharacters(value: String): Self = StObject.set(x, "lastCharacters", value.asInstanceOf[js.Any])
    
    inline def setPresentmentAmountUsed(value: MoneyV2): Self = StObject.set(x, "presentmentAmountUsed", value.asInstanceOf[js.Any])
  }
}
