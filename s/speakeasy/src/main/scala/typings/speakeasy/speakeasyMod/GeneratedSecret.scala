package typings.speakeasy.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedSecret extends js.Object {
  /**
    * ASCII representation of the secret
    */
  var ascii: String
  /**
    * Base32 representation of the secret
    */
  var base32: String
  /**
    * URL for the Google Authenticator otpauth
    * URL's QR code.
    *
    * @deprecated use a separate QR code library
    */
  var google_auth_qr: String
  /**
    * Hex representation of the secret
    */
  var hex: String
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  var otpauth_url: js.UndefOr[String] = js.undefined
  /**
    * URL for the QR code for the ASCII secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_ascii: js.UndefOr[String] = js.undefined
  /**
    * URL for the QR code for the base32 secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_base32: js.UndefOr[String] = js.undefined
  /**
    * URL for the QR code for the hex secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_hex: js.UndefOr[String] = js.undefined
}

object GeneratedSecret {
  @scala.inline
  def apply(
    ascii: String,
    base32: String,
    google_auth_qr: String,
    hex: String,
    otpauth_url: String = null,
    qr_code_ascii: String = null,
    qr_code_base32: String = null,
    qr_code_hex: String = null
  ): GeneratedSecret = {
    val __obj = js.Dynamic.literal(ascii = ascii, base32 = base32, google_auth_qr = google_auth_qr, hex = hex)
    if (otpauth_url != null) __obj.updateDynamic("otpauth_url")(otpauth_url)
    if (qr_code_ascii != null) __obj.updateDynamic("qr_code_ascii")(qr_code_ascii)
    if (qr_code_base32 != null) __obj.updateDynamic("qr_code_base32")(qr_code_base32)
    if (qr_code_hex != null) __obj.updateDynamic("qr_code_hex")(qr_code_hex)
    __obj.asInstanceOf[GeneratedSecret]
  }
}

