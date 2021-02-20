package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterIdentityOidc extends StObject {
  
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String = js.native
}
object GetClusterIdentityOidc {
  
  @scala.inline
  def apply(issuer: String): GetClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterIdentityOidc]
  }
  
  @scala.inline
  implicit class GetClusterIdentityOidcMutableBuilder[Self <: GetClusterIdentityOidc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
  }
}
