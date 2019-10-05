package typings.sipDotJs

import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typings.sipDotJs.libApiSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/session-description-handler-factory", JSImport.Namespace)
@js.native
object libApiSessionDashDescriptionDashHandlerDashFactoryMod extends js.Object {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ Session, 
    /* options */ js.UndefOr[js.Object], 
    SessionDescriptionHandler
  ]
}

