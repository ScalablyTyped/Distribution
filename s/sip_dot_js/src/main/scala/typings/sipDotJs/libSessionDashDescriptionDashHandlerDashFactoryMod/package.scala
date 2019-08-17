package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSessionDashDescriptionDashHandlerDashFactoryMod {
  import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
  import typings.sipDotJs.libSessionMod.InviteClientContext
  import typings.sipDotJs.libSessionMod.InviteServerContext

  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ InviteClientContext | InviteServerContext, 
    /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions], 
    SessionDescriptionHandler
  ]
  type SessionDescriptionHandlerFactoryOptions = js.Object
}
