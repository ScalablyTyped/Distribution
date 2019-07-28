package typings.sipDotJs.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ReferServerContext")
@js.native
class ReferServerContext protected ()
  extends typings.sipDotJs.libReferContextMod.ReferServerContext {
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    incomingRequest: typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
  ) = this()
  def this(
    ua: typings.sipDotJs.libUAMod.UA,
    incomingRequest: typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest,
    session: typings.sipDotJs.libCoreSessionSessionMod.Session
  ) = this()
}

