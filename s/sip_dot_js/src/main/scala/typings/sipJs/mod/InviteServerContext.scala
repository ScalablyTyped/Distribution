package typings.sipJs.mod

import typings.sipJs.inviteMod.IncomingInviteRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "InviteServerContext")
@js.native
class InviteServerContext protected ()
  extends typings.sipJs.libSessionMod.InviteServerContext {
  def this(ua: typings.sipJs.uAMod.UA, incomingInviteRequest: IncomingInviteRequest) = this()
}

