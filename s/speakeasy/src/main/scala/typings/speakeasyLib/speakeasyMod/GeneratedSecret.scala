package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeneratedSecret extends js.Object {
  /**
    * ASCII representation of the secret
    */
  var ascii: java.lang.String
  /**
    * Base32 representation of the secret
    */
  var base32: java.lang.String
  /**
    * URL for the Google Authenticator otpauth
    * URL's QR code.
    *
    * @deprecated use a separate QR code library
    */
  var google_auth_qr: java.lang.String
  /**
    * Hex representation of the secret
    */
  var hex: java.lang.String
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  var otpauth_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL for the QR code for the ASCII secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_ascii: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL for the QR code for the base32 secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_base32: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL for the QR code for the hex secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_hex: js.UndefOr[java.lang.String] = js.undefined
}

object GeneratedSecret {
  @scala.inline
  def apply(
    ascii: java.lang.String,
    base32: java.lang.String,
    google_auth_qr: java.lang.String,
    hex: java.lang.String,
    otpauth_url: java.lang.String = null,
    qr_code_ascii: java.lang.String = null,
    qr_code_base32: java.lang.String = null,
    qr_code_hex: java.lang.String = null
  ): GeneratedSecret = {
    val __obj = js.Dynamic.literal(ascii = ascii, base32 = base32, google_auth_qr = google_auth_qr, hex = hex)
    if (otpauth_url != null) __obj.updateDynamic("otpauth_url")(otpauth_url)
    if (qr_code_ascii != null) __obj.updateDynamic("qr_code_ascii")(qr_code_ascii)
    if (qr_code_base32 != null) __obj.updateDynamic("qr_code_base32")(qr_code_base32)
    if (qr_code_hex != null) __obj.updateDynamic("qr_code_hex")(qr_code_hex)
    __obj.asInstanceOf[GeneratedSecret]
  }
}

