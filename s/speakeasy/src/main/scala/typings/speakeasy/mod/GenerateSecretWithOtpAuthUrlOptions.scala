package typings.speakeasy.mod

import typings.speakeasy.speakeasyBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateSecretWithOtpAuthUrlOptions extends GenerateSecretOptions {
  /**
    * Whether to output a Google Authenticator-compatible otpauth:// URL
    * (only returns otpauth:// URL, no QR code), defaults to false
    */
  @JSName("otpauth_url")
  var otpauth_url_GenerateSecretWithOtpAuthUrlOptions: `true` = js.native
}

object GenerateSecretWithOtpAuthUrlOptions {
  @scala.inline
  def apply(otpauth_url: `true`): GenerateSecretWithOtpAuthUrlOptions = {
    val __obj = js.Dynamic.literal(otpauth_url = otpauth_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateSecretWithOtpAuthUrlOptions]
  }
  @scala.inline
  implicit class GenerateSecretWithOtpAuthUrlOptionsOps[Self <: GenerateSecretWithOtpAuthUrlOptions] (val x: Self) extends AnyVal {
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
    def setOtpauth_url(value: `true`): Self = this.set("otpauth_url", value.asInstanceOf[js.Any])
  }
  
}

