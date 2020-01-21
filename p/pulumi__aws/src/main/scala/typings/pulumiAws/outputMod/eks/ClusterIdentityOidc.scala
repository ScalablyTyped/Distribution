package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String = js.native
}

object ClusterIdentityOidc {
  @scala.inline
  def apply(issuer: String): ClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterIdentityOidc]
  }
}

