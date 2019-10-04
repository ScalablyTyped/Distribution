package typings.atPulumiAws.typesOutputMod.eksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String
}

object ClusterIdentityOidc {
  @scala.inline
  def apply(issuer: String): ClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer)
  
    __obj.asInstanceOf[ClusterIdentityOidc]
  }
}

