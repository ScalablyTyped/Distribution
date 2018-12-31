package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateSecretOptions extends js.Object {
  /**
    * Output a Google Authenticator otpauth:// QR code URL.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var google_auth_qr: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The provider or service with which the
    * secret key is associated, defaults to ''
    */
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Length of the secret, defaults to 32
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name to use with Google Authenticator, deaults to 'SecretKey'
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  var otpauth_url: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Output QR code URLs for the token.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var qr_codes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to include symbols, defaults to false
    */
  var symbols: js.UndefOr[scala.Boolean] = js.undefined
}

