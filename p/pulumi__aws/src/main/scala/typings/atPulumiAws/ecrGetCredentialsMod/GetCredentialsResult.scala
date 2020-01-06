package typings.atPulumiAws.ecrGetCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsResult extends js.Object {
  val authorizationToken: String = js.native
  val expiresAt: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val proxyEndpoint: String = js.native
  val registryId: String = js.native
}

object GetCredentialsResult {
  @scala.inline
  def apply(
    authorizationToken: String,
    expiresAt: String,
    id: String,
    proxyEndpoint: String,
    registryId: String
  ): GetCredentialsResult = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], proxyEndpoint = proxyEndpoint.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCredentialsResult]
  }
}

