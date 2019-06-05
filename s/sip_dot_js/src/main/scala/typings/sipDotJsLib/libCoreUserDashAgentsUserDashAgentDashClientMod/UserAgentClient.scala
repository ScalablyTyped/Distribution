package typings
package sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/user-agents/user-agent-client", "UserAgentClient")
@js.native
class UserAgentClient protected ()
  extends sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequest {
  def this(transactionConstructor: ClientTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage) = this()
  def this(transactionConstructor: ClientTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage, delegate: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate) = this()
  var _transaction: js.Any = js.native
  var challenged: js.Any = js.native
  var core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore = js.native
  var credentials: js.Any = js.native
  @JSName("delegate")
  var delegate_UserAgentClient: js.UndefOr[sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate] = js.native
  var init: js.Any = js.native
  var logger: sipDotJsLib.libCoreLogMod.Logger = js.native
  val loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory = js.native
  @JSName("message")
  var message_UserAgentClient: sipDotJsLib.libCoreMessagesMod.OutgoingRequestMessage = js.native
  /**
    * 8.1.3.1 Transaction Layer Errors
    * In some cases, the response returned by the transaction layer will
    * not be a SIP message, but rather a transaction layer error.  When a
    * timeout error is received from the transaction layer, it MUST be
    * treated as if a 408 (Request Timeout) status code has been received.
    * If a fatal transport error is reported by the transport layer
    * (generally, due to fatal ICMP errors in UDP or connection failures in
    * TCP), the condition MUST be treated as a 503 (Service Unavailable)
    * status code.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    */
  var onRequestTimeout: js.Any = js.native
  /**
    * 8.1.3.1 Transaction Layer Errors
    * In some cases, the response returned by the transaction layer will
    * not be a SIP message, but rather a transaction layer error.  When a
    * timeout error is received from the transaction layer, it MUST be
    * treated as if a 408 (Request Timeout) status code has been received.
    * If a fatal transport error is reported by the transport layer
    * (generally, due to fatal ICMP errors in UDP or connection failures in
    * TCP), the condition MUST be treated as a 503 (Service Unavailable)
    * status code.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    */
  var onTransportError: js.Any = js.native
  var stale: js.Any = js.native
  /** The transaction associated with this request. */
  val transaction: sipDotJsLib.libCoreTransactionsMod.ClientTransaction = js.native
  var transactionConstructor: js.Any = js.native
  /**
    * If a 401 (Unauthorized) or 407 (Proxy Authentication Required)
    * response is received, the UAC SHOULD follow the authorization
    * procedures of Section 22.2 and Section 22.3 to retry the request with
    * credentials.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.5
    * 22 Usage of HTTP Authentication
    * https://tools.ietf.org/html/rfc3261#section-22
    * 22.1 Framework
    * https://tools.ietf.org/html/rfc3261#section-22.1
    * 22.2 User-to-User Authentication
    * https://tools.ietf.org/html/rfc3261#section-22.2
    * 22.3 Proxy-to-User Authentication
    * https://tools.ietf.org/html/rfc3261#section-22.3
    *
    * FIXME: This "guard for and retry the request with credentials"
    * implementation is not complete and at best minimally passable.
    * @param response The incoming response to guard.
    * @returns True if the program execution is to continue in the branch in question.
    *          Otherwise the request is retried with credentials and current request processing must stop.
    */
  /* protected */ def authenticationGuard(message: sipDotJsLib.libCoreMessagesMod.IncomingResponseMessage): scala.Boolean = js.native
  /**
    * Receive a response from the transaction layer.
    * @param message Incoming response message.
    */
  /* protected */ def receiveResponse(message: sipDotJsLib.libCoreMessagesMod.IncomingResponseMessage): scala.Unit = js.native
}

