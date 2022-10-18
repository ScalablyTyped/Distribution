package typings.sipJs.mod.Core

import typings.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("sip.js", "Core.ServerTransaction")
@js.native
open class ServerTransaction protected ()
  extends typings.sipJs.libCoreMod.ServerTransaction {
  /* protected */ def this(
    _request: typings.sipJs.libCoreMessagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
