package typings.sipJs.mod.Core

import typings.sipJs.libCoreTransactionsTransactionUserMod.TransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js", "Core.Transaction")
@js.native
open class Transaction protected ()
  extends typings.sipJs.libCoreMod.Transaction {
  /* protected */ def this(
    _transport: Transport,
    _user: TransactionUser,
    _id: String,
    _state: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
