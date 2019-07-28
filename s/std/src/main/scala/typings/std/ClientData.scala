package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientData extends js.Object {
  var challenge: java.lang.String
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  var hashAlg: java.lang.String | Algorithm
  var origin: java.lang.String
  var rpId: java.lang.String
  var tokenBinding: js.UndefOr[java.lang.String] = js.undefined
}

object ClientData {
  @scala.inline
  def apply(
    challenge: java.lang.String,
    hashAlg: java.lang.String | Algorithm,
    origin: java.lang.String,
    rpId: java.lang.String,
    extensions: WebAuthnExtensions = null,
    tokenBinding: java.lang.String = null
  ): ClientData = {
    val __obj = js.Dynamic.literal(challenge = challenge, hashAlg = hashAlg.asInstanceOf[js.Any], origin = origin, rpId = rpId)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (tokenBinding != null) __obj.updateDynamic("tokenBinding")(tokenBinding)
    __obj.asInstanceOf[ClientData]
  }
}

