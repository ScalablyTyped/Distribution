package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransactionList extends StObject {
  
  /** TransactionList transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.native
}
object ITransactionList {
  
  @scala.inline
  def apply(): ITransactionList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITransactionList]
  }
  
  @scala.inline
  implicit class ITransactionListMutableBuilder[Self <: ITransactionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactions(value: js.Array[ITransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsNull: Self = StObject.set(x, "transactions", null)
    
    @scala.inline
    def setTransactionsUndefined: Self = StObject.set(x, "transactions", js.undefined)
    
    @scala.inline
    def setTransactionsVarargs(value: ITransaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
  }
}
