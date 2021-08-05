package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransactionList extends StObject {
  
  /** TransactionList transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.undefined
}
object ITransactionList {
  
  inline def apply(): ITransactionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionList]
  }
  
  extension [Self <: ITransactionList](x: Self) {
    
    inline def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    inline def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    inline def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
