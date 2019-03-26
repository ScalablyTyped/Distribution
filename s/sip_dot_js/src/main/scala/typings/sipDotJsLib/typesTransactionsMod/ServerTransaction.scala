package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "ServerTransaction")
@js.native
abstract class ServerTransaction () extends Transaction {
  /** The incoming request the transaction handling. */
  val request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest = js.native
  /**
    * Receive incoming requests from the transport which match this transaction.
    * @param request The incoming request.
    */
  def receiveRequest(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest): scala.Unit = js.native
  /**
    * Receive outgoing responses to this request from the transaction user.
    * Responses will be delivered to the transport as necessary.
    * @param statusCode Response status code.
    * @param response Response.
    */
  def receiveResponse(statusCode: scala.Double, response: java.lang.String): scala.Unit = js.native
}

