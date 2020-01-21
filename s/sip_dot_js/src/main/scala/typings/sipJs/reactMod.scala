package typings.sipJs

import typings.sipJs.apiMod.Session
import typings.sipJs.coreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  @js.native
  class SessionDescriptionHandler protected ()
    extends typings.sipJs.reactSessionDescriptionHandlerMod.SessionDescriptionHandler {
    def this(logger: Logger, options: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object SessionDescriptionHandler extends js.Object {
    /**
      * @param {SIP.Session} session
      * @param {Object} [options]
      */
    def defaultFactory(session: Session, options: js.Any): typings.sipJs.reactSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  }
  
}

