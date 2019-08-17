package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreUserDashAgentsUserDashAgentDashServerMod {
  import org.scalablytyped.runtime.Instantiable3
  import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
  import typings.sipDotJs.libCoreTransactionsMod.ServerTransaction
  import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
  import typings.sipDotJs.libCoreTransportMod.Transport

  type ServerTransactionConstructor = Instantiable3[
    /* message */ IncomingRequestMessage, 
    /* transport */ Transport, 
    /* user */ ServerTransactionUser, 
    ServerTransaction
  ]
}
