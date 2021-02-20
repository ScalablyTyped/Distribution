package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotpVerifyOptions extends SharedOptions {
  
  /**
    * Counter value. This should be stored by
    * the application and must be incremented for each request.
    */
  var counter: Double = js.native
  
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.native
  
  /**
    * Shared secret key
    */
  var secret: String = js.native
  
  /**
    * Passcode to validate
    */
  var token: String = js.native
  
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future against the provided
    * passcode, e.g. if W = 10, and C = 5, this function will check the
    * passcode against all One Time Passcodes between 5 and 15, inclusive,
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.native
}
object HotpVerifyOptions {
  
  @scala.inline
  def apply(counter: Double, secret: String, token: String): HotpVerifyOptions = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotpVerifyOptions]
  }
  
  @scala.inline
  implicit class HotpVerifyOptionsMutableBuilder[Self <: HotpVerifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
