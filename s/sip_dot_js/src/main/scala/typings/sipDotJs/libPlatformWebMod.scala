package typings.sipDotJs

import typings.sipDotJs.libApiMod.Session
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserDashOptionsMod.SimpleUserOptions
import typings.sipDotJs.libPlatformWebTransportMod.TransportOptions
import typings.std.RTCSessionDescriptionInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web", JSImport.Namespace)
@js.native
object libPlatformWebMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipDotJs.libPlatformWebSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, options: js.Any) = this()
  }
  
  @js.native
  class SimpleUser protected ()
    extends typings.sipDotJs.libPlatformWebSimpleDashUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param webSocketServerURL - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(webSocketServerURL: String) = this()
    def this(webSocketServerURL: String, options: SimpleUserOptions) = this()
  }
  
  @js.native
  class Transport protected ()
    extends typings.sipDotJs.libPlatformWebTransportMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: TransportOptions) = this()
  }
  
  def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
  def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    def defaultFactory(session: Session, options: js.Any): typings.sipDotJs.libPlatformWebSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    var defaultOptions: js.Any = js.native
  }
  
}

