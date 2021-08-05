package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterIdentityOidc extends StObject {
  
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String
}
object GetClusterIdentityOidc {
  
  inline def apply(issuer: String): GetClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterIdentityOidc]
  }
  
  extension [Self <: GetClusterIdentityOidc](x: Self) {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
