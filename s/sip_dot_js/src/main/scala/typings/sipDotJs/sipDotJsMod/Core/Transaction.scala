package typings.sipDotJs.sipDotJsMod.Core

import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Core.Transaction")
@js.native
abstract class Transaction protected ()
  extends typings.sipDotJs.libCoreMod.Transaction {
  protected def this(
    _transport: typings.sipDotJs.libCoreTransportMod.Transport,
    _user: TransactionUser,
    _id: String,
    _state: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

