package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JwtAuthorizer extends StObject {
  
  var audience: js.Array[String]
  
  var identitySource: String
  
  var issuerUrl: String
}
object JwtAuthorizer {
  
  inline def apply(audience: js.Array[String], identitySource: String, issuerUrl: String): JwtAuthorizer = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], identitySource = identitySource.asInstanceOf[js.Any], issuerUrl = issuerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwtAuthorizer]
  }
  
  extension [Self <: JwtAuthorizer](x: Self) {
    
    inline def setAudience(value: js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value :_*))
    
    inline def setIdentitySource(value: String): Self = StObject.set(x, "identitySource", value.asInstanceOf[js.Any])
    
    inline def setIssuerUrl(value: String): Self = StObject.set(x, "issuerUrl", value.asInstanceOf[js.Any])
  }
}
