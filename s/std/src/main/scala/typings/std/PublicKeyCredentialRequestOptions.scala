package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialRequestOptions extends js.Object {
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var challenge: BufferSource
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}

object PublicKeyCredentialRequestOptions {
  @scala.inline
  def apply(
    challenge: BufferSource,
    allowCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    rpId: java.lang.String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    userVerification: UserVerificationRequirement = null
  ): PublicKeyCredentialRequestOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    if (allowCredentials != null) __obj.updateDynamic("allowCredentials")(allowCredentials.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (rpId != null) __obj.updateDynamic("rpId")(rpId.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptions]
  }
}

