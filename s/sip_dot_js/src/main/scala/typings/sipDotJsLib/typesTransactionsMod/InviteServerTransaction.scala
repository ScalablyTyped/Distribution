package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "InviteServerTransaction")
@js.native
class InviteServerTransaction protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest, ua: sipDotJsLib.typesUaMod.UA) = this()
  var I: js.UndefOr[_] = js.native
  var id: java.lang.String = js.native
  var kind: java.lang.String = js.native
  var lastResponse: java.lang.String = js.native
  var request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest = js.native
  var state: js.UndefOr[sipDotJsLib.typesEnumsMod.TransactionStatus] = js.native
  var transport: js.UndefOr[sipDotJsLib.typesTransportMod.Transport] = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def receiveResponse(statusCode: scala.Double, response: java.lang.String): js.Promise[scala.Unit] = js.native
  def stateChanged(state: sipDotJsLib.typesEnumsMod.TransactionStatus): scala.Unit = js.native
  def timer_I(): scala.Unit = js.native
}

