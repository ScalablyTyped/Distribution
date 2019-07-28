package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.Anon_Error
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Parser")
@js.native
object ParserNs extends js.Object {
  def getHeader(data: js.Any, headerStart: Double): Double = js.native
  def parseHeader(message: IncomingRequestMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Anon_Error = js.native
  def parseHeader(message: IncomingResponseMessage, data: js.Any, headerStart: Double, headerEnd: Double): Boolean | Anon_Error = js.native
  /** Parse SIP Message
    * @function
    * @param {String} message SIP message.
    * @param {Object} logger object.
    * @returns {SIP.IncomingRequest|SIP.IncomingResponse|undefined}
    */
  def parseMessage(data: String, logger: Logger): js.UndefOr[IncomingRequestMessage | IncomingResponseMessage] = js.native
}

