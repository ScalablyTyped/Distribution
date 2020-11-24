package typings.sipJs

import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/session-description-handler-factory", JSImport.Namespace)
@js.native
object sessionDescriptionHandlerFactoryMod extends js.Object {
  
  type SessionDescriptionHandlerFactory = js.Function2[
    /* session */ Session, 
    /* options */ js.UndefOr[js.Object], 
    SessionDescriptionHandler
  ]
}
