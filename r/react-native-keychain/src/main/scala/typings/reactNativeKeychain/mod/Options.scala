package typings.reactNativeKeychain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var accessControl: js.UndefOr[ACCESS_CONTROL] = js.undefined
  
  var accessGroup: js.UndefOr[String] = js.undefined
  
  var accessible: js.UndefOr[ACCESSIBLE] = js.undefined
  
  var authenticationPrompt: js.UndefOr[String | AuthenticationPrompt] = js.undefined
  
  var authenticationType: js.UndefOr[AUTHENTICATION_TYPE] = js.undefined
  
  var rules: js.UndefOr[SECURITY_RULES] = js.undefined
  
  var securityLevel: js.UndefOr[SECURITY_LEVEL] = js.undefined
  
  var service: js.UndefOr[String] = js.undefined
  
  var storage: js.UndefOr[STORAGE_TYPE] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAccessControl(value: ACCESS_CONTROL): Self = StObject.set(x, "accessControl", value.asInstanceOf[js.Any])
    
    inline def setAccessControlUndefined: Self = StObject.set(x, "accessControl", js.undefined)
    
    inline def setAccessGroup(value: String): Self = StObject.set(x, "accessGroup", value.asInstanceOf[js.Any])
    
    inline def setAccessGroupUndefined: Self = StObject.set(x, "accessGroup", js.undefined)
    
    inline def setAccessible(value: ACCESSIBLE): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAuthenticationPrompt(value: String | AuthenticationPrompt): Self = StObject.set(x, "authenticationPrompt", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationPromptUndefined: Self = StObject.set(x, "authenticationPrompt", js.undefined)
    
    inline def setAuthenticationType(value: AUTHENTICATION_TYPE): Self = StObject.set(x, "authenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "authenticationType", js.undefined)
    
    inline def setRules(value: SECURITY_RULES): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setSecurityLevel(value: SECURITY_LEVEL): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setStorage(value: STORAGE_TYPE): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
  }
}
