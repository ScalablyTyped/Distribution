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
    /* request */ sipDotJsLib.libSIPMessageMod.OutgoingRequest, 
    /* transport */ sipDotJsLib.libTransportMod.Transport, 
    /* user */ sipDotJsLib.libTransactionsMod.ClientTransactionUser, 
    sipDotJsLib.libTransactionsMod.InviteClientTransaction
  ] = js.native
  var InviteServerTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libSIPMessageMod.IncomingRequest, 
    /* transport */ sipDotJsLib.libTransportMod.Transport, 
    /* user */ sipDotJsLib.libTransactionsMod.ServerTransactionUser, 
    sipDotJsLib.libTransactionsMod.InviteServerTransaction
  ] = js.native
  var NonInviteClientTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libSIPMessageMod.OutgoingRequest, 
    /* transport */ sipDotJsLib.libTransportMod.Transport, 
    /* user */ sipDotJsLib.libTransactionsMod.ClientTransactionUser, 
    sipDotJsLib.libTransactionsMod.NonInviteClientTransaction
  ] = js.native
  var NonInviteServerTransaction: org.scalablytyped.runtime.Instantiable3[
    /* request */ sipDotJsLib.libSIPMessageMod.IncomingRequest, 
    /* transport */ sipDotJsLib.libTransportMod.Transport, 
    /* user */ sipDotJsLib.libTransactionsMod.ServerTransactionUser, 
    sipDotJsLib.libTransactionsMod.NonInviteServerTransaction
  ] = js.native
}

