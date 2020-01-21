package typings.sipJs

import typings.sipJs.libSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.libSessionMod.InviteClientContext
import typings.sipJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/session-description-handler-factory", JSImport.Namespace)
@js.native
object libSessionDescriptionHandlerFactoryMod extends js.Object {
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ InviteClientContext | InviteServerContext, 
    /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions], 
    SessionDescriptionHandler
  ]
  type SessionDescriptionHandlerFactoryOptions = js.Object
}

