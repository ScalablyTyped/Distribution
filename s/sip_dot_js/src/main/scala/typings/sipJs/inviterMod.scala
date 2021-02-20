package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.BodyAndContentType
import typings.sipJs.coreMod.NameAddrHeader
import typings.sipJs.coreMod.OutgoingRequestMessage
import typings.sipJs.coreMod.URI
import typings.sipJs.inviteMod.OutgoingInviteRequest
import typings.sipJs.inviterCancelOptionsMod.InviterCancelOptions
import typings.sipJs.inviterInviteOptionsMod.InviterInviteOptions
import typings.sipJs.inviterOptionsMod.InviterOptions
import typings.sipJs.sessionMod.Session
import typings.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inviterMod {
  
  @JSImport("sip.js/lib/api/inviter", "Inviter")
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
    
    /**
      * If this Inviter was created as a result of a REFER, the referred Session. Otherwise undefined.
      * @internal
      */
    var _referred: js.UndefOr[Session] = js.native
    
    /**
      * Initial outgoing INVITE request message body.
      */
    def body: js.UndefOr[BodyAndContentType] = js.native
    
    /**
      * Cancels the INVITE request.
      *
      * @remarks
      * Sends a CANCEL request.
      * Resolves once the response sent, otherwise rejects.
      *
      * After sending a CANCEL request the expectation is that a 487 final response
      * will be received for the INVITE. However a 200 final response to the INVITE
      * may nonetheless arrive (it's a race between the CANCEL reaching the UAS before
      * the UAS sends a 200) in which case an ACK & BYE will be sent. The net effect
      * is that this method will terminate the session regardless of the race.
      * @param options - Options bucket.
      */
    def cancel(): js.Promise[Unit] = js.native
    def cancel(options: InviterCancelOptions): js.Promise[Unit] = js.native
    
    var disposeEarlyMedia: js.Any = js.native
    
    /** True if dispose() has been called. */
    var disposed: js.Any = js.native
    
    /** True if early media use is enabled. */
    var earlyMedia: js.Any = js.native
    
    /** The early media session. */
    var earlyMediaDialog: js.Any = js.native
    
    /** The early media session description handlers. */
    var earlyMediaSessionDescriptionHandlers: js.Any = js.native
    
    /** Our From tag. */
    var fromTag: js.Any = js.native
    
    def invite(options: InviterInviteOptions): js.Promise[OutgoingInviteRequest] = js.native
    
    /** True if initial INVITE without SDP. */
    var inviteWithoutSdp: js.Any = js.native
    
    /** True if cancel() was called. */
    var isCanceled: js.Any = js.native
    
    /**
      * The identity of the local user.
      */
    @JSName("localIdentity")
    def localIdentity_MInviter: NameAddrHeader = js.native
    
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
    
    /** Initial INVITE request sent by core. Undefined until sent. */
    var outgoingInviteRequest: js.Any = js.native
    
    /** Initial INVITE message provided to core to send. */
    var outgoingRequestMessage: js.Any = js.native
    
    /**
      * The identity of the remote user.
      */
    @JSName("remoteIdentity")
    def remoteIdentity_MInviter: NameAddrHeader = js.native
    
    /**
      * Initial outgoing INVITE request message.
      */
    def request: OutgoingRequestMessage = js.native
    
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
  }
}
