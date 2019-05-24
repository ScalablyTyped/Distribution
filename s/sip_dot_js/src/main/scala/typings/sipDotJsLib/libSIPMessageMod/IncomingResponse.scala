package typings
package sipDotJsLib.libSIPMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/SIPMessage", "IncomingResponse")
@js.native
class IncomingResponse protected () extends IncomingMessage {
  def this(ua: sipDotJsLib.libUAMod.UA) = this()
  var reasonPhrase: js.UndefOr[java.lang.String] = js.native
  var statusCode: js.UndefOr[scala.Double] = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
}

