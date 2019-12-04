package typings.sipDotJs

import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libReactSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/React", JSImport.Namespace)
@js.native
object libReactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipDotJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: InviteClientContext, options: js.Any): typings.sipDotJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
    def defaultFactory(session: InviteServerContext, options: js.Any): typings.sipDotJs.libReactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

