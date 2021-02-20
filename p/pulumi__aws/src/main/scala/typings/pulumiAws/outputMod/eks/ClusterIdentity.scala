package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterIdentity extends StObject {
  
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.Array[ClusterIdentityOidc] = js.native
}
object ClusterIdentity {
  
  @scala.inline
  def apply(oidcs: js.Array[ClusterIdentityOidc]): ClusterIdentity = {
    val __obj = js.Dynamic.literal(oidcs = oidcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIdentity]
  }
  
  @scala.inline
  implicit class ClusterIdentityMutableBuilder[Self <: ClusterIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOidcs(value: js.Array[ClusterIdentityOidc]): Self = StObject.set(x, "oidcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcsVarargs(value: ClusterIdentityOidc*): Self = StObject.set(x, "oidcs", js.Array(value :_*))
  }
}
