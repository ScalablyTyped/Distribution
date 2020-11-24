package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterIdentity extends js.Object {
  
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
  implicit class ClusterIdentityOps[Self <: ClusterIdentity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOidcsVarargs(value: ClusterIdentityOidc*): Self = this.set("oidcs", js.Array(value :_*))
    
    @scala.inline
    def setOidcs(value: js.Array[ClusterIdentityOidc]): Self = this.set("oidcs", value.asInstanceOf[js.Any])
  }
}
