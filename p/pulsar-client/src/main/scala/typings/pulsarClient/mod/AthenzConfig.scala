package typings.pulsarClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenzConfig extends StObject {
  
  var keyId: js.UndefOr[String] = js.undefined
  
  var principalHeader: js.UndefOr[String] = js.undefined
  
  var privateKey: String
  
  var providerDomain: String
  
  var roleHeader: js.UndefOr[String] = js.undefined
  
  var tenantDomain: String
  
  var tenantService: String
  
  var tokenExpirationTime: js.UndefOr[String] = js.undefined
  
  var ztsUrl: String
}
object AthenzConfig {
  
  inline def apply(
    privateKey: String,
    providerDomain: String,
    tenantDomain: String,
    tenantService: String,
    ztsUrl: String
  ): AthenzConfig = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], providerDomain = providerDomain.asInstanceOf[js.Any], tenantDomain = tenantDomain.asInstanceOf[js.Any], tenantService = tenantService.asInstanceOf[js.Any], ztsUrl = ztsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AthenzConfig]
  }
  
  extension [Self <: AthenzConfig](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setPrincipalHeader(value: String): Self = StObject.set(x, "principalHeader", value.asInstanceOf[js.Any])
    
    inline def setPrincipalHeaderUndefined: Self = StObject.set(x, "principalHeader", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setProviderDomain(value: String): Self = StObject.set(x, "providerDomain", value.asInstanceOf[js.Any])
    
    inline def setRoleHeader(value: String): Self = StObject.set(x, "roleHeader", value.asInstanceOf[js.Any])
    
    inline def setRoleHeaderUndefined: Self = StObject.set(x, "roleHeader", js.undefined)
    
    inline def setTenantDomain(value: String): Self = StObject.set(x, "tenantDomain", value.asInstanceOf[js.Any])
    
    inline def setTenantService(value: String): Self = StObject.set(x, "tenantService", value.asInstanceOf[js.Any])
    
    inline def setTokenExpirationTime(value: String): Self = StObject.set(x, "tokenExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setTokenExpirationTimeUndefined: Self = StObject.set(x, "tokenExpirationTime", js.undefined)
    
    inline def setZtsUrl(value: String): Self = StObject.set(x, "ztsUrl", value.asInstanceOf[js.Any])
  }
}
