package typings
package sipDotJsLib.libTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Transactions", "ServerTransaction")
@js.native
abstract class ServerTransaction protected () extends Transaction {
  protected def this(_request: sipDotJsLib.libSIPMessageMod.IncomingRequest, transport: sipDotJsLib.libTransportMod.Transport, user: ServerTransactionUser, state: TransactionState, loggerCategory: java.lang.String) = this()
  var _request: js.Any = js.native
  /** The incoming request the transaction handling. */
  val request: sipDotJsLib.libSIPMessageMod.IncomingRequest = js.native
  var user: ServerTransactionUser = js.native
  /**
    * Receive incoming requests from the transport which match this transaction.
    * @param request The incoming request.
    */
  def receiveRequest(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Unit = js.native
  /**
    * Receive outgoing responses to this request from the transaction user.
    * Responses will be delivered to the transport as necessary.
    * @param statusCode Response status code.
    * @param response Response.
    */
  def receiveResponse(statusCode: scala.Double, response: java.lang.String): scala.Unit = js.native
}

