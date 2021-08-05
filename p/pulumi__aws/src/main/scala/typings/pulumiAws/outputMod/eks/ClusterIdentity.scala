package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterIdentity extends StObject {
  
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.Array[ClusterIdentityOidc]
}
object ClusterIdentity {
  
  inline def apply(oidcs: js.Array[ClusterIdentityOidc]): ClusterIdentity = {
    val __obj = js.Dynamic.literal(oidcs = oidcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIdentity]
  }
  
  extension [Self <: ClusterIdentity](x: Self) {
    
    inline def setOidcs(value: js.Array[ClusterIdentityOidc]): Self = StObject.set(x, "oidcs", value.asInstanceOf[js.Any])
    
    inline def setOidcsVarargs(value: ClusterIdentityOidc*): Self = StObject.set(x, "oidcs", js.Array(value :_*))
  }
}
