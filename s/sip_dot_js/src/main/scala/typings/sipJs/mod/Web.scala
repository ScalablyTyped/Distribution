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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Web")
@js.native
object Web extends js.Object {
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
  
  @js.native
  class Transport protected ()
    extends typings.sipJs.webMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def defaultMediaStreamFactory(): MediaStreamFactory = js.native
  def defaultPeerConnectionConfiguration(): RTCConfiguration = js.native
  def defaultSessionDescriptionHandlerFactory(): SessionDescriptionHandlerFactory = js.native
  def defaultSessionDescriptionHandlerFactory(
    mediaStreamFactory: js.Function2[
      /* constraints */ MediaStreamConstraints, 
      /* sessionDescriptionHandler */ typings.sipJs.sessionDescriptionHandlerSessionDescriptionHandlerMod.SessionDescriptionHandler, 
      js.Promise[MediaStream]
    ]
  ): SessionDescriptionHandlerFactory = js.native
  def holdModifier(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    var dispatchAddTrackEvent: js.Any = js.native
    var dispatchRemoveTrackEvent: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    var defaultOptions: js.Any = js.native
  }
  
}

