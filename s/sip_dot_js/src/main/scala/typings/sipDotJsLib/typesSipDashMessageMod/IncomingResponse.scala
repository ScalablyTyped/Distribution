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
  var transaction: sipDotJsLib.typesTransactionsMod.InviteClientTransaction = js.native
}

