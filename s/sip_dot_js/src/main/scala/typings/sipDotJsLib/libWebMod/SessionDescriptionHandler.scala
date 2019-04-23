package typings
package sipDotJsLib.libWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web", "SessionDescriptionHandler")
@js.native
class SessionDescriptionHandler protected ()
  extends sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler {
  def this(logger: sipDotJsLib.libLoggerFactoryMod.Logger, observer: sipDotJsLib.libWebSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver, options: js.Any) = this()
}

/* static members */
@JSImport("sip.js/lib/Web", "SessionDescriptionHandler")
@js.native
object SessionDescriptionHandler extends js.Object {
  /**
    * @param {SIP.Session} session
    * @param {Object} [options]
    */
  def defaultFactory(session: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any): sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  def defaultFactory(session: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any): sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
}

