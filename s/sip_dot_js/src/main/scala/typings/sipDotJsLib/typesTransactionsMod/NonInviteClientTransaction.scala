package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "NonInviteClientTransaction")
@js.native
class NonInviteClientTransaction protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(requestSender: sipDotJsLib.typesRequestDashSenderMod.RequestSender, request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest, transport: sipDotJsLib.typesTransportMod.Transport) = this()
  var id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  var state: js.UndefOr[sipDotJsLib.typesEnumsMod.TransactionStatus] = js.native
  var transport: sipDotJsLib.typesTransportMod.Transport = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def receiveResponse(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def stateChanged(state: sipDotJsLib.typesEnumsMod.TransactionStatus): scala.Unit = js.native
}

