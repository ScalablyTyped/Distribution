package typings.sipDotJs.libCoreMessagesBodyMod

import typings.sipDotJs.Anon_BodyContentType
import typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: Anon_BodyContentType): Body = js.native
  def getBody(message: OutgoingResponseBody): js.UndefOr[Body] = js.native
  def getBody(message: IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(message: IncomingResponseMessage): js.UndefOr[Body] = js.native
  def getBody(message: OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
}

