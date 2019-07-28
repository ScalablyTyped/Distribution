package typings.speakeasy.speakeasyMod

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
  var google_auth_qr: js.UndefOr[Boolean] = js.undefined
  /**
    * The provider or service with which the
    * secret key is associated, defaults to ''
    */
  var issuer: js.UndefOr[String] = js.undefined
  /**
    * Length of the secret, defaults to 32
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * The name to use with Google Authenticator, deaults to 'SecretKey'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  var otpauth_url: js.UndefOr[Boolean] = js.undefined
  /**
    * Output QR code URLs for the token.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var qr_codes: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to include symbols, defaults to false
    */
  var symbols: js.UndefOr[Boolean] = js.undefined
}

object GenerateSecretOptions {
  @scala.inline
  def apply(
    google_auth_qr: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    length: Int | Double = null,
    name: String = null,
    otpauth_url: js.UndefOr[Boolean] = js.undefined,
    qr_codes: js.UndefOr[Boolean] = js.undefined,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): GenerateSecretOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(google_auth_qr)) __obj.updateDynamic("google_auth_qr")(google_auth_qr)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(otpauth_url)) __obj.updateDynamic("otpauth_url")(otpauth_url)
    if (!js.isUndefined(qr_codes)) __obj.updateDynamic("qr_codes")(qr_codes)
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols)
    __obj.asInstanceOf[GenerateSecretOptions]
  }
}

