package typings.speakeasy.mod

import typings.speakeasy.speakeasyStrings.htop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtpauthURLOptions
  extends StObject
     with SharedOptions {
  
  /**
    * The initial counter value, required for HOTP.
    */
  var counter: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of digits for the one-time passcode. Currently ignored
    * by Google Authenticator, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.undefined
  
  /**
    * The provider or service with which the secret key is associated.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * Used to identify the account with which the secret key is associated,
    * e.g. the user's email address.
    */
  var label: String
  
  /**
    * The length of time for which a TOTP code will be valid, in seconds.
    * Currently ignored by Google Authenticator, defaults to 30
    */
  var period: js.UndefOr[Double] = js.undefined
  
  /**
    * Shared secret key
    */
  var secret: String
  
  /**
    * Either 'hotp' or 'totp', defaults to 'totp'
    */
  var `type`: js.UndefOr[htop | typings.speakeasy.speakeasyStrings.totp] = js.undefined
}
object OtpauthURLOptions {
  
  inline def apply(label: String, secret: String): OtpauthURLOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtpauthURLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtpauthURLOptions] (val x: Self) extends AnyVal {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setType(value: htop | typings.speakeasy.speakeasyStrings.totp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
