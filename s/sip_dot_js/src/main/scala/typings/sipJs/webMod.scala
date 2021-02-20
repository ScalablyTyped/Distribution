package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.coreMod.Logger
import typings.sipJs.mediaStreamFactoryMod.MediaStreamFactory
import typings.sipJs.sessionDescriptionHandlerConfigurationMod.SessionDescriptionHandlerConfiguration
import typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.simpleUserOptionsMod.SimpleUserOptions
import typings.sipJs.transportOptionsMod.TransportOptions
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.RTCConfiguration
import typings.std.RTCSessionDescriptionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webMod {
  
  @JSImport("sip.js/lib/platform/web", "SessionDescriptionHandler")
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipJs.webSessionDescriptionHandlerMod.SessionDescriptionHandler {
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
    
    @JSImport("sip.js/lib/platform/web", "SessionDescriptionHandler")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web", "SessionDescriptionHandler.dispatchAddTrackEvent")
    @js.native
    def dispatchAddTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchAddTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/platform/web", "SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchRemoveTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/platform/web", "SimpleUser")
  @js.native
  class SimpleUser protected ()
    extends typings.sipJs.simpleUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
  
  @JSImport("sip.js/lib/platform/web", "Transport")
  @js.native
  class Transport protected ()
    extends typings.sipJs.webTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  /* static members */
  object Transport {
    
    @JSImport("sip.js/lib/platform/web", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/platform/web", "Transport.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/platform/web", "addMidLines")
  @js.native
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web", "cleanJitsiSdpImageattr")
  @js.native
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web", "defaultMediaStreamFactory")
  @js.native
  def defaultMediaStreamFactory(): MediaStreamFactory = js.native
  
  @JSImport("sip.js/lib/platform/web", "defaultPeerConnectionConfiguration")
  @js.native
  def defaultPeerConnectionConfiguration(): RTCConfiguration = js.native
  
  @JSImport("sip.js/lib/platform/web", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  @JSImport("sip.js/lib/platform/web", "defaultSessionDescriptionHandlerFactory")
  @js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
  
  @JSImport("sip.js/lib/platform/web", "holdModifier")
  @js.native
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web", "stripG722")
  @js.native
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web", "stripRtpPayload")
  @js.native
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  
  @JSImport("sip.js/lib/platform/web", "stripTcpCandidates")
  @js.native
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web", "stripTelephoneEvent")
  @js.native
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  
  @JSImport("sip.js/lib/platform/web", "stripVideo")
  @js.native
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
}
