package typings.sipDotJs.libCoreTransactionsMod

import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.TransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", "Transaction")
@js.native
abstract class Transaction protected ()
  extends typings.sipDotJs.libCoreTransactionsTransactionMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

