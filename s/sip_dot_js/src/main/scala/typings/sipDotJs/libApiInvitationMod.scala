package typings.sipDotJs

import typings.sipDotJs.libApiInvitationDashAcceptDashOptionsMod.InvitationAcceptOptions
import typings.sipDotJs.libApiInvitationDashProgressDashOptionsMod.InvitationProgressOptions
import typings.sipDotJs.libApiInvitationDashRejectDashOptionsMod.InvitationRejectOptions
import typings.sipDotJs.libApiSessionMod.Session
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/invitation", JSImport.Namespace)
@js.native
object libApiInvitationMod extends js.Object {
  @js.native
  class Invitation protected () extends Session {
    /** @internal */
    def this(userAgent: UserAgent, incomingInviteRequest: IncomingInviteRequest) = this()
    /**
      * A version of `accept` which resolves a session when the 200 Ok response is sent.
      * @param options - Options bucket.
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
      * @param options - Options bucket.
      */
    var _progress: js.Any = js.native
    /**
      * A version of `progress` which resolves when the reliable provisional response is sent.
      * @param options - Options bucket.
      */
    var _progressReliable: js.Any = js.native
    /**
      * A version of `progress` which resolves when the reliable provisional response is acknowledged.
      * @param options - Options bucket.
      */
    var _progressReliableWaitForPrack: js.Any = js.native
    /**
      * A version of `progress` which resolves when the provisional response with sdp is sent.
      * @param options - Options bucket.
      */
    var _progressWithSDP: js.Any = js.native
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
      * @internal
      */
    val autoSendAnInitialProvisionalResponse: Boolean = js.native
    /** @internal */
    @JSName("body")
    var body_Invitation: js.UndefOr[String] = js.native
    var handlePrackOfferAnswer: js.Any = js.native
    var incomingInviteRequest: js.Any = js.native
    /**
      * Callback for when ACK for a 2xx response is never received.
      * @param session - Session the ACK never arrived for.
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
    /** Incoming INVITE request message. */
    val request: IncomingRequestMessage = js.native
    var rseq: js.Any = js.native
    var waitForArrivalOfPrack: js.Any = js.native
    var waitingForPrackPromise: js.Any = js.native
    var waitingForPrackReject: js.Any = js.native
    var waitingForPrackResolve: js.Any = js.native
    /**
      * Accept the invitation.
      * @remarks
      * Accept the incoming INVITE request to start a Session.
      * Replies to the INVITE request with a 200 Ok response.
      * @param options - Options bucket.
      */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: InvitationAcceptOptions): js.Promise[Unit] = js.native
    /**
      * Handle CANCEL request.
      * @param message - CANCEL message.
      * @internal
      */
    def onCancel(message: IncomingRequestMessage): Unit = js.native
    /**
      * Indicate progress processing the invitation.
      * @remarks
      * Report progress to the the caller.
      * Replies to the INVITE request with a 1xx provisional response.
      * @param options - Options bucket.
      */
    def progress(): js.Promise[Unit] = js.native
    def progress(options: InvitationProgressOptions): js.Promise[Unit] = js.native
    /**
      * Reject the invitation.
      * @param options - Options bucket.
      */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: InvitationRejectOptions): js.Promise[Unit] = js.native
  }
  
}

