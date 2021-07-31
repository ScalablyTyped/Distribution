package typings.sipJs.coreMod

import typings.sipJs.coreTransportMod.Transport
import typings.sipJs.transactionUserMod.ServerTransactionUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends typings.sipJs.transactionsMod.ServerTransaction {
  protected def this(
    _request: typings.sipJs.messagesMod.IncomingRequestMessage,
    transport: Transport,
    user: ServerTransactionUser,
    state: typings.sipJs.transactionStateMod.TransactionState,
    loggerCategory: String
  ) = this()
}
