package typings
package sipDotJsLib.libCoreUserDashAgentsUserDashAgentDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/user-agents/user-agent-server", "UserAgentServer")
@js.native
class UserAgentServer protected ()
  extends sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest {
  def this(transactionConstructor: ServerTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libSIPMessageMod.IncomingRequest) = this()
  def this(transactionConstructor: ServerTransactionConstructor, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, delegate: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequestDelegate) = this()
  var _transaction: js.Any = js.native
  val acceptable: scala.Boolean = js.native
  var core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore = js.native
  var init: js.Any = js.native
  var logger: sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  val loggerFactory: sipDotJsLib.libLoggerFactoryMod.LoggerFactory = js.native
  val progressable: scala.Boolean = js.native
  val redirectable: scala.Boolean = js.native
  val rejectable: scala.Boolean = js.native
  /**
    * When a UAS wishes to construct a response to a request, it follows
    * the general procedures detailed in the following subsections.
    * Additional behaviors specific to the response code in question, which
    * are not detailed in this section, may also be required.
    *
    * Once all procedures associated with the creation of a response have
    * been completed, the UAS hands the response back to the server
    * transaction from which it received the request.
    * https://tools.ietf.org/html/rfc3261#section-8.2.6
    * @param statusCode Status code to reply with.
    * @param options Reply options bucket.
    */
  var reply: js.Any = js.native
  var toTag: java.lang.String = js.native
  /** The transaction associated with this request. */
  val transaction: sipDotJsLib.libCoreTransactionsMod.ServerTransaction = js.native
  var transactionConstructor: js.Any = js.native
  val tryingable: scala.Boolean = js.native
  def dispose(): scala.Unit = js.native
  /**
    * If the UAS did not find a matching transaction for the CANCEL
    * according to the procedure above, it SHOULD respond to the CANCEL
    * with a 481 (Call Leg/Transaction Does Not Exist).  If the transaction
    * for the original request still exists, the behavior of the UAS on
    * receiving a CANCEL request depends on whether it has already sent a
    * final response for the original request.  If it has, the CANCEL
    * request has no effect on the processing of the original request, no
    * effect on any session state, and no effect on the responses generated
    * for the original request.  If the UAS has not issued a final response
    * for the original request, its behavior depends on the method of the
    * original request.  If the original request was an INVITE, the UAS
    * SHOULD immediately respond to the INVITE with a 487 (Request
    * Terminated).  A CANCEL request has no impact on the processing of
    * transactions with any other method defined in this specification.
    * https://tools.ietf.org/html/rfc3261#section-9.2
    * @param request Incoming CANCEL request.
    */
  def receiveCancel(message: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Unit = js.native
}

