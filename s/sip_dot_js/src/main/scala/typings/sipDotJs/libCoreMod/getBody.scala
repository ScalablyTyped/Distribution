package typings.sipDotJs.libCoreMod

import typings.sipDotJs.libCoreMessagesBodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "getBody")
@js.native
object getBody extends js.Object {
  def apply(message: Body): js.UndefOr[Body] = js.native
  def apply(message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def apply(
    message: typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ): js.UndefOr[Body] = js.native
  def apply(message: typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
}

