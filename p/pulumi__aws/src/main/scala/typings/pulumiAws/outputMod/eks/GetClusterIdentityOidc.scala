package typings.pulumiAws.outputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String = js.native
}

object GetClusterIdentityOidc {
  @scala.inline
  def apply(issuer: String): GetClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetClusterIdentityOidc]
  }
}

