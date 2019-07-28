package typings.sipDotJs

import org.scalablytyped.runtime.Instantiable3
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreTransactionsMod.ClientTransaction
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreUserDashAgentsUserDashAgentDashClientMod {
  type ClientTransactionConstructor = Instantiable3[
    /* message */ OutgoingRequestMessage, 
    /* transport */ Transport, 
    /* user */ ClientTransactionUser, 
    ClientTransaction
  ]
}
