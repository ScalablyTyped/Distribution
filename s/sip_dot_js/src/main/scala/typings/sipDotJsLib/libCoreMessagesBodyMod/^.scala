package typings
package sipDotJsLib.libCoreMessagesBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/messages/body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromBodyLegacy(bodyLegacy: java.lang.String): Body = js.native
  def fromBodyLegacy(bodyLegacy: sipDotJsLib.Anon_BodyContentType): Body = js.native
  def fromBodyObj(bodyObj: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj): Body = js.native
  def getBody(message: OutgoingResponseBody): js.UndefOr[Body] = js.native
  def getBody(message: sipDotJsLib.libSIPMessageMod.IncomingRequest): js.UndefOr[Body] = js.native
  def getBody(message: sipDotJsLib.libSIPMessageMod.IncomingResponse): js.UndefOr[Body] = js.native
  def getBody(message: sipDotJsLib.libSIPMessageMod.OutgoingRequest): js.UndefOr[Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/Core/messages/body.Body */ scala.Boolean = js.native
  def toBodyObj(body: Body): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj = js.native
}

