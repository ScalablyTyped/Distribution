package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratedSecret extends StObject {
  
  /**
    * ASCII representation of the secret
    */
  var ascii: String = js.native
  
  /**
    * Base32 representation of the secret
    */
  var base32: String = js.native
  
  /**
    * URL for the Google Authenticator otpauth
    * URL's QR code.
    *
    * @deprecated use a separate QR code library
    */
  var google_auth_qr: String = js.native
  
  /**
    * Hex representation of the secret
    */
  var hex: String = js.native
  
  /**
    * Google Authenticator-compatible otpauth URL.
    */
  var otpauth_url: js.UndefOr[String] = js.native
  
  /**
    * URL for the QR code for the ASCII secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_ascii: js.UndefOr[String] = js.native
  
  /**
    * URL for the QR code for the base32 secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_base32: js.UndefOr[String] = js.native
  
  /**
    * URL for the QR code for the hex secret.
    *
    * @deprecated use a separate QR code library
    */
  var qr_code_hex: js.UndefOr[String] = js.native
}
object GeneratedSecret {
  
  @scala.inline
  def apply(ascii: String, base32: String, google_auth_qr: String, hex: String): GeneratedSecret = {
    val __obj = js.Dynamic.literal(ascii = ascii.asInstanceOf[js.Any], base32 = base32.asInstanceOf[js.Any], google_auth_qr = google_auth_qr.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedSecret]
  }
  
  @scala.inline
  implicit class GeneratedSecretMutableBuilder[Self <: GeneratedSecret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscii(value: String): Self = StObject.set(x, "ascii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase32(value: String): Self = StObject.set(x, "base32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogle_auth_qr(value: String): Self = StObject.set(x, "google_auth_qr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtpauth_url(value: String): Self = StObject.set(x, "otpauth_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtpauth_urlUndefined: Self = StObject.set(x, "otpauth_url", js.undefined)
    
    @scala.inline
    def setQr_code_ascii(value: String): Self = StObject.set(x, "qr_code_ascii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQr_code_asciiUndefined: Self = StObject.set(x, "qr_code_ascii", js.undefined)
    
    @scala.inline
    def setQr_code_base32(value: String): Self = StObject.set(x, "qr_code_base32", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQr_code_base32Undefined: Self = StObject.set(x, "qr_code_base32", js.undefined)
    
    @scala.inline
    def setQr_code_hex(value: String): Self = StObject.set(x, "qr_code_hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQr_code_hexUndefined: Self = StObject.set(x, "qr_code_hex", js.undefined)
  }
}
