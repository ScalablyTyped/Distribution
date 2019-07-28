package typings.sipDotJs.libCoreMod

import typings.sipDotJs.Anon_BodyContentType
import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesBodyMod.OutgoingResponseBody
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def constructOutgoingResponse(
    message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: ResponseOptions
  ): OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: String): Body = js.native
  def fromBodyLegacy(bodyLegacy: Anon_BodyContentType): Body = js.native
  def getBody(message: OutgoingResponseBody): js.UndefOr[Body] = js.native
  def getBody(message: typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(
    message: typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
  ): js.UndefOr[Body] = js.native
  def getBody(message: typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ Boolean = js.native
}

