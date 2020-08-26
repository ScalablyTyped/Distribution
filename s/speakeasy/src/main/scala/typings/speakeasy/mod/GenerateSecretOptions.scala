package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateSecretOptions extends js.Object {
  /**
    * Output a Google Authenticator otpauth:// QR code URL.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var google_auth_qr: js.UndefOr[Boolean] = js.native
  /**
    * The provider or service with which the
    * secret key is associated, defaults to ''
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * Length of the secret, defaults to 32
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The name to use with Google Authenticator, deaults to 'SecretKey'
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  var otpauth_url: js.UndefOr[Boolean] = js.native
  /**
    * Output QR code URLs for the token.
    *
    * @deprecated use your own QR code implementation to prevent
    *   leaking of secret to a third party.
    */
  var qr_codes: js.UndefOr[Boolean] = js.native
  /**
    * Whether to include symbols, defaults to false
    */
  var symbols: js.UndefOr[Boolean] = js.native
}

object GenerateSecretOptions {
  @scala.inline
  def apply(): GenerateSecretOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSecretOptions]
  }
  @scala.inline
  implicit class GenerateSecretOptionsOps[Self <: GenerateSecretOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGoogle_auth_qr(value: Boolean): Self = this.set("google_auth_qr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogle_auth_qr: Self = this.set("google_auth_qr", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOtpauth_url(value: Boolean): Self = this.set("otpauth_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtpauth_url: Self = this.set("otpauth_url", js.undefined)
    @scala.inline
    def setQr_codes(value: Boolean): Self = this.set("qr_codes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQr_codes: Self = this.set("qr_codes", js.undefined)
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
  
}

