package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "ServerTransaction")
@js.native
abstract class ServerTransaction protected ()
  extends sipDotJsLib.libCoreTransactionsMod.ServerTransaction {
  protected def this(_request: sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, transport: sipDotJsLib.libCoreTransportMod.Transport, user: sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser, state: sipDotJsLib.libCoreTransactionsTransactionDashStateMod.TransactionState, loggerCategory: java.lang.String) = this()
}

