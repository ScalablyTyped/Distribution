package typings.sipDotJs.libCoreMessagesBodyMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/body", "getBody")
@js.native
object getBody extends js.Object {
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(message: IncomingResponseMessage): js.UndefOr[Body] = js.native
  def apply(message: OutgoingRequestMessage): js.UndefOr[Body] = js.native
}

