package typings.sipJs

import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libPlatformWebSessionDescriptionHandlerMediaStreamFactoryMod.MediaStreamFactory
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.std.AudioContext
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerWebAudioSessionDescriptionHandlerMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/web-audio-session-description-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js/lib/platform/web/session-description-handler/web-audio-session-description-handler", "WebAudioSessionDescriptionHandler")
  @js.native
  open class WebAudioSessionDescriptionHandler protected () extends SessionDescriptionHandler {
    def this(logger: Logger, mediaStreamFactory: MediaStreamFactory) = this()
    def this(
      logger: Logger,
      mediaStreamFactory: MediaStreamFactory,
      sessionDescriptionHandlerConfiguration: SessionDescriptionHandlerConfiguration
    ) = this()
    
    /**
      * Returns a WebRTC MediaStream proxying the provided audio media stream.
      * This allows additional Web Audio media stream source nodes to be connected
      * to the destination node assoicated with the returned stream so we can mix
      * aditional audio sorces into the local media stream (ie for 3-way conferencing).
      * @param stream - The MediaStream to proxy.
      */
    def initLocalMediaStream(stream: MediaStream): MediaStream = js.native
    
    /**
      * Join (conference) media streams with another party.
      * @param peer - The session description handler of the peer to join with.
      */
    def joinWith(peer: WebAudioSessionDescriptionHandler): Unit = js.native
    
    /* private */ var localMediaStreamDestinationNode: Any = js.native
    
    /* private */ var localMediaStreamReal: Any = js.native
    
    /* private */ var localMediaStreamSourceNode: Any = js.native
    
    /**
      * Sets the original local media stream.
      * @param stream - Media stream containing tracks to be utilized.
      * @remarks
      * Only the first audio and video tracks of the provided MediaStream are utilized.
      * Adds tracks if audio and/or video tracks are not already present, otherwise replaces tracks.
      */
    def setRealLocalMediaStream(stream: MediaStream): Unit = js.native
  }
  /* static members */
  object WebAudioSessionDescriptionHandler {
    
    @JSImport("sip.js/lib/platform/web/session-description-handler/web-audio-session-description-handler", "WebAudioSessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/session-description-handler/web-audio-session-description-handler", "WebAudioSessionDescriptionHandler.audioContext")
    @js.native
    def audioContext: js.UndefOr[AudioContext] = js.native
    inline def audioContext_=(x: js.UndefOr[AudioContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(x.asInstanceOf[js.Any])
  }
  
  inline def startLocalConference(conferenceSessions: js.Array[Session]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startLocalConference")(conferenceSessions.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
