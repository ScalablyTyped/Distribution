package typings.sipJs.mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  @JSImport("sip.js", "Web")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js", "Web.SessionDescriptionHandler")
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipJs.webMod.SessionDescriptionHandler {
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
    def dispatchAddTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchAddTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchAddTrackEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js", "Web.SessionDescriptionHandler.dispatchRemoveTrackEvent")
    @js.native
    def dispatchRemoveTrackEvent: js.Any = js.native
    @scala.inline
    def dispatchRemoveTrackEvent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dispatchRemoveTrackEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js", "Web.SimpleUser")
  @js.native
  class SimpleUser protected ()
    extends typings.sipJs.webMod.SimpleUser {
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
  class Transport protected ()
    extends typings.sipJs.webMod.Transport {
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
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addMidLines")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanJitsiSdpImageattr")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def defaultMediaStreamFactory(): MediaStreamFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMediaStreamFactory")().asInstanceOf[MediaStreamFactory]
  
  @scala.inline
  def defaultPeerConnectionConfiguration(): RTCConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultPeerConnectionConfiguration")().asInstanceOf[RTCConfiguration]
  
  @scala.inline
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSessionDescriptionHandlerFactory")().asInstanceOf[SessionDescriptionHandlerFactory]
  @scala.inline
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSessionDescriptionHandlerFactory")(mediaStreamFactory.asInstanceOf[js.Any]).asInstanceOf[SessionDescriptionHandlerFactory]
  
  @scala.inline
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("holdModifier")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripG722")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = ^.asInstanceOf[js.Dynamic].applyDynamic("stripRtpPayload")(payload.asInstanceOf[js.Any]).asInstanceOf[SessionDescriptionHandlerModifier]
  
  @scala.inline
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTcpCandidates")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTelephoneEvent")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
  
  @scala.inline
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripVideo")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RTCSessionDescriptionInit]]
}
