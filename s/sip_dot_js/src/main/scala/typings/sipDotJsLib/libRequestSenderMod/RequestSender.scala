package typings
package sipDotJsLib.libRequestSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/RequestSender", "RequestSender")
@js.native
class RequestSender protected () extends js.Object {
  def this(applicant: sipDotJsLib.libRequestSenderMod.RequestSenderNs.StreamlinedApplicant, ua: sipDotJsLib.libUAMod.UA) = this()
  var applicant: sipDotJsLib.libRequestSenderMod.RequestSenderNs.StreamlinedApplicant = js.native
  var challenged: js.Any = js.native
  var clientTransaction: js.UndefOr[
    sipDotJsLib.libTransactionsMod.InviteClientTransaction | sipDotJsLib.libTransactionsMod.NonInviteClientTransaction
  ] = js.native
  var credentials: js.Any = js.native
  var logger: js.Any = js.native
  var loggerFactory: sipDotJsLib.libLoggerFactoryMod.LoggerFactory = js.native
  var method: js.Any = js.native
  var request: js.Any = js.native
  var staled: js.Any = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  /**
    * Callback fired when receiving a request timeout error from the client transaction.
    * To be re-defined by the applicant.
    * @event
    */
  def onRequestTimeout(): scala.Unit = js.native
  /**
    * Callback fired when receiving a transport error from the client transaction.
    * To be re-defined by the applicant.
    * @event
    */
  def onTransportError(): scala.Unit = js.native
  /**
    * Called from client transaction when receiving a correct response to the request.
    * Authenticate request if needed or pass the response back to the applicant.
    * @param {SIP.IncomingResponse} response
    */
  def receiveResponse(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  /**
    * Create the client transaction and send the message.
    */
  def send(): sipDotJsLib.libTransactionsMod.InviteClientTransaction | sipDotJsLib.libTransactionsMod.NonInviteClientTransaction = js.native
}

