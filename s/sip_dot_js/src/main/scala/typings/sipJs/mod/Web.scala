package typings.sipJs.mod

import typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.libCoreMod.Logger
import typings.sipJs.libPlatformWebSessionDescriptionHandlerMediaStreamFactoryMod.MediaStreamFactory
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typings.sipJs.libPlatformWebSessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.libPlatformWebSimpleUserSimpleUserOptionsMod.SimpleUserOptions
import typings.sipJs.libPlatformWebTransportTransportOptionsMod.TransportOptions
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCConfiguration
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  @JSImport("sip.js", "Web")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js", "Web.SessionDescriptionHandler")
  @js.native
  open class SessionDescriptionHandler protected ()
    extends typings.sipJs.libPlatformWebMod.SessionDescriptionHandler {
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
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler.dispatchAddTrackEvent")
    @js.native
    def dispatchAddTrackEvent: Any = js.native
    inline def dispatchAddTrackEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: Any = js.native
    inline def dispatchRemoveTrackEvent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js", "Web.SimpleUser")
  @js.native
  open class SimpleUser protected ()
    extends typings.sipJs.libPlatformWebMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
  
  @JSImport("sip.js", "Web.Transport")
  @js.native
  open class Transport protected ()
    extends typings.sipJs.libPlatformWebMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("sip.js", "Web.Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js", "Web.Transport.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  inline def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addMidLines")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  inline def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanJitsiSdpImageattr")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
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
  
  inline def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("holdModifier")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  inline def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripG722")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  inline def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stripRtpPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[SessionDescriptionHandlerModifier]
  
  inline def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTcpCandidates")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  inline def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTelephoneEvent")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  inline def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripVideo")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
}
