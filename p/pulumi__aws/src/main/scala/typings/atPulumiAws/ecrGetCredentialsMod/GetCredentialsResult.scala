package typings.atPulumiAws.ecrGetCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsResult extends js.Object {
  val authorizationToken: String
  val expiresAt: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val proxyEndpoint: String
  val registryId: String
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
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken, expiresAt = expiresAt, id = id, proxyEndpoint = proxyEndpoint, registryId = registryId)
  
    __obj.asInstanceOf[GetCredentialsResult]
  }
}

