package typings.atPulumiAws.typesOutputMod.eksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterIdentity extends js.Object {
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.Array[ClusterIdentityOidc]
}

object ClusterIdentity {
  @scala.inline
  def apply(oidcs: js.Array[ClusterIdentityOidc]): ClusterIdentity = {
    val __obj = js.Dynamic.literal(oidcs = oidcs)
  
    __obj.asInstanceOf[ClusterIdentity]
  }
}

