package typings.sipJs.mod

import typings.sipJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Invitation")
@js.native
open class Invitation protected ()
  extends typings.sipJs.libApiMod.Invitation {
  /** @internal */
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    incomingInviteRequest: IncomingInviteRequest
  ) = this()
}
