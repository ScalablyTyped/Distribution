package typings
package sipDotJsLib.libCoreMessagesBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBodyLegacy(bodyLegacy: java.lang.String): Body = js.native
  def fromBodyLegacy(bodyLegacy: sipDotJsLib.Anon_BodyContentType): Body = js.native
  def getBody(message: OutgoingResponseBody): js.UndefOr[Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): js.UndefOr[Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage): js.UndefOr[Body] = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessage): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/core/messages/body.Body */ scala.Boolean = js.native
}

