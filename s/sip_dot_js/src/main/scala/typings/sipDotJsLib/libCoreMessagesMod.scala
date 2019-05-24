package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/messages", JSImport.Namespace)
@js.native
object libCoreMessagesMod extends js.Object {
  def constructOutgoingResponse(
    message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
    options: sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.ResponseOptions
  ): sipDotJsLib.libCoreMessagesOutgoingDashResponseMod.OutgoingResponse = js.native
  def fromBodyLegacy(bodyLegacy: java.lang.String): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def fromBodyLegacy(bodyLegacy: sipDotJsLib.Anon_BodyContentType): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def fromBodyObj(bodyObj: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj): sipDotJsLib.libCoreMessagesBodyMod.Body = js.native
  def getBody(message: sipDotJsLib.libCoreMessagesBodyMod.OutgoingResponseBody): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libSIPMessageMod.IncomingRequest): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libSIPMessageMod.IncomingResponse): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def getBody(message: sipDotJsLib.libSIPMessageMod.OutgoingRequest): js.UndefOr[sipDotJsLib.libCoreMessagesBodyMod.Body] = js.native
  def isBody(body: js.Any): /* is sip.js.sip.js/lib/Core/messages/body.Body */ scala.Boolean = js.native
  def toBodyObj(body: sipDotJsLib.libCoreMessagesBodyMod.Body): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj = js.native
}

