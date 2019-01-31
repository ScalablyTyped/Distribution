package typings
package sipDotJsLib.typesWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/Web", "SessionDescriptionHandler")
@js.native
class SessionDescriptionHandler protected ()
  extends sipDotJsLib.typesWebSessionDashDescriptionDashHandlerMod.WebSessionDescriptionHandler {
    // peer connection is created in constructor, and never unset
  def this(logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger, observer: sipDotJsLib.typesSessionDashDescriptionDashHandlerDashObserverMod.SessionDescriptionHandlerObserver, options: js.Any) = this()
}

@JSImport("sip.js/types/Web", "SessionDescriptionHandler")
@js.native
object SessionDescriptionHandler extends js.Object {
  def defaultFactory(session: sipDotJsLib.typesSessionMod.InviteClientContext, options: js.Any): sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  def defaultFactory(session: sipDotJsLib.typesSessionMod.InviteServerContext, options: js.Any): sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
}

