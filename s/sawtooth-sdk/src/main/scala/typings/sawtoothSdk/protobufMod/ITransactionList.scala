package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransactionList extends js.Object {
  /** TransactionList transactions */
  var transactions: js.UndefOr[js.Array[ITransaction] | Null] = js.undefined
}

object ITransactionList {
  @scala.inline
  def apply(transactions: js.Array[ITransaction] = null): ITransactionList = {
    val __obj = js.Dynamic.literal()
    if (transactions != null) __obj.updateDynamic("transactions")(transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransactionList]
  }
}

