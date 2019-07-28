package typings.sipDotJs.libSessionMod

import typings.sipDotJs.Anon_Modifiers
import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typings.sipDotJs.libCoreMessagesMethodsPrackMod.IncomingPrackRequest
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMod.InviteServerTransaction
import typings.sipDotJs.libCoreMod.NonInviteServerTransaction
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typings.sipDotJs.libSessionMod.InviteServerContextNs.Options
import typings.sipDotJs.libUAMod.UA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.sipDotJs.libServerContextMod.ServerContext because Inheritance from two classes. Inlined incomingRequest, request, transaction, progress, progress, accept, accept, reject, reject, reply, reply, onRequestTimeout, onTransportError */ @JSImport("sip.js/lib/Session", "InviteServerContext")
@js.native
class InviteServerContext protected () extends Session {
  def this(ua: UA, incomingInviteRequest: IncomingInviteRequest) = this()
  /**
    * A version of `accept` which resolves a session when the 200 Ok response is sent.
    * @param options Options bucket.
    * @throws {ClosedSessionDescriptionHandlerError} The session description handler closed before method completed.
    * @throws {TransactionStateError} The transaction state does not allow for `accept()` to be called.
    *                                 Note that the transaction state can change while this call is in progress.
    */
  var _accept: js.Any = js.native
  /**
    * FIXME: TODO:
    * Used to squelch throwing of errors due to async race condition.
    * We have an internal race between calling `accept()` and handling
    * an incoming CANCEL request. As there is no good way currently to
    * delegate the handling of this async errors to the caller of
    * `accept()`, we are squelching the throwing ALL errors when
    * they occur after receiving a CANCEL to catch the ONE we know
    * is a "normal" exceptional condition. While this is a completely
    * reasonable appraoch, the decision should be left up to the library user.
    */
  var _canceled: js.Any = js.native
  /**
    * A version of `progress` which resolves when the provisional response is sent.
    * @param options Options bucket.
    * @throws {ClosedSessionDescriptionHandlerError} The session description handler closed before method completed.
    * @throws {TransactionStateError} The transaction state does not allow for `progress()` to be called.
    *                                 Note that the transaction state can change while this call is in progress.
    */
  var _progress: js.Any = js.native
  /**
    * A version of `progress` which resolves when the provisional response with sdp is sent.
    * @param options Options bucket.
    * @throws {ClosedSessionDescriptionHandlerError} The session description handler closed before method completed.
    * @throws {TransactionStateError} The transaction state does not allow for `progress()` to be called.
    *                                 Note that the transaction state can change while this call is in progress.
    */
  var _progressWithSDP: js.Any = js.native
  /**
    * A version of `progress` which resolves when the reliable provisional response is sent.
    * @param options Options bucket.
    * @throws {ClosedSessionDescriptionHandlerError} The session description handler closed before method completed.
    * @throws {TransactionStateError} The transaction state does not allow for `progress()` to be called.
    *                                 Note that the transaction state can change while this call is in progress.
    */
  var _reliableProgress: js.Any = js.native
  /**
    * A version of `progress` which resolves when the reliable provisional response is acknowledged.
    * @param options Options bucket.
    * @throws {ClosedSessionDescriptionHandlerError} The session description handler closed before method completed.
    * @throws {TransactionStateError} The transaction state does not allow for `progress()` to be called.
    *                                 Note that the transaction state can change while this call is in progress.
    */
  var _reliableProgressWaitForPrack: js.Any = js.native
  /**
    * If true, a first provisional response after the 100 Trying
    * will be sent automatically. This is false it the UAC required
    * reliable provisional responses (100rel in Require header),
    * otherwise it is true. The provisional is sent by calling
    * `progress()` without any options.
    *
    * FIXME: TODO: It seems reasonable that the ISC user should
    * be able to optionally disable this behavior. As the provisional
    * is sent prior to the "invite" event being emitted, it's a known
    * issue that the ISC user cannot register listeners or do any other
    * setup prior to the call to `progress()`. As an example why this is
    * an issue, setting `ua.configuration.rel100` to REQUIRED will result
    * in an attempt by `progress()` to send a 183 with SDP produced by
    * calling `getDescription()` on a session description handler, but
    * the ISC user cannot perform any potentially required session description
    * handler initialization (thus preventing the utilization of setting
    * `ua.configuration.rel100` to REQUIRED). That begs the question of
    * why this behavior is disabled when the UAC requires 100rel but not
    * when the UAS requires 100rel? But ignoring that, it's just one example
    * of a class of cases where the ISC user needs to do something prior
    * to the first call to `progress()` and is unable to do so.
    */
  val autoSendAnInitialProvisionalResponse: Boolean = js.native
  var getOffer: js.Any = js.native
  var getSessionDescriptionHandler: js.Any = js.native
  var incomingRequest: IncomingInviteRequest | IncomingRequest = js.native
  /**
    * Callback for when ACK for a 2xx response is never received.
    * @param session Session the ACK never arrived for
    */
  var onAckTimeout: js.Any = js.native
  /**
    * FIXME: TODO: The current library interface presents async methods without a
    * proper async error handling mechanism. Arguably a promise based interface
    * would be an improvement over the pattern of returning `this`. The approach has
    * been generally along the lines of log a error and terminate.
    */
  var onContextError: js.Any = js.native
  var prackArrived: js.Any = js.native
  var prackNeverArrived: js.Any = js.native
  var request: IncomingRequestMessage = js.native
  var rseq: js.Any = js.native
  var setAnswer: js.Any = js.native
  var setOfferAndGetAnswer: js.Any = js.native
  var transaction: InviteServerTransaction | NonInviteServerTransaction = js.native
  /**
    * @throws {Exceptions.TerminatedSessionError} The session terminated before being accepted (i.e. cancel arrived).
    */
  var waitForArrivalOfPrack: js.Any = js.native
  var waitingForPrackPromise: js.Any = js.native
  var waitingForPrackReject: js.Any = js.native
  var waitingForPrackResolve: js.Any = js.native
  /**
    * Accept the incoming INVITE request to start a Session.
    * Replies to the INVITE request with a 200 Ok response.
    * @param options Options bucket.
    */
  def accept(): this.type = js.native
  def accept(options: js.Any): js.Any = js.native
  def accept(options: Options): this.type = js.native
  @JSName("accept")
  def accept_Any(): js.Any = js.native
  /* protected */ def generateResponseOfferAnswer(options: Anon_Modifiers): js.Promise[js.UndefOr[Body]] = js.native
  /* protected */ def handlePrackOfferAnswer(request: IncomingPrackRequest, options: Anon_Modifiers): js.Promise[js.UndefOr[Body]] = js.native
  def onCancel(message: IncomingRequestMessage): Unit = js.native
  /**
    * Report progress to the the caller.
    * Replies to the INVITE request with a 1xx provisional response.
    * @param options Options bucket.
    */
  def progress(): this.type = js.native
  def progress(options: js.Any): js.Any = js.native
  def progress(options: Options): this.type = js.native
  @JSName("progress")
  def progress_Any(): js.Any = js.native
  def reject(): this.type = js.native
  def reject(options: js.Any): js.Any = js.native
  def reject(options: Options): this.type = js.native
  @JSName("reject")
  def reject_Any(): js.Any = js.native
  def reply(): this.type = js.native
  def reply(options: js.Any): this.type = js.native
  @JSName("reply")
  def reply_Any(): js.Any = js.native
  @JSName("reply")
  def reply_Any(options: js.Any): js.Any = js.native
  /* protected */ def setupSessionDescriptionHandler(): SessionDescriptionHandler = js.native
}

