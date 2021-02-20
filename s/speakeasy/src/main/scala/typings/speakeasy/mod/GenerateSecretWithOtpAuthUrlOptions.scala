package typings.speakeasy.mod

import typings.speakeasy.speakeasyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GenerateSecretWithOtpAuthUrlOptionsMutableBuilder[Self <: GenerateSecretWithOtpAuthUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtpauth_url(value: `true`): Self = StObject.set(x, "otpauth_url", value.asInstanceOf[js.Any])
  }
}
