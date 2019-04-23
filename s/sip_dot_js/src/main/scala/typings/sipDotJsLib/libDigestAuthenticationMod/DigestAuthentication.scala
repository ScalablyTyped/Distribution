package typings
package sipDotJsLib.libDigestAuthenticationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/DigestAuthentication", "DigestAuthentication")
@js.native
class DigestAuthentication protected () extends js.Object {
  def this(ua: sipDotJsLib.libUAMod.UA) = this()
  var algorithm: js.Any = js.native
  /**
    * Generate Digest 'response' value.
    * @private
    */
  var calculateResponse: js.Any = js.native
  var cnonce: js.Any = js.native
  var logger: js.Any = js.native
  var method: js.Any = js.native
  var nc: js.Any = js.native
  var ncHex: js.Any = js.native
  var nonce: js.Any = js.native
  var opaque: js.Any = js.native
  var password: js.Any = js.native
  var qop: js.Any = js.native
  var realm: js.Any = js.native
  var response: js.Any = js.native
  var stale: js.UndefOr[scala.Boolean] = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  /**
    * Generate the 'nc' value as required by Digest in this.ncHex by reading this.nc.
    * @private
    */
  var updateNcHex: js.Any = js.native
  var uri: js.Any = js.native
  var username: js.Any = js.native
  /**
    * Performs Digest authentication given a SIP request and the challenge
    * received in a response to that request.
    * Returns true if credentials were successfully generated, false otherwise.
    *
    * @param {SIP.OutgoingRequest} request
    * @param {Object} challenge
    */
  def authenticate(request: sipDotJsLib.libSIPMessageMod.OutgoingRequest, challenge: js.Any): scala.Boolean = js.native
  def authenticate(request: sipDotJsLib.libSIPMessageMod.OutgoingRequest, challenge: js.Any, body: java.lang.String): scala.Boolean = js.native
}

