package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreUserDashAgentsUserDashAgentDashClientMod {
  import org.scalablytyped.runtime.Instantiable3
  import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
  import typings.sipDotJs.libCoreTransactionsMod.ClientTransaction
  import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
  import typings.sipDotJs.libCoreTransportMod.Transport

  type ClientTransactionConstructor = Instantiable3[
    /* message */ OutgoingRequestMessage, 
    /* transport */ Transport, 
    /* user */ ClientTransactionUser, 
    ClientTransaction
  ]
}
