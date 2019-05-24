package typings
package sipDotJsLib.libSIPMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/SIPMessage", "IncomingRequest")
@js.native
class IncomingRequest protected () extends IncomingMessage {
  def this(ua: sipDotJsLib.libUAMod.UA) = this()
  var ruri: js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
}

