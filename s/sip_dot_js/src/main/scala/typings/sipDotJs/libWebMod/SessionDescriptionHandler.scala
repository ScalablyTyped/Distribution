package typings.sipDotJs.libWebMod

import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libWebSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web", "SessionDescriptionHandler")
@js.native
class SessionDescriptionHandler protected ()
  extends typings.sipDotJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler {
  def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
}

/* static members */
@JSImport("sip.js/lib/Web", "SessionDescriptionHandler")
@js.native
object SessionDescriptionHandler extends js.Object {
  /**
    * @param {SIP.Session} session
    * @param {Object} [options]
    */
  def defaultFactory(session: InviteClientContext, options: js.Any): typings.sipDotJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  def defaultFactory(session: InviteServerContext, options: js.Any): typings.sipDotJs.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
}

