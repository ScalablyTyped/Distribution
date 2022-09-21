package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginOptions extends StObject {
  
  /** Your Steam account name. */
  var accountName: String
  
  /** Your Steam Guard email code (only required if logging in with a new email auth code). */
  var authCode: js.UndefOr[String] = js.undefined
  
  /** Value of prompted captcha (only required if you have been prompted with a CAPTCHA). */
  var captcha: js.UndefOr[String] = js.undefined
  
  /** Pass `true` here to have node-steamcommunity not use the mobile login flow. This might help keep your login session alive longer, but you won't get an oAuth token in the login response. */
  var disableMobile: js.UndefOr[Boolean] = js.undefined
  
  /** Your Steam password. */
  var password: String
  
  /** Your Steam Guard value (only required if logging in with a Steam Guard authorization). */
  var steamguard: js.UndefOr[String] = js.undefined
  
  /** Your Steam Guard app code (only required if logging in with a Steam Guard app code). */
  var twoFactorCode: js.UndefOr[String] = js.undefined
}
object LoginOptions {
  
  inline def apply(accountName: String, password: String): LoginOptions = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginOptions]
  }
  
  extension [Self <: LoginOptions](x: Self) {
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
    
    inline def setCaptcha(value: String): Self = StObject.set(x, "captcha", value.asInstanceOf[js.Any])
    
    inline def setCaptchaUndefined: Self = StObject.set(x, "captcha", js.undefined)
    
    inline def setDisableMobile(value: Boolean): Self = StObject.set(x, "disableMobile", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileUndefined: Self = StObject.set(x, "disableMobile", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setSteamguard(value: String): Self = StObject.set(x, "steamguard", value.asInstanceOf[js.Any])
    
    inline def setSteamguardUndefined: Self = StObject.set(x, "steamguard", js.undefined)
    
    inline def setTwoFactorCode(value: String): Self = StObject.set(x, "twoFactorCode", value.asInstanceOf[js.Any])
    
    inline def setTwoFactorCodeUndefined: Self = StObject.set(x, "twoFactorCode", js.undefined)
  }
}
