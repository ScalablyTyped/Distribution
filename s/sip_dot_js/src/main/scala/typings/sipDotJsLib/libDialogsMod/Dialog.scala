package typings
package sipDotJsLib.libDialogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Dialogs", "Dialog")
@js.native
class Dialog protected () extends js.Object {
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  var callId: js.Any = js.native
  var error: js.Any = js.native
  var id: sipDotJsLib.Anon_CallId = js.native
  var inviteSeqnum: scala.Double = js.native
  var localSeqnum: scala.Double = js.native
  var localTag: js.Any = js.native
  var localUri: sipDotJsLib.libURIMod.URI = js.native
  var logger: js.Any = js.native
  var owner: sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext | sipDotJsLib.libSubscriptionMod.Subscription = js.native
  var pracked: js.Array[java.lang.String] = js.native
  var remoteSeqnum: js.Any = js.native
  var remoteTag: js.Any = js.native
  var remoteTarget: java.lang.String = js.native
  var remoteUri: sipDotJsLib.libURIMod.URI = js.native
  var routeSet: js.Array[java.lang.String] = js.native
  var sessionDescriptionHandler: js.UndefOr[sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler] = js.native
  var state: sipDotJsLib.libEnumsMod.DialogStatus = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var uacPendingReply: scala.Boolean = js.native
  var uasPendingReply: js.Any = js.native
  /**
    * @param {SIP.IncomingRequest} request
    * @returns {Boolean}
    */
  def checkInDialogRequest(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Boolean = js.native
  /**
    * @param {String} method request method
    * @param {Object} extraHeaders extra headers
    * @returns {SIP.OutgoingRequest}
    */
  def createRequest(method: java.lang.String, extraHeaders: js.Array[java.lang.String], body: java.lang.String): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def createRequest(method: java.lang.String, extraHeaders: js.UndefOr[scala.Nothing], body: java.lang.String): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  /**
    * @param {SIP.IncomingRequest} request
    */
  def receiveRequest(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Unit = js.native
  def sendRequest(applicant: sipDotJsLib.libSessionDTMFMod.DTMF, method: java.lang.String): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def sendRequest(applicant: sipDotJsLib.libSessionDTMFMod.DTMF, method: java.lang.String, options: js.Any): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def sendRequest(applicant: sipDotJsLib.libSessionMod.InviteClientContext, method: java.lang.String): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def sendRequest(
    applicant: sipDotJsLib.libSessionMod.InviteClientContext,
    method: java.lang.String,
    options: js.Any
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def sendRequest(applicant: sipDotJsLib.libSubscriptionMod.Subscription, method: java.lang.String): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def sendRequest(applicant: sipDotJsLib.libSubscriptionMod.Subscription, method: java.lang.String, options: js.Any): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def terminate(): scala.Unit = js.native
  /**
    * @param {SIP.IncomingMessage} message
    * @param {Enum} UAC/UAS
    */
  @JSName("update")
  def update_UAC(message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC): scala.Unit = js.native
  @JSName("update")
  def update_UAC(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC): scala.Unit = js.native
  @JSName("update")
  def update_UAS(message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS): scala.Unit = js.native
  @JSName("update")
  def update_UAS(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS): scala.Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/Dialogs", "Dialog")
@js.native
object Dialog extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DialogStatus */ js.Any = js.native
}

