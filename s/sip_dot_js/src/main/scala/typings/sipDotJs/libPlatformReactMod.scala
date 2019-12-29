package typings.sipDotJs

import typings.sipDotJs.libApiMod.Session
import typings.sipDotJs.libCoreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/react", JSImport.Namespace)
@js.native
object libPlatformReactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipDotJs.libPlatformReactSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: Session, options: js.Any): typings.sipDotJs.libPlatformReactSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

