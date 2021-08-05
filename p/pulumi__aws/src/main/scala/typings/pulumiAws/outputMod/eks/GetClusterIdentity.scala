package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterIdentity extends StObject {
  
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.Array[GetClusterIdentityOidc]
}
object GetClusterIdentity {
  
  inline def apply(oidcs: js.Array[GetClusterIdentityOidc]): GetClusterIdentity = {
    val __obj = js.Dynamic.literal(oidcs = oidcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterIdentity]
  }
  
  extension [Self <: GetClusterIdentity](x: Self) {
    
    inline def setOidcs(value: js.Array[GetClusterIdentityOidc]): Self = StObject.set(x, "oidcs", value.asInstanceOf[js.Any])
    
    inline def setOidcsVarargs(value: GetClusterIdentityOidc*): Self = StObject.set(x, "oidcs", js.Array(value :_*))
  }
}
