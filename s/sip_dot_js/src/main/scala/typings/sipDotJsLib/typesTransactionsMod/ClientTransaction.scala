package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "ClientTransaction")
@js.native
abstract class ClientTransaction () extends Transaction {
  /** The outgoing request the transaction handling. */
  val request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest = js.native
  /**
    * Receive incoming responses from the transport which match this transaction.
    * Responses will be delivered to the transaction user as necessary.
    * @param response The incoming response.
    */
  def receiveResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
}

