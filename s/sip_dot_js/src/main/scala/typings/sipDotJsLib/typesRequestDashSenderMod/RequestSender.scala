package typings
package sipDotJsLib.typesRequestDashSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/request-sender", "RequestSender")
@js.native
class RequestSender protected () extends js.Object {
  def this(applicant: sipDotJsLib.typesRequestDashSenderMod.RequestSenderNs.StreamlinedApplicant, ua: sipDotJsLib.typesUaMod.UA) = this()
  var applicant: sipDotJsLib.typesRequestDashSenderMod.RequestSenderNs.StreamlinedApplicant = js.native
  var clientTransaction: js.UndefOr[
    sipDotJsLib.typesTransactionsMod.InviteClientTransaction | sipDotJsLib.typesTransactionsMod.NonInviteClientTransaction
  ] = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  def receiveResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def send(): sipDotJsLib.typesTransactionsMod.InviteClientTransaction | sipDotJsLib.typesTransactionsMod.NonInviteClientTransaction = js.native
}

