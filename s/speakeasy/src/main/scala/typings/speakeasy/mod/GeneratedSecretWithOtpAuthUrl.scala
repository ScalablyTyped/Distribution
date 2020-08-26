package typings.speakeasy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratedSecretWithOtpAuthUrl extends GeneratedSecret {
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  @JSName("otpauth_url")
  var otpauth_url_GeneratedSecretWithOtpAuthUrl: String = js.native
}

object GeneratedSecretWithOtpAuthUrl {
  @scala.inline
  def apply(ascii: String, base32: String, google_auth_qr: String, hex: String, otpauth_url: String): GeneratedSecretWithOtpAuthUrl = {
    val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], google_auth_qr = google_auth_qr.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], otpauth_url = otpauth_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSecretWithOtpAuthUrl]
  }
  @scala.inline
  implicit class GeneratedSecretWithOtpAuthUrlOps[Self <: GeneratedSecretWithOtpAuthUrl] (val x: Self) extends AnyVal {
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
    def setOtpauth_url(value: String): Self = this.set("otpauth_url", value.asInstanceOf[js.Any])
  }
  
}

