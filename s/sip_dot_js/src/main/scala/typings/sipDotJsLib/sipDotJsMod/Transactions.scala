package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in TransactionsNs */
@JSImport("sip.js", "Transactions")
@js.native
object Transactions extends js.Object {
  var InviteClientTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, 
    /* transport */ sipDotJsLib.libCoreTransportMod.Transport, 
    /* user */ sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser, 
    sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction
  ] = js.native
  var InviteServerTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, 
    /* transport */ sipDotJsLib.libCoreTransportMod.Transport, 
    /* user */ sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser, 
    sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction
  ] = js.native
  var NonInviteClientTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, 
    /* transport */ sipDotJsLib.libCoreTransportMod.Transport, 
    /* user */ sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser, 
    sipDotJsLib.libCoreTransactionsMod.NonInviteClientTransaction
  ] = js.native
  var NonInviteServerTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libCoreMessagesMod.IncomingRequestMessage, 
    /* transport */ sipDotJsLib.libCoreTransportMod.Transport, 
    /* user */ sipDotJsLib.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser, 
    sipDotJsLib.libCoreTransactionsMod.NonInviteServerTransaction
  ] = js.native
}

