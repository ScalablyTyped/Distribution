package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CMsgClientLogon extends StObject {
  
  /**
    * Your steam login
    */
  var account_name: String
  
  /**
    * Steam Guard code. Must be valid if provided, otherwise the logon will fail. Note that Steam Guard codes expire after a short while
    */
  var auth_code: js.UndefOr[String] = js.undefined
  
  /**
    * SHA1 hash of your sentry file.
    * If not provided, Steam will send you a sentry file through the ClientUpdateMachineAuth message
    * (unless a limit for registered sentries is reached? see https://github.com/seishun/node-steam/issues/178).
    * If no Steam Guard code is provided, the hash must be already registered with this account, otherwise it's ignored.
    * This value will be ignored if you enable 2FA.
    */
  var sha_sentryfile: js.UndefOr[String] = js.undefined
  
  /**
    * Two-factor authentication code provided by the Steam mobile application. You will have to provide this code every time you log in if your account uses 2FA.
    */
  var two_factor_code: js.UndefOr[String] = js.undefined
}
object CMsgClientLogon {
  
  inline def apply(account_name: String): CMsgClientLogon = {
    val __obj = js.Dynamic.literal(account_name = account_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CMsgClientLogon]
  }
  
  extension [Self <: CMsgClientLogon](x: Self) {
    
    inline def setAccount_name(value: String): Self = StObject.set(x, "account_name", value.asInstanceOf[js.Any])
    
    inline def setAuth_code(value: String): Self = StObject.set(x, "auth_code", value.asInstanceOf[js.Any])
    
    inline def setAuth_codeUndefined: Self = StObject.set(x, "auth_code", js.undefined)
    
    inline def setSha_sentryfile(value: String): Self = StObject.set(x, "sha_sentryfile", value.asInstanceOf[js.Any])
    
    inline def setSha_sentryfileUndefined: Self = StObject.set(x, "sha_sentryfile", js.undefined)
    
    inline def setTwo_factor_code(value: String): Self = StObject.set(x, "two_factor_code", value.asInstanceOf[js.Any])
    
    inline def setTwo_factor_codeUndefined: Self = StObject.set(x, "two_factor_code", js.undefined)
  }
}
