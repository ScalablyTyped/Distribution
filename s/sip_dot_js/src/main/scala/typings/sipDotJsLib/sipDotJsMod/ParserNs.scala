package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Parser")
@js.native
object ParserNs extends js.Object {
  def getHeader(data: js.Any, headerStart: scala.Double): scala.Double = js.native
  def parseHeader(
    message: sipDotJsLib.libCoreMod.IncomingRequestMessage,
    data: js.Any,
    headerStart: scala.Double,
    headerEnd: scala.Double
  ): scala.Boolean | sipDotJsLib.Anon_Error = js.native
  def parseHeader(
    message: sipDotJsLib.libCoreMod.IncomingResponseMessage,
    data: js.Any,
    headerStart: scala.Double,
    headerEnd: scala.Double
  ): scala.Boolean | sipDotJsLib.Anon_Error = js.native
  /** Parse SIP Message
    * @function
    * @param {String} message SIP message.
    * @param {Object} logger object.
    * @returns {SIP.IncomingRequest|SIP.IncomingResponse|undefined}
    */
  def parseMessage(data: java.lang.String, logger: sipDotJsLib.libCoreMod.Logger): js.UndefOr[
    sipDotJsLib.libCoreMod.IncomingRequestMessage | sipDotJsLib.libCoreMod.IncomingResponseMessage
  ] = js.native
}

