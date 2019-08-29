package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyCredentialCreationOptions extends js.Object {
  var attestation: js.UndefOr[AttestationConveyancePreference] = js.undefined
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.undefined
  var challenge: BufferSource
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptor]] = js.undefined
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputs] = js.undefined
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters]
  var rp: PublicKeyCredentialRpEntity
  var timeout: js.UndefOr[Double] = js.undefined
  var user: PublicKeyCredentialUserEntity
}

object PublicKeyCredentialCreationOptions {
  @scala.inline
  def apply(
    challenge: BufferSource,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntity,
    attestation: AttestationConveyancePreference = null,
    authenticatorSelection: AuthenticatorSelectionCriteria = null,
    excludeCredentials: js.Array[PublicKeyCredentialDescriptor] = null,
    extensions: AuthenticationExtensionsClientInputs = null,
    timeout: Int | Double = null
  ): PublicKeyCredentialCreationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge, pubKeyCredParams = pubKeyCredParams, rp = rp, user = user)
    if (attestation != null) __obj.updateDynamic("attestation")(attestation)
    if (authenticatorSelection != null) __obj.updateDynamic("authenticatorSelection")(authenticatorSelection)
    if (excludeCredentials != null) __obj.updateDynamic("excludeCredentials")(excludeCredentials)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptions]
  }
}

