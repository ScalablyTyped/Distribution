package typings.sipDotJs.sipDotJsMod

import org.scalablytyped.runtime.Instantiable3
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in TransactionsNs */
@JSImport("sip.js", "Transactions")
@js.native
object Transactions extends js.Object {
  var InviteClientTransaction: Instantiable3[
    /* request */ OutgoingRequestMessage, 
    /* transport */ typings.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ClientTransactionUser, 
    typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction
  ] = js.native
  var InviteServerTransaction: Instantiable3[
    /* request */ IncomingRequestMessage, 
    /* transport */ typings.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ServerTransactionUser, 
    typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction
  ] = js.native
  var NonInviteClientTransaction: Instantiable3[
    /* request */ OutgoingRequestMessage, 
    /* transport */ typings.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ClientTransactionUser, 
    typings.sipDotJs.libCoreTransactionsMod.NonInviteClientTransaction
  ] = js.native
  var NonInviteServerTransaction: Instantiable3[
    /* request */ IncomingRequestMessage, 
    /* transport */ typings.sipDotJs.libCoreTransportMod.Transport, 
    /* user */ ServerTransactionUser, 
    typings.sipDotJs.libCoreTransactionsMod.NonInviteServerTransaction
  ] = js.native
}

