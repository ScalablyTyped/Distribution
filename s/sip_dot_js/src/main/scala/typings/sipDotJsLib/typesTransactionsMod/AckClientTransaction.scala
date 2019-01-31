package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/transactions", "AckClientTransaction")
@js.native
class AckClientTransaction protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(requestSender: sipDotJsLib.typesRequestDashSenderMod.RequestSender, request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest, transport: sipDotJsLib.typesTransportMod.Transport) = this()
  var id: java.lang.String = js.native
  var transport: sipDotJsLib.typesTransportMod.Transport = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def send(): scala.Unit = js.native
}

