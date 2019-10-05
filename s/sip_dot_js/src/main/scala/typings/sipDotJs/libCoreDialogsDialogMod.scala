package typings.sipDotJs

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.URI
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs/dialog", JSImport.Namespace)
@js.native
object libCoreDialogsDialogMod extends js.Object {
  @js.native
  class Dialog protected () extends js.Object {
    /**
      * Dialog constructor.
      * @param core - User agent core.
      * @param dialogState - Initial dialog state.
      */
    protected def this(core: UserAgentCore, dialogState: DialogState) = this()
    /** Call identifier component of the dialog id. */
    val callId: String = js.native
    var core: UserAgentCore = js.native
    var dialogState: DialogState = js.native
    /**
      * A dialog can also be in the "early" state, which occurs when it is
      * created with a provisional response, and then it transition to the
      * "confirmed" state when a 2xx final response received or is sent.
      *
      * Note: RFC 3261 is concise on when a dialog is "confirmed", but it
      * can be a point of confusion if an INVITE dialog is "confirmed" after
      * a 2xx is sent or after receiving the ACK for the 2xx response.
      * With careful reading it can be inferred a dialog is always is
      * "confirmed" when the 2xx is sent (regardless of type of dialog).
      * However a INVITE dialog does have additional considerations
      * when it is confirmed but an ACK has not yet been received (in
      * particular with regard to a callee sending BYE requests).
      */
    val early: Boolean = js.native
    /**
      * A dialog is identified at each UA with a dialog ID, which consists of
      * a Call-ID value, a local tag and a remote tag.  The dialog ID at each
      * UA involved in the dialog is not the same.  Specifically, the local
      * tag at one UA is identical to the remote tag at the peer UA.  The
      * tags are opaque tokens that facilitate the generation of unique
      * dialog IDs.
      * https://tools.ietf.org/html/rfc3261#section-12
      */
    val id: String = js.native
    /** Local sequence number (used to order requests from the UA to its peer). */
    val localSequenceNumber: js.UndefOr[Double] = js.native
    /** Local tag component of the dialog id. */
    val localTag: String = js.native
    /** Local URI. */
    val localURI: URI = js.native
    /** Remote sequence number (used to order requests from its peer to the UA). */
    val remoteSequenceNumber: js.UndefOr[Double] = js.native
    /** Remote tag component of the dialog id. */
    val remoteTag: String = js.native
    /** Remote target. */
    val remoteTarget: URI = js.native
    /** Remote URI. */
    val remoteURI: URI = js.native
    /**
      * Route set, which is an ordered list of URIs. The route set is the
      * list of servers that need to be traversed to send a request to the peer.
      */
    val routeSet: js.Array[String] = js.native
    /**
      * If the request was sent over TLS, and the Request-URI contained
      * a SIPS URI, the "secure" flag is set to true. *NOT IMPLEMENTED*
      */
    val secure: Boolean = js.native
    /** The user agent core servicing this dialog. */
    val userAgentCore: UserAgentCore = js.native
    /** Confirm the dialog. Only matters if dialog is currently early. */
    def confirm(): Unit = js.native
    /**
      * A request within a dialog is constructed by using many of the
      * components of the state stored as part of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.2.1.1
      * @param method - Outgoing request method.
      */
    def createOutgoingRequestMessage(method: String): OutgoingRequestMessage = js.native
    def createOutgoingRequestMessage(method: String, options: Anon_BodyCseq): OutgoingRequestMessage = js.native
    /** Destructor. */
    def dispose(): Unit = js.native
    /**
      * Requests sent within a dialog, as any other requests, are atomic.  If
      * a particular request is accepted by the UAS, all the state changes
      * associated with it are performed.  If the request is rejected, none
      * of the state changes are performed.
      *
      *    Note that some requests, such as INVITEs, affect several pieces of
      *    state.
      *
      * https://tools.ietf.org/html/rfc3261#section-12.2.2
      * @param message - Incoming request message within this dialog.
      */
    def receiveRequest(message: IncomingRequestMessage): Unit = js.native
    /**
      * If the dialog identifier in the 2xx response matches the dialog
      * identifier of an existing dialog, the dialog MUST be transitioned to
      * the "confirmed" state, and the route set for the dialog MUST be
      * recomputed based on the 2xx response using the procedures of Section
      * 12.2.1.2.  Otherwise, a new dialog in the "confirmed" state MUST be
      * constructed using the procedures of Section 12.1.2.
      *
      * Note that the only piece of state that is recomputed is the route
      * set.  Other pieces of state such as the highest sequence numbers
      * (remote and local) sent within the dialog are not recomputed.  The
      * route set only is recomputed for backwards compatibility.  RFC
      * 2543 did not mandate mirroring of the Record-Route header field in
      * a 1xx, only 2xx.  However, we cannot update the entire state of
      * the dialog, since mid-dialog requests may have been sent within
      * the early dialog, modifying the sequence numbers, for example.
      *
      *  https://tools.ietf.org/html/rfc3261#section-13.2.2.4
      */
    def recomputeRouteSet(message: IncomingResponseMessage): Unit = js.native
    /**
      * If the remote sequence number was not empty, but the sequence number
      * of the request is lower than the remote sequence number, the request
      * is out of order and MUST be rejected with a 500 (Server Internal
      * Error) response.
      * https://tools.ietf.org/html/rfc3261#section-12.2.2
      * @param request - Incoming request to guard.
      * @returns True if the program execution is to continue in the branch in question.
      *          Otherwise a 500 Server Internal Error was stateless sent and request processing must stop.
      */
    /* protected */ def sequenceGuard(message: IncomingRequestMessage): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Dialog extends js.Object {
    /**
      * When a UAC receives a response that establishes a dialog, it
      * constructs the state of the dialog.  This state MUST be maintained
      * for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.2
      * @param outgoingRequestMessage - Outgoing request message for dialog.
      * @param incomingResponseMessage - Incoming response message creating dialog.
      */
    def initialDialogStateForUserAgentClient(outgoingRequestMessage: OutgoingRequestMessage, incomingResponseMessage: IncomingResponseMessage): DialogState = js.native
    /**
      * The UAS then constructs the state of the dialog.  This state MUST be
      * maintained for the duration of the dialog.
      * https://tools.ietf.org/html/rfc3261#section-12.1.1
      * @param incomingRequestMessage - Incoming request message creating dialog.
      * @param toTag - Tag in the To field in the response to the incoming request.
      */
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String): DialogState = js.native
    def initialDialogStateForUserAgentServer(incomingRequestMessage: IncomingRequestMessage, toTag: String, early: Boolean): DialogState = js.native
  }
  
}

