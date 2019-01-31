package typings
package sipDotJsLib.typesDigestDashAuthenticationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/digest-authentication", "DigestAuthentication")
@js.native
class DigestAuthentication protected () extends js.Object {
  def this(ua: sipDotJsLib.typesUaMod.UA) = this()
  var stale: js.UndefOr[scala.Boolean] = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def authenticate(request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest, challenge: js.Any): scala.Boolean = js.native
  def authenticate(
    request: sipDotJsLib.typesSipDashMessageMod.OutgoingRequest,
    challenge: js.Any,
    body: java.lang.String
  ): scala.Boolean = js.native
}

