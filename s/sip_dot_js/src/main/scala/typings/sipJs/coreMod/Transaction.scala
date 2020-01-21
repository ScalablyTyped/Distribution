package typings.sipJs.coreMod

import typings.sipJs.coreTransportMod.Transport
import typings.sipJs.transactionUserMod.TransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "Transaction")
@js.native
abstract class Transaction protected ()
  extends typings.sipJs.transactionsMod.Transaction {
  protected def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typings.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}

