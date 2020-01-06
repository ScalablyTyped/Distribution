package typings.atPulumiAws.typesOutputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

