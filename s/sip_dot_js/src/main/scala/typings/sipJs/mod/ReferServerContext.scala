package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends typings.sipJs.referContextMod.ReferServerContext {
  def this(ua: typings.sipJs.uAMod.UA, incomingRequest: typings.sipJs.incomingRequestMod.IncomingRequest) = this()
  def this(
    ua: typings.sipJs.uAMod.UA,
    incomingRequest: typings.sipJs.incomingRequestMod.IncomingRequest,
    session: typings.sipJs.sessionSessionMod.Session
  ) = this()
}

