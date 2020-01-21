package typings.sipJs

import typings.sipJs.coreMod.Logger
import typings.sipJs.libSessionMod.InviteClientContext
import typings.sipJs.libSessionMod.InviteServerContext
import typings.sipJs.sessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React", JSImport.Namespace)
@js.native
object libReactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typings.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typings.sipJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

