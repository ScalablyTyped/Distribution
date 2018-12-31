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

