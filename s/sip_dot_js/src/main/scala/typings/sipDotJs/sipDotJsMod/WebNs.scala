package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typings.sipDotJs.libWebSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import typings.std.RTCSessionDescriptionInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Web")
@js.native
object WebNs extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipDotJs.libWebMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  @js.native
  class Simple protected ()
    extends typings.sipDotJs.libWebMod.Simple {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class Transport protected ()
    extends typings.sipDotJs.libWebMod.Transport {
    def this(logger: Logger) = this()
    def this(logger: Logger, options: js.Any) = this()
  }
  
  @JSName("Modifiers")
  @js.native
  object ModifiersNs extends js.Object {
    def addMidLines(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def cleanJitsiSdpImageattr(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripG722(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripRtpPayload(payload: String): SessionDescriptionHandlerModifier = js.native
    def stripTcpCandidates(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripTelephoneEvent(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
    def stripVideo(description: RTCSessionDescriptionInit): js.Promise[RTCSessionDescriptionInit] = js.native
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    def defaultFactory(session: typings.sipDotJs.libApiSessionMod.Session, options: js.Any): typings.sipDotJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: typings.sipDotJs.libSessionMod.InviteClientContext, options: js.Any): typings.sipDotJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: typings.sipDotJs.libSessionMod.InviteServerContext, options: js.Any): typings.sipDotJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
  /* static members */
  @js.native
  object Simple extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SimpleStatus */ js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Transport extends js.Object {
    val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TransportStatus */ js.Any = js.native
  }
  
}

