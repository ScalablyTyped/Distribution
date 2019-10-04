package typings.atPulumiAws.typesOutputMod.eksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterIdentity extends js.Object {
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.Array[GetClusterIdentityOidc]
}

object GetClusterIdentity {
  @scala.inline
  def apply(oidcs: js.Array[GetClusterIdentityOidc]): GetClusterIdentity = {
    val __obj = js.Dynamic.literal(oidcs = oidcs)
  
    __obj.asInstanceOf[GetClusterIdentity]
  }
}

