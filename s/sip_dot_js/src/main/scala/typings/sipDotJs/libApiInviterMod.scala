package typings.sipDotJs

import typings.sipDotJs.libApiInviterDashCancelDashOptionsMod.InviterCancelOptions
import typings.sipDotJs.libApiInviterDashInviteDashOptionsMod.InviterInviteOptions
import typings.sipDotJs.libApiInviterDashOptionsMod.InviterOptions
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.BodyAndContentType
import typings.sipDotJs.libApiSessionMod.Session
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest
import typings.sipDotJs.libCoreMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/inviter", JSImport.Namespace)
@js.native
object libApiInviterMod extends js.Object {
  @js.native
  class Inviter protected () extends Session {
    /**
      * Constructs a new instance of the `Inviter` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param options - Options bucket. See {@link InviterOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI) = this()
    def this(userAgent: UserAgent, targetURI: URI, options: InviterOptions) = this()
    /** @internal */
    @JSName("body")
    var body_Inviter: js.UndefOr[BodyAndContentType] = js.native
    var disposeEarlyMedia: js.Any = js.native
    var earlyMedia: js.Any = js.native
    var earlyMediaDialog: js.Any = js.native
    var earlyMediaSessionDescriptionHandlers: js.Any = js.native
    var inviteWithoutSdp: js.Any = js.native
    /** True if cancel() was called. */
    /** @internal */
    var isCanceled: Boolean = js.native
    var notifyReferer: js.Any = js.native
    /**
      * Handle final response to initial INVITE.
      * @param inviteResponse - 2xx response.
      */
    var onAccept: js.Any = js.native
    /**
      * Handle provisional response to initial INVITE.
      * @param inviteResponse - 1xx response.
      */
    var onProgress: js.Any = js.native
    /**
      * Handle final response to initial INVITE.
      * @param inviteResponse - 3xx response.
      */
    var onRedirect: js.Any = js.native
    /**
      * Handle final response to initial INVITE.
      * @param inviteResponse - 4xx, 5xx, or 6xx response.
      */
    var onReject: js.Any = js.native
    /**
      * Handle final response to initial INVITE.
      * @param inviteResponse - 100 response.
      */
    var onTrying: js.Any = js.native
    var outgoingInviteRequest: js.Any = js.native
    /** If this Inviter was created as a result of a REFER, the reffered Session. Otherwise undefined. */
    /** @internal */
    var referred: js.UndefOr[Session] = js.native
    /** @internal */
    var request: OutgoingRequestMessage = js.native
    /**
      * 13.2.1 Creating the Initial INVITE
      *
      * Since the initial INVITE represents a request outside of a dialog,
      * its construction follows the procedures of Section 8.1.1.  Additional
      * processing is required for the specific case of INVITE.
      *
      * An Allow header field (Section 20.5) SHOULD be present in the INVITE.
      * It indicates what methods can be invoked within a dialog, on the UA
      * sending the INVITE, for the duration of the dialog.  For example, a
      * UA capable of receiving INFO requests within a dialog [34] SHOULD
      * include an Allow header field listing the INFO method.
      *
      * A Supported header field (Section 20.37) SHOULD be present in the
      * INVITE.  It enumerates all the extensions understood by the UAC.
      *
      * An Accept (Section 20.1) header field MAY be present in the INVITE.
      * It indicates which Content-Types are acceptable to the UA, in both
      * the response received by it, and in any subsequent requests sent to
      * it within dialogs established by the INVITE.  The Accept header field
      * is especially useful for indicating support of various session
      * description formats.
      *
      * The UAC MAY add an Expires header field (Section 20.19) to limit the
      * validity of the invitation.  If the time indicated in the Expires
      * header field is reached and no final answer for the INVITE has been
      * received, the UAC core SHOULD generate a CANCEL request for the
      * INVITE, as per Section 9.
      *
      * A UAC MAY also find it useful to add, among others, Subject (Section
      * 20.36), Organization (Section 20.25) and User-Agent (Section 20.41)
      * header fields.  They all contain information related to the INVITE.
      *
      * The UAC MAY choose to add a message body to the INVITE.  Section
      * 8.1.1.10 deals with how to construct the header fields -- Content-
      * Type among others -- needed to describe the message body.
      *
      * https://tools.ietf.org/html/rfc3261#section-13.2.1
      */
    var sendInvite: js.Any = js.native
    /**
      * Cancels the INVITE request.
      * @param options - Options bucket.
      */
    def cancel(): js.Promise[Unit] = js.native
    def cancel(options: InviterCancelOptions): js.Promise[Unit] = js.native
    def invite(options: InviterInviteOptions): js.Promise[OutgoingInviteRequest] = js.native
  }
  
}

