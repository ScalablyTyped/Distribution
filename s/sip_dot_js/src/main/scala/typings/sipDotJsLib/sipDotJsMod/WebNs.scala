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
    extends sipDotJsLib.typesWebMod.SessionDescriptionHandler {
      // peer connection is created in constructor, and never unset
    def this(logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger, observer: sipDotJsLib.typesSessionDashDescriptionDashHandlerDashObserverMod.SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  @js.native
  class Simple protected ()
    extends sipDotJsLib.typesWebMod.Simple {
    def this(options: js.Any) = this()
  }
  
  @js.native
  class WebTransport ()
    extends sipDotJsLib.typesWebMod.WebTransport
  
  @JSName("Modifiers")
  @js.native
  object ModifiersNs extends js.Object {
    val addMidLines: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    val cleanJitsiSdpImageattr: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    val stripG722: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    val stripRtpPayload: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    val stripTcpCandidates: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    val stripTelephoneEvent: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
    val stripVideo: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier = js.native
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    def defaultFactory(session: sipDotJsLib.typesSessionMod.InviteClientContext, options: js.Any): sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: sipDotJsLib.typesSessionMod.InviteServerContext, options: js.Any): sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  }
  
  /* static members */
  @js.native
  object Simple extends js.Object {
    val C: sipDotJsLib.typesWebSimpleMod.SimpleStatus = js.native
  }
  
  /* static members */
  @js.native
  object WebTransport extends js.Object {
    val C: sipDotJsLib.typesWebTransportMod.TransportStatus = js.native
  }
  
}

