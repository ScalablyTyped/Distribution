package typings.sipJs

import typings.sipJs.anon.Duration
import typings.sipJs.libApiSessionDescriptionHandlerMod.BodyAndContentType
import typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libPlatformWebSessionDescriptionHandlerMediaStreamFactoryMod.MediaStreamFactory
import typings.sipJs.libPlatformWebSessionDescriptionHandlerPeerConnectionDelegateMod.PeerConnectionDelegate
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerOptionsMod.SessionDescriptionHandlerOptions
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.MediaStreamTrack
import typings.std.RTCDataChannel
import typings.std.RTCPeerConnection
import typings.std.RTCSessionDescription
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler", "SessionDescriptionHandler")
  @js.native
  open class SessionDescriptionHandler protected ()
    extends StObject
       with typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandler {
    /**
      * Constructor
      * @param logger - A logger
      * @param mediaStreamFactory - A factory to provide a MediaStream
      * @param options - Options passed from the SessionDescriptionHandleFactory
      */
    def this(logger: Logger, mediaStreamFactory: MediaStreamFactory) = this()
    def this(
      logger: Logger,
      mediaStreamFactory: MediaStreamFactory,
      sessionDescriptionHandlerConfiguration: SessionDescriptionHandlerConfiguration
    ) = this()
    
    /** The data channel. Undefined before created. */
    /* protected */ var _dataChannel: js.UndefOr[RTCDataChannel] = js.native
    
    /** The local media stream. */
    /* protected */ var _localMediaStream: MediaStream = js.native
    
    /** The peer connection. Undefined after SessionDescriptionHandler.close(). */
    /* protected */ var _peerConnection: js.UndefOr[RTCPeerConnection] = js.native
    
    /** The peer connection delegate. */
    /* protected */ var _peerConnectionDelegate: js.UndefOr[PeerConnectionDelegate] = js.native
    
    /** The remote media stream. */
    /* protected */ var _remoteMediaStream: MediaStream = js.native
    
    /**
      * Applies modifiers to SDP prior to setting the local or remote description.
      * @param sdp - SDP to modify.
      * @param modifiers - Modifiers to apply.
      */
    /* protected */ def applyModifiers(sdp: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    /* protected */ def applyModifiers(sdp: RTCSessionDescriptionInit, modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[RTCSessionDescriptionInit] = js.native
    
    /**
      * Create a data channel.
      * @remarks
      * Only creates a data channel if SessionDescriptionHandlerOptions.dataChannel is true.
      * Only creates a data channel if creating a local offer.
      * Only if one does not already exist.
      * @param options - Session description handler options.
      */
    /* protected */ def createDataChannel(): js.Promise[Unit] = js.native
    /* protected */ def createDataChannel(options: SessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
    
    /**
      * Depending on current signaling state, create a local offer or answer.
      * @param options - Session description handler options.
      */
    /* protected */ def createLocalOfferOrAnswer(): js.Promise[RTCSessionDescriptionInit] = js.native
    /* protected */ def createLocalOfferOrAnswer(options: SessionDescriptionHandlerOptions): js.Promise[RTCSessionDescriptionInit] = js.native
    
    /**
      * The data channel. Undefined before it is created.
      */
    def dataChannel: js.UndefOr[RTCDataChannel] = js.native
    
    /**
      * Helper function to enable/disable media tracks.
      * @param enable - If true enable tracks, otherwise disable tracks.
      */
    def enableReceiverTracks(enable: Boolean): Unit = js.native
    
    /**
      * Helper function to enable/disable media tracks.
      * @param enable - If true enable tracks, otherwise disable tracks.
      */
    def enableSenderTracks(enable: Boolean): Unit = js.native
    
    def getDescription(options: SessionDescriptionHandlerOptions): js.Promise[BodyAndContentType] = js.native
    def getDescription(options: SessionDescriptionHandlerOptions, modifiers: js.Array[SessionDescriptionHandlerModifier]): js.Promise[BodyAndContentType] = js.native
    
    /**
      * Get a media stream from the media stream factory and set the local media stream.
      * @param options - Session description handler options.
      */
    /* protected */ def getLocalMediaStream(): js.Promise[Unit] = js.native
    /* protected */ def getLocalMediaStream(options: SessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
    
    /**
      * Gets the peer connection's local session description.
      */
    /* protected */ def getLocalSessionDescription(): js.Promise[RTCSessionDescription] = js.native
    
    /**
      * Called when ICE gathering completes and resolves any waiting promise.
      * @remarks
      * May be called prior to ICE gathering actually completing to allow the
      * session descirption handler proceed with whatever candidates have been
      * gathered up to this point in time. Use this to stop waiting on ICE to
      * complete if you are implementing your own ICE gathering completion strategy.
      */
    def iceGatheringComplete(): Unit = js.native
    
    /* private */ var iceGatheringCompletePromise: Any = js.native
    
    /* private */ var iceGatheringCompleteReject: Any = js.native
    
    /* private */ var iceGatheringCompleteResolve: Any = js.native
    
    /* private */ var iceGatheringCompleteTimeoutId: Any = js.native
    
    /**
      * Initializes the peer connection event handlers
      */
    /* private */ var initPeerConnectionEventHandlers: Any = js.native
    
    /**
      * The local media stream currently being sent.
      *
      * @remarks
      * The local media stream initially has no tracks, so the presence of tracks
      * should not be assumed. Furthermore, tracks may be added or removed if the
      * local media changes - for example, on upgrade from audio only to a video session.
      * At any given time there will be at most one audio track and one video track
      * (it's possible that this restriction may not apply to sub-classes).
      * Use `MediaStream.onaddtrack` or add a listener for the `addtrack` event
      * to detect when a new track becomes available:
      * https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/onaddtrack
      */
    def localMediaStream: MediaStream = js.native
    
    /* private */ var localMediaStreamConstraints: Any = js.native
    
    /** Logger. */
    /* protected */ var logger: Logger = js.native
    
    /** Media stream factory. */
    /* protected */ def mediaStreamFactory(constraints: MediaStreamConstraints, sessionDescriptionHandler: SessionDescriptionHandler): js.Promise[MediaStream] = js.native
    /* protected */ def mediaStreamFactory(
      constraints: MediaStreamConstraints,
      sessionDescriptionHandler: SessionDescriptionHandler,
      options: SessionDescriptionHandlerOptions
    ): js.Promise[MediaStream] = js.native
    /** Media stream factory. */
    /* protected */ @JSName("mediaStreamFactory")
    var mediaStreamFactory_Original: MediaStreamFactory = js.native
    
    /* private */ var onDataChannel: Any = js.native
    
    /**
      * The peer connection. Undefined if peer connection has closed.
      *
      * @remarks
      * Use the peerConnectionDelegate to get access to the events associated
      * with the RTCPeerConnection. For example...
      *
      * Do NOT do this...
      * ```ts
      * peerConnection.onicecandidate = (event) => {
      *   // do something
      * };
      * ```
      * Instead, do this...
      * ```ts
      * peerConnection.peerConnectionDelegate = {
      *   onicecandidate: (event) => {
      *     // do something
      *   }
      * };
      * ```
      * While access to the underlying `RTCPeerConnection` is provided, note that
      * using methods which modify it may break the operation of this class.
      * In particular, this class depends on exclusive access to the
      * event handler properties. If you need access to the peer connection
      * events, either register for events using `addEventListener()` on
      * the `RTCPeerConnection` or set the `peerConnectionDelegate` on
      * this `SessionDescriptionHandler`.
      */
    def peerConnection: js.UndefOr[RTCPeerConnection] = js.native
    
    /**
      * A delegate which provides access to the peer connection event handlers.
      *
      * @remarks
      * Use the peerConnectionDelegate to get access to the events associated
      * with the RTCPeerConnection. For example...
      *
      * Do NOT do this...
      * ```ts
      * peerConnection.onicecandidate = (event) => {
      *   // do something
      * };
      * ```
      * Instead, do this...
      * ```
      * peerConnection.peerConnectionDelegate = {
      *   onicecandidate: (event) => {
      *     // do something
      *   }
      * };
      * ```
      * Setting the peer connection event handlers directly is not supported
      * and may break this class. As this class depends on exclusive access
      * to them. This delegate is intended to provide access to the
      * RTCPeerConnection events in a fashion which is supported.
      */
    def peerConnectionDelegate: js.UndefOr[PeerConnectionDelegate] = js.native
    def peerConnectionDelegate_=(delegate: js.UndefOr[PeerConnectionDelegate]): Unit = js.native
    
    /**
      * The remote media stream currently being received.
      *
      * @remarks
      * The remote media stream initially has no tracks, so the presence of tracks
      * should not be assumed. Furthermore, tracks may be added or removed if the
      * remote media changes - for example, on upgrade from audio only to a video session.
      * At any given time there will be at most one audio track and one video track
      * (it's possible that this restriction may not apply to sub-classes).
      * Use `MediaStream.onaddtrack` or add a listener for the `addtrack` event
      * to detect when a new track becomes available:
      * https://developer.mozilla.org/en-US/docs/Web/API/MediaStream/onaddtrack
      */
    def remoteMediaStream: MediaStream = js.native
    
    def sendDtmf(tones: String, options: Duration): Boolean = js.native
    
    /** Configuration options. */
    /* protected */ var sessionDescriptionHandlerConfiguration: js.UndefOr[SessionDescriptionHandlerConfiguration] = js.native
    
    def setDescription(sdp: String, options: SessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
    def setDescription(
      sdp: String,
      options: SessionDescriptionHandlerOptions,
      modifiers: js.Array[SessionDescriptionHandlerModifier]
    ): js.Promise[Unit] = js.native
    
    /**
      * Sets the peer connection's sender tracks and local media stream tracks.
      *
      * @remarks
      * Only the first audio and video tracks of the provided MediaStream are utilized.
      * Adds tracks if audio and/or video tracks are not already present, otherwise replaces tracks.
      *
      * @param stream - Media stream containing tracks to be utilized.
      */
    /* protected */ def setLocalMediaStream(stream: MediaStream): js.Promise[Unit] = js.native
    
    /**
      * Sets the peer connection's local session description.
      * @param sessionDescription - sessionDescription The session description.
      */
    /* protected */ def setLocalSessionDescription(sessionDescription: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
    
    /**
      * Sets the peer connection's remote session description.
      * @param sessionDescription - The session description.
      */
    /* protected */ def setRemoteSessionDescription(sessionDescription: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
    
    /**
      * Sets a remote media stream track.
      *
      * @remarks
      * Adds tracks if audio and/or video tracks are not already present, otherwise replaces tracks.
      *
      * @param track - Media stream track to be utilized.
      */
    /* protected */ def setRemoteTrack(track: MediaStreamTrack): Unit = js.native
    
    /**
      * Depending on the current signaling state and the session hold state, update transceiver direction.
      * @param options - Session description handler options.
      */
    /* protected */ def updateDirection(): js.Promise[Unit] = js.native
    /* protected */ def updateDirection(options: SessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
    
    /**
      * Wait for ICE gathering to complete.
      * @param restart - If true, waits if current state is "complete" (waits for transition to "complete").
      * @param timeout - Milliseconds after which waiting times out. No timeout if 0.
      */
    /* protected */ def waitForIceGatheringComplete(): js.Promise[Unit] = js.native
    /* protected */ def waitForIceGatheringComplete(restart: Boolean): js.Promise[Unit] = js.native
    /* protected */ def waitForIceGatheringComplete(restart: Boolean, timeout: Double): js.Promise[Unit] = js.native
    /* protected */ def waitForIceGatheringComplete(restart: Unit, timeout: Double): js.Promise[Unit] = js.native
  }
  /* static members */
  object SessionDescriptionHandler {
    
    @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler", "SessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler", "SessionDescriptionHandler.dispatchAddTrackEvent")
    @js.native
    def dispatchAddTrackEvent: Any = js.native
    inline def dispatchAddTrackEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/platform/web/session-description-handler/session-description-handler", "SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: Any = js.native
    inline def dispatchRemoveTrackEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
}
