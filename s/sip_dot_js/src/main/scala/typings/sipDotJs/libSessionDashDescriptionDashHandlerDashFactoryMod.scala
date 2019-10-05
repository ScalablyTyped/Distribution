package typings.sipDotJs

import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/session-description-handler-factory", JSImport.Namespace)
@js.native
object libSessionDashDescriptionDashHandlerDashFactoryMod extends js.Object {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ InviteClientContext | InviteServerContext, 
    /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions], 
    SessionDescriptionHandler
  ]
  type SessionDescriptionHandlerFactoryOptions = js.Object
}

