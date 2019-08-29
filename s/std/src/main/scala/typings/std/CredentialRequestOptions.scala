package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialRequestOptions extends js.Object {
  var mediation: js.UndefOr[CredentialMediationRequirement] = js.undefined
  var publicKey: js.UndefOr[PublicKeyCredentialRequestOptions] = js.undefined
  var signal: js.UndefOr[AbortSignal] = js.undefined
}

object CredentialRequestOptions {
  @scala.inline
  def apply(
    mediation: CredentialMediationRequirement = null,
    publicKey: PublicKeyCredentialRequestOptions = null,
    signal: AbortSignal = null
  ): CredentialRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (mediation != null) __obj.updateDynamic("mediation")(mediation)
    if (publicKey != null) __obj.updateDynamic("publicKey")(publicKey)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[CredentialRequestOptions]
  }
}

