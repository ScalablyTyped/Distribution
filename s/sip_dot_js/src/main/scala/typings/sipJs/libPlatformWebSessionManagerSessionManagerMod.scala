package typings.sipJs

import typings.sipJs.libApiInvitationAcceptOptionsMod.InvitationAcceptOptions
import typings.sipJs.libApiInviterInviteOptionsMod.InviterInviteOptions
import typings.sipJs.libApiInviterMod.Inviter
import typings.sipJs.libApiInviterOptionsMod.InviterOptions
import typings.sipJs.libApiRegistererRegisterOptionsMod.RegistererRegisterOptions
import typings.sipJs.libApiRegistererUnregisterOptionsMod.RegistererUnregisterOptions
import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libApiSessionReferOptionsMod.SessionReferOptions
import typings.sipJs.libApiUserAgentMod.UserAgent
import typings.sipJs.libPlatformWebSessionManagerManagedSessionMod.ManagedSession
import typings.sipJs.libPlatformWebSessionManagerSessionManagerDelegateMod.SessionManagerDelegate
import typings.sipJs.libPlatformWebSessionManagerSessionManagerOptionsMod.SessionManagerOptions
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionManagerSessionManagerMod {
  
  @JSImport("sip.js/lib/platform/web/session-manager/session-manager", "SessionManager")
  @js.native
  open class SessionManager protected () extends StObject {
    /**
      * Constructs a new instance of the `SessionManager` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SessionManagerOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SessionManagerOptions) = this()
    
    /**
      * Answer an incoming call.
      * @param session - Session to answer.
      * @remarks
      * Accept an incoming INVITE request creating a new Session.
      * Resolves with the response is sent, otherwise rejects.
      * Use `onCallAnswered` delegate method to determine if and when call is established.
      * @param invitationAcceptOptions - Optional options for Inviter.accept().
      */
    def answer(session: Session): js.Promise[Unit] = js.native
    def answer(session: Session, invitationAcceptOptions: InvitationAcceptOptions): js.Promise[Unit] = js.native
    
    /**
      * Attempt reconnection up to `reconnectionAttempts` times.
      * @param reconnectionAttempt - Current attempt number.
      */
    /* private */ var attemptReconnection: Any = js.native
    
    /**
      * Register to receive calls.
      * @param withoutDelay - If true attempt immediately, otherwise wait `registrationRetryInterval`.
      */
    /* private */ var attemptRegistration: Any = js.native
    
    /* private */ var attemptingReconnection: Any = js.native
    
    /**
      * Make an outgoing call.
      * @remarks
      * Send an INVITE request to create a new Session.
      * Resolves when the INVITE request is sent, otherwise rejects.
      * Use `onCallAnswered` delegate method to determine if Session is established.
      * @param destination - The target destination to call. A SIP address to send the INVITE to.
      * @param inviterOptions - Optional options for Inviter constructor.
      * @param inviterInviteOptions - Optional options for Inviter.invite().
      */
    def call(destination: String): js.Promise[Inviter] = js.native
    def call(destination: String, inviterOptions: Unit, inviterInviteOptions: InviterInviteOptions): js.Promise[Inviter] = js.native
    def call(destination: String, inviterOptions: InviterOptions): js.Promise[Inviter] = js.native
    def call(destination: String, inviterOptions: InviterOptions, inviterInviteOptions: InviterInviteOptions): js.Promise[Inviter] = js.native
    
    /** Helper function to remove media from html elements. */
    /* private */ var cleanupMedia: Any = js.native
    
    /**
      * Connect.
      * @remarks
      * If not started, starts the UserAgent connecting the WebSocket Transport.
      * Otherwise reconnects the UserAgent's WebSocket Transport.
      * Attempts will be made to reconnect as needed.
      */
    def connect(): js.Promise[Unit] = js.native
    
    /** Media constraints. */
    /* private */ def constraints: Any = js.native
    
    /**
      * Decline an incoming call.
      * @param session - Session to decline.
      * @remarks
      * Reject an incoming INVITE request.
      * Resolves with the response is sent, otherwise rejects.
      * Use `onCallHangup` delegate method to determine if and when call is ended.
      */
    def decline(session: Session): js.Promise[Unit] = js.native
    
    /** Delegate. */
    var delegate: js.UndefOr[SessionManagerDelegate] = js.native
    
    /**
      * Disconnect.
      * @remarks
      * If not stopped, stops the UserAgent disconnecting the WebSocket Transport.
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    /** Helper function to enable/disable media tracks. */
    /* private */ var enableReceiverTracks: Any = js.native
    
    /** Helper function to enable/disable media tracks. */
    /* private */ var enableSenderTracks: Any = js.native
    
    /**
      * The local audio track, if available.
      * @param session - Session to get track from.
      * @deprecated Use localMediaStream and get track from the stream.
      */
    def getLocalAudioTrack(session: Session): js.UndefOr[MediaStreamTrack] = js.native
    
    /**
      * The local media stream. Undefined if call not answered.
      * @param session - Session to get the media stream from.
      */
    def getLocalMediaStream(session: Session): js.UndefOr[MediaStream] = js.native
    
    /**
      * The local video track, if available.
      * @param session - Session to get track from.
      * @deprecated Use localMediaStream and get track from the stream.
      */
    def getLocalVideoTrack(session: Session): js.UndefOr[MediaStreamTrack] = js.native
    
    /**
      * The remote audio track, if available.
      * @param session - Session to get track from.
      * @deprecated Use remoteMediaStream and get track from the stream.
      */
    def getRemoteAudioTrack(session: Session): js.UndefOr[MediaStreamTrack] = js.native
    
    /**
      * The remote media stream. Undefined if call not answered.
      * @param session - Session to get the media stream from.
      */
    def getRemoteMediaStream(session: Session): js.UndefOr[MediaStream] = js.native
    
    /**
      * The remote video track, if available.
      * @param session - Session to get track from.
      * @deprecated Use remoteMediaStream and get track from the stream.
      */
    def getRemoteVideoTrack(session: Session): js.UndefOr[MediaStreamTrack] = js.native
    
    /**
      * Hangup a call.
      * @param session - Session to hangup.
      * @remarks
      * Send a BYE request, CANCEL request or reject response to end the current Session.
      * Resolves when the request/response is sent, otherwise rejects.
      * Use `onCallHangup` delegate method to determine if and when call is ended.
      */
    def hangup(session: Session): js.Promise[Unit] = js.native
    
    /**
      * Hold call
      * @param session - Session to hold.
      * @remarks
      * Send a re-INVITE with new offer indicating "hold".
      * Resolves when the re-INVITE request is sent, otherwise rejects.
      * Use `onCallHold` delegate method to determine if request is accepted or rejected.
      * See: https://tools.ietf.org/html/rfc6337
      */
    def hold(session: Session): js.Promise[Unit] = js.native
    
    /**
      * Setup session delegate and state change handler.
      * @param session - Session to setup.
      * @param referralInviterOptions - Options for any Inviter created as result of a REFER.
      */
    /* private */ var initSession: Any = js.native
    
    /**
      * Return true if transport is connected.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Hold state.
      * @param session - Session to check.
      * @remarks
      * True if session is on hold.
      */
    def isHeld(session: Session): Boolean = js.native
    
    /**
      * Mute state.
      * @param session - Session to check.
      * @remarks
      * True if sender's media track is disabled.
      */
    def isMuted(session: Session): Boolean = js.native
    
    /* private */ var logger: Any = js.native
    
    /** Sessions being managed. */
    var managedSessions: js.Array[ManagedSession] = js.native
    
    /**
      * Send a message.
      * @remarks
      * Send a MESSAGE request.
      * @param destination - The target destination for the message. A SIP address to send the MESSAGE to.
      */
    def message(destination: String, message: String): js.Promise[Unit] = js.native
    
    /**
      * Mute call.
      * @param session - Session to mute.
      * @remarks
      * Disable sender's media tracks.
      */
    def mute(session: Session): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var optionsPingFailure: Any = js.native
    
    /* private */ var optionsPingRequest: Any = js.native
    
    /**
      * Periodically send OPTIONS pings and disconnect when a ping fails.
      * @param requestURI - Request URI to target
      * @param fromURI - From URI
      * @param toURI - To URI
      */
    /* private */ var optionsPingRun: Any = js.native
    
    /* private */ var optionsPingRunning: Any = js.native
    
    /**
      * Start sending OPTIONS pings.
      */
    /* private */ var optionsPingStart: Any = js.native
    
    /**
      * Stop sending OPTIONS pings.
      */
    /* private */ var optionsPingStop: Any = js.native
    
    /* private */ var optionsPingTimeout: Any = js.native
    
    /**
      * Start receiving incoming calls.
      * @remarks
      * Send a REGISTER request for the UserAgent's AOR.
      * Resolves when the REGISTER request is sent, otherwise rejects.
      * Attempts will be made to re-register as needed.
      */
    def register(): js.Promise[Unit] = js.native
    def register(registererRegisterOptions: RegistererRegisterOptions): js.Promise[Unit] = js.native
    
    /* private */ var registerer: Any = js.native
    
    /* private */ var registererOptions: Any = js.native
    
    /* private */ var registererRegisterOptions: Any = js.native
    
    /* private */ var registrationAttemptTimeout: Any = js.native
    
    /**
      * Send DTMF.
      * @param session - Session to send on.
      * @remarks
      * Send an INFO request with content type application/dtmf-relay.
      * @param tone - Tone to send.
      */
    def sendDTMF(session: Session, tone: String): js.Promise[Unit] = js.native
    
    /** Helper function to init send then send invite. */
    /* private */ var sendInvite: Any = js.native
    
    /** Helper function to add a session to the ones we are managing. */
    /* private */ var sessionAdd: Any = js.native
    
    /** Helper function to check if the session is one we are managing. */
    /* private */ var sessionExists: Any = js.native
    
    /** Helper function to check if the session is one we are managing. */
    /* private */ var sessionManaged: Any = js.native
    
    /** Helper function to remoce a session from the ones we are managing. */
    /* private */ var sessionRemove: Any = js.native
    
    /**
      * Puts Session on hold.
      * @param session - The session to set.
      * @param hold - Hold on if true, off if false.
      */
    /* private */ var setHold: Any = js.native
    
    /**
      * Puts Session on mute.
      * @param session - The session to mute.
      * @param mute - Mute on if true, off if false.
      */
    /* private */ var setMute: Any = js.native
    
    /** Helper function to attach local media to html elements. */
    /* private */ var setupLocalMedia: Any = js.native
    
    /** Helper function to attach remote media to html elements. */
    /* private */ var setupRemoteMedia: Any = js.native
    
    /* private */ var shouldBeConnected: Any = js.native
    
    /* private */ var shouldBeRegistered: Any = js.native
    
    /**
      * End a session.
      * @param session - The session to terminate.
      * @remarks
      * Send a BYE request, CANCEL request or reject response to end the current Session.
      * Resolves when the request/response is sent, otherwise rejects.
      * Use `onCallHangup` delegate method to determine if and when Session is terminated.
      */
    /* private */ var terminate: Any = js.native
    
    def transfer(session: Session, target: String): js.Promise[Unit] = js.native
    def transfer(session: Session, target: String, options: SessionReferOptions): js.Promise[Unit] = js.native
    /**
      * Transfer.
      * @param session - Session with the transferee to transfer.
      * @param target - The referral target.
      * @remarks
      * If target is a Session this is an attended transfer completion (REFER with Replaces),
      * otherwise this is a blind transfer (REFER). Attempting an attended transfer
      * completion on a call that has not been answered will be rejected. To implement
      * an attended transfer with early completion, hangup the call with the target
      * and execute a blind transfer to the target.
      */
    def transfer(session: Session, target: Session): js.Promise[Unit] = js.native
    def transfer(session: Session, target: Session, options: SessionReferOptions): js.Promise[Unit] = js.native
    
    /**
      * Unhold call.
      * @param session - Session to unhold.
      * @remarks
      * Send a re-INVITE with new offer indicating "unhold".
      * Resolves when the re-INVITE request is sent, otherwise rejects.
      * Use `onCallHold` delegate method to determine if request is accepted or rejected.
      * See: https://tools.ietf.org/html/rfc6337
      */
    def unhold(session: Session): js.Promise[Unit] = js.native
    
    /**
      * Unmute call.
      * @param session - Session to unmute.
      * @remarks
      * Enable sender's media tracks.
      */
    def unmute(session: Session): Unit = js.native
    
    /**
      * Stop receiving incoming calls.
      * @remarks
      * Send an un-REGISTER request for the UserAgent's AOR.
      * Resolves when the un-REGISTER request is sent, otherwise rejects.
      */
    def unregister(): js.Promise[Unit] = js.native
    def unregister(registererUnregisterOptions: RegistererUnregisterOptions): js.Promise[Unit] = js.native
    
    /** User agent which created sessions being managed. */
    var userAgent: UserAgent = js.native
  }
  /* static members */
  object SessionManager {
    
    @JSImport("sip.js/lib/platform/web/session-manager/session-manager", "SessionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/platform/web/session-manager/session-manager", "SessionManager.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: Any = js.native
    inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
}
