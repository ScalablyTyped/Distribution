package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/parser", JSImport.Namespace)
@js.native
object typesParserMod extends js.Object {
  @JSName("Parser")
  @js.native
  object ParserNs extends js.Object {
    def getHeader(data: js.Any, headerStart: scala.Double): scala.Double = js.native
    def parseHeader(
      message: sipDotJsLib.typesSipDashMessageMod.IncomingRequest,
      data: js.Any,
      headerStart: scala.Double,
      headerEnd: scala.Double
    ): scala.Boolean | js.Any = js.native
    def parseHeader(
      message: sipDotJsLib.typesSipDashMessageMod.IncomingResponse,
      data: js.Any,
      headerStart: scala.Double,
      headerEnd: scala.Double
    ): scala.Boolean | js.Any = js.native
    def parseMessage(data: java.lang.String, ua: sipDotJsLib.typesUaMod.UA): js.UndefOr[
        sipDotJsLib.typesSipDashMessageMod.IncomingRequest | sipDotJsLib.typesSipDashMessageMod.IncomingResponse
      ] = js.native
  }
  
}

