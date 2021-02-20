package typings.pulumiAws.outputMod.eks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetClusterIdentity extends StObject {
  
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.Array[GetClusterIdentityOidc] = js.native
}
object GetClusterIdentity {
  
  @scala.inline
  def apply(oidcs: js.Array[GetClusterIdentityOidc]): GetClusterIdentity = {
    val __obj = js.Dynamic.literal(oidcs = oidcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterIdentity]
  }
  
  @scala.inline
  implicit class GetClusterIdentityMutableBuilder[Self <: GetClusterIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOidcs(value: js.Array[GetClusterIdentityOidc]): Self = StObject.set(x, "oidcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcsVarargs(value: GetClusterIdentityOidc*): Self = StObject.set(x, "oidcs", js.Array(value :_*))
  }
}
