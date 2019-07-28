package typings.speakeasy.speakeasyMod

import typings.speakeasy.speakeasyNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateSecretWithOtpAuthUrlOptions extends GenerateSecretOptions {
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  @JSName("otpauth_url")
  var otpauth_url_GenerateSecretWithOtpAuthUrlOptions: `true`
}

object GenerateSecretWithOtpAuthUrlOptions {
  @scala.inline
  def apply(
    otpauth_url: `true`,
    google_auth_qr: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    length: Int | Double = null,
    name: String = null,
    qr_codes: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): GenerateSecretWithOtpAuthUrlOptions = {
    val __obj = js.Dynamic.literal(otpauth_url = otpauth_url)
    if (!js.isUndefined(google_auth_qr)) __obj.updateDynamic("google_auth_qr")(google_auth_qr)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(qr_codes)) __obj.updateDynamic("qr_codes")(qr_codes)
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols)
    __obj.asInstanceOf[GenerateSecretWithOtpAuthUrlOptions]
  }
}

