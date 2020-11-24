package typings.sipJs

import typings.sipJs.invitationAcceptOptionsMod.InvitationAcceptOptions
import typings.sipJs.inviterInviteOptionsMod.InviterInviteOptions
import typings.sipJs.inviterOptionsMod.InviterOptions
import typings.sipJs.registererOptionsMod.RegistererOptions
import typings.sipJs.registererRegisterOptionsMod.RegistererRegisterOptions
import typings.sipJs.registererUnregisterOptionsMod.RegistererUnregisterOptions
import typings.sipJs.simpleUserDelegateMod.SimpleUserDelegate
import typings.sipJs.simpleUserOptionsMod.SimpleUserOptions
import typings.std.MediaStream
import typings.std.MediaStreamTrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/platform/web/simple-user/simple-user", JSImport.Namespace)
@js.native
object simpleUserSimpleUserMod extends js.Object {
  
  @js.native
  class SimpleUser protected () extends js.Object {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
    
    /**
      * Answer an incoming call.
      * @remarks
      * Accept an incoming INVITE request creating a new Session.
      * Resolves with the response is sent, otherwise rejects.
      * Use `onCallAnswered` delegate method to determine if and when call is established.
      * @param invitationAcceptOptions - Optional options for Inviter.accept().
      */
    def answer(): js.Promise[Unit] = js.native
    def answer(invitationAcceptOptions: InvitationAcceptOptions): js.Promise[Unit] = js.native
    
    /**
      * Attempt reconnection up to `maxReconnectionAttempts` times.
      * @param reconnectionAttempt - Current attempt number.
      */
    var attemptReconnection: js.Any = js.native
    
    var attemptingReconnection: js.Any = js.native
    
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
    def call(destination: String): js.Promise[Unit] = js.native
    def call(
      destination: String,
      inviterOptions: js.UndefOr[scala.Nothing],
      inviterInviteOptions: InviterInviteOptions
    ): js.Promise[Unit] = js.native
    def call(destination: String, inviterOptions: InviterOptions): js.Promise[Unit] = js.native
    def call(destination: String, inviterOptions: InviterOptions, inviterInviteOptions: InviterInviteOptions): js.Promise[Unit] = js.native
    
    /** Helper function to remove media from html elements. */
    var cleanupMedia: js.Any = js.native
    
    /**
      * Connect.
      * @remarks
      * Start the UserAgent's WebSocket Transport.
      */
    def connect(): js.Promise[Unit] = js.native
    
    var connectRequested: js.Any = js.native
    
    /** Media constraints. */
    /* private */ def constraints: js.Any = js.native
    
    /**
      * Decline an incoming call.
      * @remarks
      * Reject an incoming INVITE request.
      * Resolves with the response is sent, otherwise rejects.
      * Use `onCallTerminated` delegate method to determine if and when call is ended.
      */
    def decline(): js.Promise[Unit] = js.native
    
    /** Delegate. */
    var delegate: js.UndefOr[SimpleUserDelegate] = js.native
    
    /**
      * Disconnect.
      * @remarks
      * Stop the UserAgent's WebSocket Transport.
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    /** Helper function to enable/disable media tracks. */
    var enableSenderTracks: js.Any = js.native
    
    /**
      * Hangup a call.
      * @remarks
      * Send a BYE request, CANCEL request or reject response to end the current Session.
      * Resolves when the request/response is sent, otherwise rejects.
      * Use `onCallTerminated` delegate method to determine if and when call is ended.
      */
    def hangup(): js.Promise[Unit] = js.native
    
    var held: js.Any = js.native
    
    /**
      * Hold call
      * @remarks
      * Send a re-INVITE with new offer indicating "hold".
      * Resolves when the re-INVITE request is sent, otherwise rejects.
      * Use `onCallHold` delegate method to determine if request is accepted or rejected.
      * See: https://tools.ietf.org/html/rfc6337
      */
    def hold(): js.Promise[Unit] = js.native
    
    /**
      * Instance identifier.
      * @internal
      */
    def id: String = js.native
    
    /**
      * Setup session delegate and state change handler.
      * @param session - Session to setup
      * @param referralInviterOptions - Options for any Inviter created as result of a REFER.
      */
    var initSession: js.Any = js.native
    
    /**
      * Return true if connected.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Hold state.
      * @remarks
      * True if session media is on hold.
      */
    def isHeld(): Boolean = js.native
    
    /**
      * Mute state.
      * @remarks
      * True if sender's media track is disabled.
      */
    def isMuted(): Boolean = js.native
    
    /**
      * The local audio track, if available.
      * @deprecated Use localMediaStream and get track from the stream.
      */
    def localAudioTrack: js.UndefOr[MediaStreamTrack] = js.native
    
    /** The local media stream. Undefined if call not answered. */
    def localMediaStream: js.UndefOr[MediaStream] = js.native
    
    /**
      * The local video track, if available.
      * @deprecated Use localMediaStream and get track from the stream.
      */
    def localVideoTrack: js.UndefOr[MediaStreamTrack] = js.native
    
    var logger: js.Any = js.native
    
    /**
      * Send a message.
      * @remarks
      * Send a MESSAGE request.
      * @param destination - The target destination for the message. A SIP address to send the MESSAGE to.
      */
    def message(destination: String, message: String): js.Promise[Unit] = js.native
    
    /**
      * Mute call.
      * @remarks
      * Disable sender's media tracks.
      */
    def mute(): Unit = js.native
    
    var options: js.Any = js.native
    
    /**
      * Start receiving incoming calls.
      * @remarks
      * Send a REGISTER request for the UserAgent's AOR.
      * Resolves when the REGISTER request is sent, otherwise rejects.
      */
    def register(): js.Promise[Unit] = js.native
    def register(registererOptions: js.UndefOr[scala.Nothing], registererRegisterOptions: RegistererRegisterOptions): js.Promise[Unit] = js.native
    def register(registererOptions: RegistererOptions): js.Promise[Unit] = js.native
    def register(registererOptions: RegistererOptions, registererRegisterOptions: RegistererRegisterOptions): js.Promise[Unit] = js.native
    
    var registerRequested: js.Any = js.native
    
    var registerer: js.Any = js.native
    
    /**
      * The remote audio track, if available.
      * @deprecated Use remoteMediaStream and get track from the stream.
      */
    def remoteAudioTrack: js.UndefOr[MediaStreamTrack] = js.native
    
    /** The remote media stream. Undefined if call not answered. */
    def remoteMediaStream: js.UndefOr[MediaStream] = js.native
    
    /**
      * The remote video track, if available.
      * @deprecated Use remoteMediaStream and get track from the stream.
      */
    def remoteVideoTrack: js.UndefOr[MediaStreamTrack] = js.native
    
    /**
      * Send DTMF.
      * @remarks
      * Send an INFO request with content type application/dtmf-relay.
      * @param tone - Tone to send.
      */
    def sendDTMF(tone: String): js.Promise[Unit] = js.native
    
    /** Helper function to init send then send invite. */
    var sendInvite: js.Any = js.native
    
    var session: js.Any = js.native
    
    /**
      * Puts Session on hold.
      * @param hold - Hold on if true, off if false.
      */
    var setHold: js.Any = js.native
    
    /**
      * Puts Session on mute.
      * @param mute - Mute on if true, off if false.
      */
    var setMute: js.Any = js.native
    
    /** Helper function to attach local media to html elements. */
    var setupLocalMedia: js.Any = js.native
    
    /** Helper function to attach remote media to html elements. */
    var setupRemoteMedia: js.Any = js.native
    
    /**
      * End a session.
      * @remarks
      * Send a BYE request, CANCEL request or reject response to end the current Session.
      * Resolves when the request/response is sent, otherwise rejects.
      * Use `onCallTerminated` delegate method to determine if and when Session is terminated.
      */
    var terminate: js.Any = js.native
    
    /**
      * Unhold call.
      * @remarks
      * Send a re-INVITE with new offer indicating "unhold".
      * Resolves when the re-INVITE request is sent, otherwise rejects.
      * Use `onCallHold` delegate method to determine if request is accepted or rejected.
      * See: https://tools.ietf.org/html/rfc6337
      */
    def unhold(): js.Promise[Unit] = js.native
    
    /**
      * Unmute call.
      * @remarks
      * Enable sender's media tracks.
      */
    def unmute(): Unit = js.native
    
    /**
      * Stop receiving incoming calls.
      * @remarks
      * Send an un-REGISTER request for the UserAgent's AOR.
      * Resolves when the un-REGISTER request is sent, otherwise rejects.
      */
    def unregister(): js.Promise[Unit] = js.native
    def unregister(registererUnregisterOptions: RegistererUnregisterOptions): js.Promise[Unit] = js.native
    
    var userAgent: js.Any = js.native
  }
}
