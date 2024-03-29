package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterIdentityOidc extends StObject {
  
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String
}
object ClusterIdentityOidc {
  
  inline def apply(issuer: String): ClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIdentityOidc]
  }
  
  extension [Self <: ClusterIdentityOidc](x: Self) {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
