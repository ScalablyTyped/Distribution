package typings
package sipDotJsLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def constructOutgoingResponse(
    message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage,
    options: sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
  ): sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: java.lang.String): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def fromBodyLegacy(bodyLegacy: sipDotJsLib.Anon_BodyContentType): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesBodyMod.OutgoingResponseBody): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean = js.native
}

