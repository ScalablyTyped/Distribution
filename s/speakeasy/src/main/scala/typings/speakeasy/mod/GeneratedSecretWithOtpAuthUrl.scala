package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedSecretWithOtpAuthUrl extends GeneratedSecret {
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  @JSName("otpauth_url")
  var otpauth_url_GeneratedSecretWithOtpAuthUrl: String
}

object GeneratedSecretWithOtpAuthUrl {
  @scala.inline
  def apply(
    ascii: String,
    base32: String,
    google_auth_qr: String,
    hex: String,
    otpauth_url: String,
    qr_code_ascii: String = null,
    qr_code_base32: String = null,
    qr_code_hex: String = null
  ): GeneratedSecretWithOtpAuthUrl = {
    val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], google_auth_qr = google_auth_qr.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], otpauth_url = otpauth_url.asInstanceOf[js.Any])
    if (qr_code_ascii != null) __obj.updateDynamic("qr_code_ascii")(qr_code_ascii.asInstanceOf[js.Any])
    if (qr_code_base32 != null) __obj.updateDynamic("qr_code_base32")(qr_code_base32.asInstanceOf[js.Any])
    if (qr_code_hex != null) __obj.updateDynamic("qr_code_hex")(qr_code_hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSecretWithOtpAuthUrl]
  }
}

