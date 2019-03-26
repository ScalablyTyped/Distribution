package typings
package sipDotJsLib.typesSipDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/sip-message", "IncomingResponse")
@js.native
class IncomingResponse protected () extends IncomingMessage {
  def this(ua: sipDotJsLib.typesUaMod.UA) = this()
  var reasonPhrase: js.UndefOr[java.lang.String] = js.native
  var statusCode: js.UndefOr[scala.Double] = js.native
  var transaction: js.UndefOr[sipDotJsLib.typesTransactionsMod.ClientTransaction] = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  /**
    * Constructs and sends ACK to 2xx final response. Returns the sent ACK.
    * @param response The 2xx final response the ACK is acknowledging.
    * @param options ACK options; extra headers, body.
    */
  def ack(): OutgoingRequest = js.native
  def ack(options: sipDotJsLib.Anon_BodyExtraHeaders): OutgoingRequest = js.native
}

