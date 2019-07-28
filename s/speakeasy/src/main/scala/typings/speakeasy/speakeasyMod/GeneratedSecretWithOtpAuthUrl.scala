package typings.speakeasy.speakeasyMod

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
    val __obj = js.Dynamic.literal(ascii = ascii, base32 = base32, google_auth_qr = google_auth_qr, hex = hex, otpauth_url = otpauth_url)
    if (qr_code_ascii != null) __obj.updateDynamic("qr_code_ascii")(qr_code_ascii)
    if (qr_code_base32 != null) __obj.updateDynamic("qr_code_base32")(qr_code_base32)
    if (qr_code_hex != null) __obj.updateDynamic("qr_code_hex")(qr_code_hex)
    __obj.asInstanceOf[GeneratedSecretWithOtpAuthUrl]
  }
}

