package typings.atPulumiAws.typesOutputMod.eks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetClusterIdentityOidc extends js.Object {
  /**
    * Issuer URL for the OpenID Connect identity provider.
    */
  var issuer: String
}

object GetClusterIdentityOidc {
  @scala.inline
  def apply(issuer: String): GetClusterIdentityOidc = {
    val __obj = js.Dynamic.literal(issuer = issuer)
  
    __obj.asInstanceOf[GetClusterIdentityOidc]
  }
}

