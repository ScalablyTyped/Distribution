package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  var amount: MoneyV2
  
  /**
    * @deprecated
    */
  var amountV2: MoneyV2
  
  var kind: TransactionKind
  
  /**
    * @deprecated
    */
  var status: TransactionStatus
  
  var statusV2: js.UndefOr[TransactionStatus] = js.undefined
  
  var test: Boolean
}
object Transaction {
  
  inline def apply(
    amount: MoneyV2,
    amountV2: MoneyV2,
    kind: TransactionKind,
    status: TransactionStatus,
    test: Boolean
  ): Transaction = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amountV2 = amountV2.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: MoneyV2): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountV2(value: MoneyV2): Self = StObject.set(x, "amountV2", value.asInstanceOf[js.Any])
    
    inline def setKind(value: TransactionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TransactionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusV2(value: TransactionStatus): Self = StObject.set(x, "statusV2", value.asInstanceOf[js.Any])
    
    inline def setStatusV2Undefined: Self = StObject.set(x, "statusV2", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
  }
}
