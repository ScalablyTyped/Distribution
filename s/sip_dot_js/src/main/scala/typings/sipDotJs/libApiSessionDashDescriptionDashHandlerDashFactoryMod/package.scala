package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiSessionDashDescriptionDashHandlerDashFactoryMod {
  import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
  import typings.sipDotJs.libApiSessionMod.Session

  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ Session, 
    /* options */ js.UndefOr[js.Object], 
    SessionDescriptionHandler
  ]
}
