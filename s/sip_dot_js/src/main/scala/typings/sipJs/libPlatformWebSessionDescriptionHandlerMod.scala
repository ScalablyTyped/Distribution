package typings.sipJs

import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libPlatformWebSessionDescriptionHandlerMediaStreamFactoryMod.MediaStreamFactory
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.std.AudioContext
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionDescriptionHandlerMod {
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler")
  @js.native
  open class SessionDescriptionHandler protected ()
    extends typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler {
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
  }
  /* static members */
  object SessionDescriptionHandler {
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler.dispatchAddTrackEvent")
    @js.native
    def dispatchAddTrackEvent: Any = js.native
    inline def dispatchAddTrackEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: Any = js.native
    inline def dispatchRemoveTrackEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/platform/web/session-description-handler", "WebAudioSessionDescriptionHandler")
  @js.native
  open class WebAudioSessionDescriptionHandler protected ()
    extends typings.sipJs.libPlatformWebSessionDescriptionHandlerWebAudioSessionDescriptionHandlerMod.WebAudioSessionDescriptionHandler {
    def this(logger: Logger, mediaStreamFactory: MediaStreamFactory) = this()
    def this(
      logger: Logger,
      mediaStreamFactory: MediaStreamFactory,
      sessionDescriptionHandlerConfiguration: SessionDescriptionHandlerConfiguration
    ) = this()
  }
  /* static members */
  object WebAudioSessionDescriptionHandler {
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "WebAudioSessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web/session-description-handler", "WebAudioSessionDescriptionHandler.audioContext")
    @js.native
    def audioContext: js.UndefOr[AudioContext] = js.native
    inline def audioContext_=(x: js.UndefOr[AudioContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("audioContext")(x.asInstanceOf[js.Any])
  }
  
  inline def defaultMediaStreamFactory(): MediaStreamFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMediaStreamFactory")().asInstanceOf[MediaStreamFactory]
  
  inline def defaultPeerConnectionConfiguration(): RTCConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultPeerConnectionConfiguration")().asInstanceOf[RTCConfiguration]
  
  inline def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSessionDescriptionHandlerFactory")().asInstanceOf[SessionDescriptionHandlerFactory]
  inline def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSessionDescriptionHandlerFactory")(mediaStreamFactory.asInstanceOf[js.Any]).asInstanceOf[SessionDescriptionHandlerFactory]
  
  inline def startLocalConference(conferenceSessions: js.Array[Session]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startLocalConference")(conferenceSessions.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
