package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Web")
@js.native
object WebNs extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends sipDotJsLib.libWebMod.SessionDescriptionHandler {
    def this(logger: sipDotJsLib.libCoreMod.Logger, observer: sipDotJsLib.libWebSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  @js.native
  class Simple protected ()
    extends sipDotJsLib.libWebMod.Simple {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class Transport protected ()
    extends sipDotJsLib.libWebMod.Transport {
    def this(logger: sipDotJsLib.libCoreMod.Logger) = this()
    def this(logger: sipDotJsLib.libCoreMod.Logger, options: js.Any) = this()
  }
  
  @JSName("Modifiers")
  @js.native
  object ModifiersNs extends js.Object {
    def addMidLines(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
    def cleanJitsiSdpImageattr(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
    def stripG722(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
    def stripRtpPayload(payload: java.lang.String): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    def stripTcpCandidates(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
    def stripTelephoneEvent(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
    def stripVideo(description: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any): sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any): sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
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

