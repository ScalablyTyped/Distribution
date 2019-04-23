package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/SanityCheck", JSImport.Namespace)
@js.native
object libSanityCheckMod extends js.Object {
  @JSName("SanityCheck")
  @js.native
  object SanityCheckNs extends js.Object {
    def minimumHeaders(message: sipDotJsLib.libSIPMessageMod.IncomingRequest, ua: sipDotJsLib.libUAMod.UA): scala.Boolean = js.native
    def minimumHeaders(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, ua: sipDotJsLib.libUAMod.UA): scala.Boolean = js.native
    def reply(
      statusCode: scala.Double,
      message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Unit = js.native
    def rfc3261_16_3_4(
      message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
      ua: sipDotJsLib.libUAMod.UA,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Boolean = js.native
    def rfc3261_18_1_2(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, ua: sipDotJsLib.libUAMod.UA): scala.Boolean = js.native
    def rfc3261_18_3_request(
      message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
      ua: sipDotJsLib.libUAMod.UA,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Boolean = js.native
    def rfc3261_18_3_response(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, ua: sipDotJsLib.libUAMod.UA): scala.Boolean = js.native
    def rfc3261_8_1_3_3(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, ua: sipDotJsLib.libUAMod.UA): scala.Boolean = js.native
    def rfc3261_8_2_2_1(
      message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
      ua: sipDotJsLib.libUAMod.UA,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Boolean = js.native
    /**
      * 8.2.2.2 Merged Requests
      *
      * If the request has no tag in the To header field, the UAS core MUST
      * check the request against ongoing transactions.  If the From tag,
      * Call-ID, and CSeq exactly match those associated with an ongoing
      * transaction, but the request does not match that transaction (based
      * on the matching rules in Section 17.2.3), the UAS core SHOULD
      * generate a 482 (Loop Detected) response and pass it to the server
      * transaction.
      *
      *    The same request has arrived at the UAS more than once, following
      *    different paths, most likely due to forking.  The UAS processes
      *    the first such request received and responds with a 482 (Loop
      *    Detected) to the rest of them.
      *
      * @param message Incoming request message.
      * @param ua User agent.
      * @param transport Transport.
      */
    def rfc3261_8_2_2_2(
      message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
      ua: sipDotJsLib.libUAMod.UA,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Boolean = js.native
    def sanityCheck(
      message: sipDotJsLib.libSIPMessageMod.IncomingRequest,
      ua: sipDotJsLib.libUAMod.UA,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Boolean = js.native
    def sanityCheck(
      message: sipDotJsLib.libSIPMessageMod.IncomingResponse,
      ua: sipDotJsLib.libUAMod.UA,
      transport: sipDotJsLib.libTransportMod.Transport
    ): scala.Boolean = js.native
  }
  
}

