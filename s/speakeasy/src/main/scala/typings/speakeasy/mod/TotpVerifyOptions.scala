package typings.speakeasy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotpVerifyOptions
  extends StObject
     with SharedOptions {
  
  /**
    * The counter value, calculated from time by default
    */
  var counter: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of digits for the one-time passcode, defaults to 6
    */
  var digits: js.UndefOr[Double] = js.undefined
  
  /**
    * Initial time since the UNIX epoch from which to calculate the counter value,
    * defaults to 0 (no offset).
    */
  var epoch: js.UndefOr[Double] = js.undefined
  
  /**
    * Shared secret key
    */
  var secret: String
  
  /**
    * Time step in seconds, defaults to 30
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * Time in seconds with which to calculate
    * counter value, defaults to `Date.now() / 1000`.
    */
  var time: js.UndefOr[Double] = js.undefined
  
  /**
    * Passcode to validate
    */
  var token: String
  
  /**
    * The allowable margin for the counter.
    * The function will check "W" codes in the future and the past against the
    * provided passcode, e.g. if W = 5, and C = 1000, this function will check
    * the passcode against all One Time Passcodes between 995 and 1005, inclusive
    * defaults to 0
    */
  var window: js.UndefOr[Double] = js.undefined
}
object TotpVerifyOptions {
  
  @scala.inline
  def apply(secret: String, token: String): TotpVerifyOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotpVerifyOptions]
  }
  
  @scala.inline
  implicit class TotpVerifyOptionsMutableBuilder[Self <: TotpVerifyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    @scala.inline
    def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    @scala.inline
    def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
