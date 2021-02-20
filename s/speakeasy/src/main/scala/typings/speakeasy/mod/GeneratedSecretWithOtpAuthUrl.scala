package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class GeneratedSecretWithOtpAuthUrlMutableBuilder[Self <: GeneratedSecretWithOtpAuthUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtpauth_url(value: String): Self = StObject.set(x, "otpauth_url", value.asInstanceOf[js.Any])
  }
}
